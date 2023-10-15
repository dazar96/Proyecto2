package logica;

import java.util.Date;



public class Reserva {
	private String identificador;
	private String categoriaVehiculo;
	private Date FechaInicio ;
	private Date FechaFinal ;
	private double precio30;
	private double precioRestante;
	private double precioTotal;
	private int numeroTarjeta;
	private String sedeNombreRecoger;
	private String sedeNombreDevolver;
	
	public Reserva(String identificador, String categoriaVehiculo, Date fechaInicio, Date fechaFinal, double precio30,
			double precioRestante,double precioTotal,int numeroTarjeta,String sedenombreRecoger,String sedeNombreDevolver) {
		
		this.identificador = identificador;
		this.categoriaVehiculo = categoriaVehiculo;
		FechaInicio = fechaInicio;
		FechaFinal = fechaFinal;
		this.precio30 = precio30;
		this.precioRestante = precioRestante;
		this.precioTotal = precioTotal;
		this.numeroTarjeta = numeroTarjeta;
		this.sedeNombreRecoger = sedenombreRecoger;
		this.sedeNombreDevolver =sedeNombreRecoger;
	}

	public String getIdentificador() {
		return identificador;
	}

	public String getCategoriaVehiculo() {
		return categoriaVehiculo;
	}

	public Date getFechaInicio() {
		return FechaInicio;
	}

	public Date getFechaFinal() {
		return FechaFinal;
	}

	public double getPrecio30() {
		return precio30;
	}

	public double getPrecioRestante() {
		return precioRestante;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public String getSedeNombreRecoger() {
		return sedeNombreRecoger;
	}

	public String getSedeNombreDevolver() {
		return sedeNombreDevolver;
	}
	
	
	
	
	
}
