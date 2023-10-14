package logica;

public class Vehiculo {
	private int idVehiculo;
	private boolean alquilado;
	private String sedeActual;
	private int capacidad;
	private String placa;
	private String modelo;
	private String color;
	private String tipoTransmision;
	
	public Vehiculo(int idVehiculo, boolean alquilado,String sedeActual,int capacidad, String placa, String modelo, String color, String tipoTransmision )
	{
		this.idVehiculo = idVehiculo;
		this.alquilado = alquilado;
		this.sedeActual = sedeActual;
		this.capacidad = capacidad;
		this.placa = placa;
		this.modelo = modelo;
		this.color = color;
		this.tipoTransmision = tipoTransmision;
	}
	
	
	
}
