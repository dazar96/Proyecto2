package logica;

import java.util.Date;

public class Vehiculo {
	private int idVehiculo;
	private Sede Actual;
	private int capacidad;
	private String placa;
	private String modelo;
	private String color;
	private String tipoTransmision;
	private CategoriaVehiculo categoria;
	private Date fechaInicio;
	private Date fechaFinal;
	
	
	public Vehiculo() {
		fechaFinal=null;
		fechaInicio= null;
	}
	
	
	
	//Getters and Setters
	
	public CategoriaVehiculo getCategoria() {
		return categoria;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFinal() {
		return fechaFinal;
	}
	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}
	
	
	
	
}
