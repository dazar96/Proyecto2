package logica;

public class AdministradorLocal extends UsuarioGenerico {
	
 private String nombre;
 private String sede;
	
 public AdministradorLocal(String usuario, String contraseña, String tipoUsuario, String nombre, String sede) {
		super(usuario, contraseña, tipoUsuario);
		this.nombre = nombre;
		this.sede = sede;
	}
	
 public String getSede()
 {
	 return sede;
 }
 public void entregaVehiculo() { }
}
