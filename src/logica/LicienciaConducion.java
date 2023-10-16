package logica;

import java.util.Date;

public class LicienciaConducion {
 private int number;
 private String paisExpedicion;
 private Date fechaVencimiento;

 public LicienciaConducion(int number, String paisExpedicion, Date fechaVencimiento) {
	
	this.number = number;
	this.paisExpedicion = paisExpedicion;
	this.fechaVencimiento = fechaVencimiento;
}
 
}
