package logica;

import java.util.ArrayList;
import java.util.Date;
import logica.Reserva;
public  class Cliente extends UsuarioGenerico {
 
 public String nombre;
 public String nacionalidad;
 public int telefono;
 public String fechaNac;
 protected LicienciaConducion licienciaConducion;
 protected MedioDePago medioDePago;
 protected  ArrayList<Reserva>  reservas;
 
 public Cliente(String nombre, String nacionalidad, int telefono, String fechaNacimiento,String usuario, String contraseña, String tipoUsuario)
	{
	  super(usuario, contraseña, tipoUsuario);//Le agregue aca estos 3
		this.nombre = nombre;
		this.nombre = nacionalidad;
		this.telefono = telefono;
		this.fechaNac = fechaNacimiento;
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
