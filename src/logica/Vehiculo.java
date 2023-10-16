package logica;

import java.util.Date;
import java.util.Set;

public class Vehiculo {
	private int idVehiculo;
	private Sede sedeActual;
	private boolean alquilado =false; 
	private String sedeInicial; 
	private int capacidad;
	private String placa;
	private String modelo;
	private String color;
	private String tipoTransmision;
	private CategoriaVehiculo categoria;
	private Date fechaInicio=null;
	private Date fechaFinal=null;
	private  boolean conSeguro = false;
	private boolean funcional = true;
	

	public Vehiculo(int idVehiculo, boolean alquilado,Sede sedeActual,String sedeInicial,int capacidad, String placa, 
			String modelo, String color, 
			String tipoTransmision,CategoriaVehiculo categoria,
			Date fechaInicio,Date fechaFinal,boolean conseguro,boolean funcional )
	{
		this.idVehiculo = idVehiculo;
		this.alquilado = alquilado;
		this.sedeInicial = sedeInicial;
		this.sedeActual = sedeActual;
		this.capacidad = capacidad;
		this.placa = placa;
		this.modelo = modelo;
		this.color = color;
		this.tipoTransmision = tipoTransmision;
		this.categoria = categoria;
		this.fechaInicio = fechaInicio;
		this.fechaFinal = fechaFinal;
		this.conSeguro = conseguro;
		this.funcional = funcional;
		
	}
	//Getters and Setters
	
	public CategoriaVehiculo getCategoria() {
		return categoria;}

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
		return sedeActual;
	}
	
	public void setConSeguro(boolean conSeguro) {
		this.conSeguro = conSeguro;
	}
	


// Revisar esto
	public String getSede()
    {
    	return sedeInicial;
    }
	

	//Constructor Mateo
	//Getters and Setters
	
	
	public int getidVehiculo() {
		return idVehiculo;
	}
	
	public boolean getAlquilado() {
		return alquilado;
	}
	
	public String getSedeString() {
		return sedeInicial;
	}
	
	public int getCapacidad() {
		return capacidad;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getTipoTransmision() {
		return tipoTransmision;
	}
	
	
	
	
	

	
	
	
	
	
	
}
