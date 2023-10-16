package logica;

import java.util.ArrayList;
import java.util.Date;

import consola.EmpresaAlquilerVehiculos;

public  class Cliente extends UsuarioGenerico {
 
 public String nombre;
 public String nacionalidad;
 public String telefono;
 public String fechaNac;
 protected LicienciaConducion licienciaConducion;
 private  MedioDePago medioDePago;
 protected  ArrayList<Reserva>  reservas = new ArrayList<Reserva>();
 
 public Cliente(String nombre, String nacionalidad, String telefono, String fechaNacimiento,String usuario, String contraseña, String tipoUsuario,ArrayList<Reserva> reservas)
	{
	  super(usuario, contraseña, tipoUsuario);
		this.nombre = nombre;
		this.nombre = nacionalidad;
		this.telefono = telefono;
		this.fechaNac = fechaNacimiento;
		this.reservas = reservas;
		
		
		
	}
 
 
  public String getNombre() {
	return nombre;
  }

  public MedioDePago getMedioDePago() {
	  return medioDePago;
  }

public Reserva crearReserva(Vehiculo vehiculo,Date fechaInicio,Date FechaFinal,double precio30 ,double precioRestante,String sedeDevolver,String sedeRecoger) {
	  Reserva reserva = new Reserva(EmpresaAlquilerVehiculos.getNumeroReservaInteger(),vehiculo.getCategoria().getNombreCategoria(),
			  fechaInicio,FechaFinal,precio30,precioRestante,
			  precio30+precioRestante,medioDePago.getNumeroTarjeta(),
			  sedeRecoger,sedeDevolver,null,false,vehiculo,nombre);	  
	  			reservas.add(reserva);
	  			return reserva;
 }

  
  public  ArrayList<Reserva> getReservas() {
	return reservas;
  }

}
