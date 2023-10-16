package logica;

import java.util.Date;

public class LicienciaConducion {
 private String number;
 private String paisExpedicion;
 private String fechaVencimiento;

 public LicienciaConducion(String numeroLicencia, String paisExpedicion, String fechaVencimientoLicencia) {
	
	this.number = numeroLicencia;
	this.paisExpedicion = paisExpedicion;
	this.fechaVencimiento = fechaVencimientoLicencia;
 }
 
}
