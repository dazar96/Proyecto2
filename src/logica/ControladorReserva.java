package logica;

import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import logica.Tarifario;
import logica.Vehiculo;

public class ControladorReserva {
	
	private Tarifario tarifario;
	
	
	//Verificar datos ingresados por el usuario
	public Vehiculo ReservaVehiculo(String categoria , ArrayList<CategoriaVehiculo> categoriaVehiculo , String nombreSede ,String FechaI,String FechaF ,ArrayList<Sede> listaSedes) throws ParseException{
		boolean encontrado = false;
		 for (CategoriaVehiculo  categorias :categoriaVehiculo) {
			 if(categoria.equalsIgnoreCase(categorias.getNombreCategoria())) {
				 categoria = categorias.getNombreCategoria();
				 encontrado = true;
				 break;
				 }
			 
		 } if(encontrado) {
			 
			 for (Sede sede : listaSedes) {
				 if(sede.getNombre().equalsIgnoreCase(nombreSede)) {
					 SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
					 Date fechaInicio = format.parse(FechaI);
					 Date fechaFinal = format.parse(FechaF);
		                for	(int i =0; i<sede.getInventarioVehiculos().size();i++)	{
		                	 Vehiculo coche = sede.getInventarioVehiculos().get(i);              
						if((coche.getCategoria().getNombreCategoria().equals(categoria))) 
							if( coche.getFechaInicio() == null ) {
								coche.setFechaInicio(fechaInicio); // Falta añadir que tampoco esten en mantenimiento o lavandose
								coche.setFechaFinal(fechaFinal);
								return coche;
							}
							else if( fechaInicio.after(coche.getFechaFinal())){
								coche.setFechaInicio(fechaInicio);
								coche.setFechaFinal(fechaFinal);
								return coche;
							}
							
		 				
					}break;
				 }
			 }
			 
	
		 }else {
			return null;
		}
		return null;
		//Calcula total del precio de la reserva sin seguro
	
	} public  double ValorReservaSinSeguro(Vehiculo vehiculo,ArrayList<Sede> sedes,String sedeDevuelta,boolean aditional) {
		Tarifario tarifario = new Tarifario();
		boolean find = false;
		for (Sede sede : sedes) {
			if(sede.getNombre().equals(sedeDevuelta)) {
				find = true;
			}
		}
		if(find!=true) {
			return 0;
		}
		
		int precioCategoria = vehiculo.getCategoria().getTarifaDiaria();
		long tiempodiferencia=vehiculo.getFechaInicio().getTime()-vehiculo.getFechaFinal().getTime();
		long diasDiferencia = tiempodiferencia / (24 * 60 * 60 * 1000);
		int numeroDias = (int) (diasDiferencia + 1);
		if(sedeDevuelta.equalsIgnoreCase(vehiculo.getSedeActual().getNombre())) {
			tarifario.setValorExtraOtraSede(0);
		}
		if(aditional!=true) {
			tarifario.setValorExtra2Conduc(0);
		} 
		if(!tarifario.TemporadaAlta(vehiculo.getFechaInicio(), vehiculo.getFechaFinal())) {
			tarifario.setAumentoTemporada(0);
		}
		 double tarifaTotalSinSeguro=(precioCategoria*numeroDias)+tarifario.getAumentoTemporada()+tarifario.getValorExtra2Conduc()+tarifario.getValorExtraOtraSede();
		 
		 
		 
		 
		
		return tarifaTotalSinSeguro;
	} //cliente.crearReserva();
	public Reserva CrearReservaCliente(Cliente cliente,double valorSinSeguro ,AdministradorGeneral administradorGeneral,boolean conSeguro,Vehiculo vehiculo,String sedeDevolver,String sederecoger) {
		double precioSeguro = administradorGeneral.administrarSeguro(conSeguro,vehiculo);
		double precioTotal = valorSinSeguro + precioSeguro;
		double precio30 = precioTotal*0.3;
		double precioRestante = precioTotal*0.7;
		Reserva reserva = cliente.crearReserva(vehiculo.getCategoria().getNombreCategoria(),vehiculo.getFechaInicio(), vehiculo.getFechaFinal(), precio30, precioRestante,sederecoger,sedeDevolver);
		return reserva;
	}
}
