package logica;

public class CategoriaVehiculo {
 private String nombreCategoria ; // Falta en Diseño
 private int idCategoria;
 private int tarifaDiaria;
 
 
 public CategoriaVehiculo(String nombreCategoria, int idCategoria,int tarifaDiaria)
 {
	 this.nombreCategoria = nombreCategoria;
	 this.idCategoria = idCategoria;
	 this.tarifaDiaria = tarifaDiaria;
	 
 }
 
 
 public String getNombreCategoria() {
	return nombreCategoria;
 }
 public int getIdCategoria() {
	return idCategoria;
 	}
 public int getTarifaDiaria() {
	return tarifaDiaria;
 }
}
