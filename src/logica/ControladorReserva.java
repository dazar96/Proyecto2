package logica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import logica.Tarifario;

public class ControladorReserva {
	
	
	public Vehiculo ReservaVehiculo(String categoria , ArrayList<CategoriaVehiculo> categoriaVehiculo , String nombreSede ,String FechaI,String FechaF ,ArrayList<Sede> listaSedes) throws ParseException{
		boolean encontrado = false;
		 for (CategoriaVehiculo  categorias :categoriaVehiculo) {
			 if(categoria.equals(categorias.getNombreCategoria())) {
				 categoria = categorias.getNombreCategoria();
				 encontrado = true;
				 break;
				 }
			 
		 } if(encontrado) {
			 
			 for (Sede sede : listaSedes) {
				 if(sede.getNombre().equals(nombreSede)) {
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
		
	} public  Boolean crearReservaCliente(Cliente cliente,Vehiculo vehiculo,ArrayList<Sede> sedes,String sedeDevuelta,boolean aditional) {
		boolean find = false;
		for (Sede sede : sedes) {
			if(sede.getNombre().equals(sedeDevuelta)) {
				find = true;
			}
		}
		if(find!=true) {
			return false;
		}
		
		String nombreCategoriaString = vehiculo.getCategoria().getNombreCategoria();
		int precioCategoria = vehiculo.getCategoria().getTarifaExtra();
		long tiempodiferencia=vehiculo.getFechaInicio().getTime()-vehiculo.getFechaFinal().getTime();
		long diasDiferencia = tiempodiferencia / (24 * 60 * 60 * 1000);
		int numeroDias = (int) (diasDiferencia + 1);
		
		
		cliente.crearReserva();
		
		return true;
	}
}
