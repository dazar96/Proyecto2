package logica;

import java.util.ArrayList;
import java.util.Date;



public class Sede {
	private String nombre;
	private String ubicacion;
	private Date diasHorasAtencion;
	private ArrayList<Vehiculo> inventarioVehiculos;
	
	
	
	//Getters and Setters
	public ArrayList<Vehiculo> getInventarioVehiculos() {
		return inventarioVehiculos;
	}
	
	public void setInventarioVehiculos(ArrayList<Vehiculo> inventarioVehiculos) {
		this.inventarioVehiculos = inventarioVehiculos;
	}

	public String getNombre() {
		return nombre;
	}
	
	

	
}
