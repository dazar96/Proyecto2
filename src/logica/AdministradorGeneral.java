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
 public double administrarSeguro (ArrayList<Seguro> seguros,ArrayList<Integer> posiciones,boolean conSeguro,Vehiculo vehiculo) {

	 if(conSeguro) {
		 double precioseguros=0;
		 vehiculo.setConSeguro(conSeguro);
		 for (Integer integer : posiciones) {
			 precioseguros +=seguros.get(integer-1).getPrecio();
		}
		 return precioseguros;
	 }
	 else {
		return 0;
	}
	 
	 
	 
	 
 }
 
 public void registrarCompraVehiculo() {
	 
 }
}
