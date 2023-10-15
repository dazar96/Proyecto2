package logica;

public class Seguro {
	private String nombre;
	private double precio = 20.5 ; // Un precio inicial de seguro para todos
	
	public Seguro(String nombre) {
		
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
