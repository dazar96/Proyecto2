package logica;

public class AdministradorLocal extends UsuarioGenerico {
	
 private String nombre;
 private String sede;
	
 public AdministradorLocal(String usuario, String contraseña, String tipoUsuario) {
		super(usuario, contraseña, tipoUsuario);
		this.nombre = nombre;
		this.sede = sede;
	}
	
 public void entregaVehiculo() { 
	 
 }
 
  
}
