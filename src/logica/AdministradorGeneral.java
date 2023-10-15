package logica;

import java.util.ArrayList;

public class AdministradorGeneral extends UsuarioGenerico {
	
	private ArrayList<Boolean> bols;
	private Seguro seguro;

	private String nombre;
	
 public AdministradorGeneral(String usuario, String contraseña, String tipoUsuario) {
	super(usuario, contraseña, tipoUsuario);
	// TODO Auto-generated constructor stub
	}
	
 public void modificarInventario() {
	
 }
 public double administrarSeguro (boolean conSeguro,Vehiculo vehiculo) {
	 seguro = new Seguro("Seguro general");
	 if(conSeguro) {
		 vehiculo.setConSeguro(conSeguro);
		 return seguro.getPrecio();
	 }
	 seguro.setPrecio(0);
	 return seguro.getPrecio();
 }
}
