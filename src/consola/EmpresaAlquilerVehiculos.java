package consola;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import logica.AdministradorLocal;
import logica.Cliente;
import logica.Empleado;
import logica.Sede;
import logica.UsuarioGenerico;
import logica.Vehiculo;

public class EmpresaAlquilerVehiculos {
 //private String nombre;
  private ArrayList<UsuarioGenerico> listaUsuarioGenericos = new ArrayList<UsuarioGenerico>();
  private ArrayList<Cliente> listaClientes;
  private ArrayList<Sede> listaSedes;
  private ArrayList<Empleado> listaEmpleados;
  
  
  private ArrayList<Vehiculo> listaVehiculo = new ArrayList<Vehiculo>();
 
 private void ejecutarPrograma() {
	 
;	 System.out.println("Bienvenido a la empresa");
	 String usuario=input("Usuario ");
	 String contrasenia=input("Contraseña ");
	 String tipoUsuario =login(usuario, contrasenia);
	 if(tipoUsuario.equals("")) {
		 System.out.println("Usuario o contraseña incorrecta");
		 while (tipoUsuario.equals("")) {
			 System.out.println("Ingrese nuevamente su usuario y contraseña");
			 usuario=input("Usuario ");
			 contrasenia=input("Contraseña ");
			 tipoUsuario =login(usuario, contrasenia);
		 }
		 
		
	 } else {
		System.out.println("Entrando al sistema.....");
		
		
	}
	 
 }
 private String login(String usuario,String contrasenia) {
	 
	 for (UsuarioGenerico usuarioGenerico : listaUsuarioGenericos) {
		String userFor = usuarioGenerico.getUsuario();
		String passwordFor = usuarioGenerico.getContraseña();
		if(usuario.equals(userFor) && passwordFor.equals(contrasenia)) {
			String tipoUsario= usuarioGenerico.getTipoUsuario();
			return tipoUsario;
		}
		
	}return "";
 }
 
 private void programaCliente () {
	 
 }
 private void MenuCliente() {
	 System.out.println("1.Reservar vehiculo");
	 
 }
 
 
 
 
 
 public static void main(String[] args) {
	 EmpresaAlquilerVehiculos programa = new EmpresaAlquilerVehiculos();
	 ControllerCarga control = new ControllerCarga();
	 programa.cargaDatos(control);
	 programa.ejecutarPrograma();
}
 
 
 
 
 
 
 
 private void cargaDatos(ControllerCarga control) {
	  
	 ArrayList<Cliente> LCliente = control.cargarClientes(null);
	 ArrayList<Empleado> LEmpleado = control.cargarEmpleados(null);
	 ArrayList<Vehiculo> LVehiculos = control.cargarVehiculos(null);
	 ArrayList<AdministradorLocal> LAdmiLocal = control.cargarAdministradorLocal(null);
	 ArrayList<Sede> LSedes = control.cargarSedes(LEmpleado, LVehiculos, LAdmiLocal, null);
 
 
     }
 
 
 
 
 
 
public String input(String mensaje)
	{
		try
		{
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}
}
