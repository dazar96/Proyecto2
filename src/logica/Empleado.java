package logica;

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
}

