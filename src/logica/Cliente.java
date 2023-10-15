package logica;

import java.util.ArrayList;
import java.util.Date;
import logica.Reserva;
public  class Cliente extends UsuarioGenerico {
 
protected String nombre;
 protected String nacionalidad;
 protected int telefono;
 protected Date fechaNac;
 protected LicienciaConducion licienciaConducion;
 protected MedioDePago medioDePago;
 protected  ArrayList<Reserva>  reservas;
 
 public Cliente(String usuario, String contraseña, String tipoUsuario) {
		super(usuario, contraseña, tipoUsuario);
		// TODO Auto-generated constructor stub
	}
  public void crearReserva() {
	  Reserva reserva = new Reserva();	  
	  reservas = new ArrayList<Reserva>();
	  reservas.add(reserva);
  }
 public  ArrayList<Reserva> getReservas() {
	return reservas;
}
  
}
