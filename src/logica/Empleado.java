package logica;

import java.util.Date;

public class Empleado  extends UsuarioGenerico{
	
	private String nombre;
	private String sede;
	
	public Empleado(String usuario, String contraseña, String tipoUsuario, String nombre, String sede) {
		super(usuario, contraseña, tipoUsuario);
		this.nombre = nombre;
		this.sede = sede;
	}
	
	
	public String getNombre()
	{
		return nombre;
	}
	
	public void administarRecogidaCliente(Reserva reserva) {
		reserva.setVehiculoRecogido(true);
	}
	public double agregarConductor(double valorAdicionalConductor,Reserva reserva,int numero,String pais,Date fechaVencimiento) {
		LicienciaConducion licienciaConducion = new LicienciaConducion(numero,pais,fechaVencimiento);
		ConductorAdicional conductorAdicional =new ConductorAdicional(licienciaConducion);
		reserva.setConductorAdicional(conductorAdicional);
		return valorAdicionalConductor;
		
	}
	public void devolucionCocheCliente(Reserva reserva) {
		reserva.setVehiculoRecogido(false);
		reserva.getVehiculo().setFechaInicio(null);	
		reserva.getVehiculo().setFechaFinal( null);
		}
}

