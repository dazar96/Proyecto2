package logica;

import java.util.Date;
import java.util.Set;

public class Vehiculo {
	private int idVehiculo;
	private Sede Actual;
	private boolean alquilado; //merge aca
	private String sedeActual; //merge aca
	private int capacidad;
	private String placa;
	private String modelo;
	private String color;
	private String tipoTransmision;
	private CategoriaVehiculo categoria;
	private Date fechaInicio;
	private Date fechaFinal;
	private  boolean conSeguro = false;
	
	public Vehiculo() {
		fechaFinal=null;
		fechaInicio= null;
	}//Constructor Mio
	
	
	
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
	
	
	public Sede getSedeActual() {
		return Actual;
	}
	
	public void setConSeguro(boolean conSeguro) {
		this.conSeguro = conSeguro;
	}
	


// Revisar esto
	public String getSede()
    {
    	return sedeActual;
    }
	
	//Constructor Mateo
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
