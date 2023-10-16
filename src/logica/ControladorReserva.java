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
	public Vehiculo ReservaVehiculo(String categoria , ArrayList<CategoriaVehiculo> categoriaVehiculo , String nombreSede ,Date fechaInicio,Date fechaFinal ,ArrayList<Sede> listaSedes) throws ParseException{
		boolean encontrado = false;
		 for (CategoriaVehiculo  categorias :categoriaVehiculo) {
			 if(categoria.equalsIgnoreCase(categorias.getNombreCategoria())) {
				 categoria = categorias.getNombreCategoria();
				 encontrado = true;
				 break;
				 }
			 
		 } if(encontrado) {
			 
			  		Sede sede = buscarSedePorNombre(nombreSede, listaSedes);
			  			if(sede==null)
			  				return null;
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
							
		 				
					}
				 
			 
			 
	
		 }else {
			return null;
		}
		return null;
		//Calcula total del precio de la reserva sin seguro
	
	} public  Double ValorReservaSinSeguro(Vehiculo vehiculo,ArrayList<Sede> sedes,String sedeDevuelta) {
		Tarifario tarifario = new Tarifario();
		Sede sede = buscarSedePorNombre(sedeDevuelta, sedes);
		if(sede==null) 
			return null;
		int precioCategoria = vehiculo.getCategoria().getTarifaDiaria();
		long tiempodiferencia=vehiculo.getFechaInicio().getTime()-vehiculo.getFechaFinal().getTime();
		long diasDiferencia = tiempodiferencia / (24 * 60 * 60 * 1000);
		int numeroDias = (int) (diasDiferencia + 1);
		if(sedeDevuelta.equalsIgnoreCase(vehiculo.getSedeActual().getNombre())) {
			tarifario.setValorExtraOtraSede(0);
		}
		if(!tarifario.TemporadaAlta(vehiculo.getFechaInicio(), vehiculo.getFechaFinal())) {
			tarifario.setAumentoTemporada(0);
		}
		 Double tarifaTotalSinSeguro=(precioCategoria*numeroDias)+tarifario.getAumentoTemporada()+tarifario.getValorExtraOtraSede();
		 
		 
		 
		 
		
		return tarifaTotalSinSeguro;
	} //cliente.crearReserva();
	public Reserva CrearReservaCliente(Cliente cliente,double valorSinSeguro ,
			AdministradorGeneral administradorGeneral,boolean conSeguro,
			Vehiculo vehiculo,String sedeDevolver,String sederecoger,ArrayList<Seguro> seguros,ArrayList<Integer> posiciones) {
		double precioSeguro = administradorGeneral.administrarSeguro(seguros,posiciones,conSeguro,vehiculo);
		double precioTotal = valorSinSeguro + precioSeguro;
		double precio30 = precioTotal*0.3;
		double precioRestante = precioTotal*0.7;
		Reserva reserva = cliente.crearReserva(vehiculo,vehiculo.getFechaInicio(), vehiculo.getFechaFinal(), precio30, precioRestante,sederecoger,sedeDevolver);
		return reserva;
	}
	
	public Vehiculo alquilarVehiculo() {
		return null;
	}
	
	
	public double getTarifaConductorExtra() {
		return tarifario.getValorExtra2Conduc();
	}
	public Sede buscarSedePorNombre(String nombreSede, ArrayList<Sede> sedes) {
		Sede sedeABuscarSede=null;	
		for (Sede sede : sedes) {
			if(sede.getNombre().equalsIgnoreCase(nombreSede)) {
				sedeABuscarSede = sede;
				return sedeABuscarSede;
			}
		}return sedeABuscarSede;
	}
	
}
