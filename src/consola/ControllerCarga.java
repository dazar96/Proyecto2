package consola;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import logica.AdministradorLocal;
import logica.Cliente;
import logica.Empleado;
import logica.Sede;
import logica.Vehiculo;

public class ControllerCarga {


	public ArrayList<AdministradorLocal> cargarAdministradorLocal(String archivoAdmiLocal) {
		

		FileReader archivo;
		BufferedReader lector;
		java.util.ArrayList<AdministradorLocal> adminLocal= new java.util.ArrayList<>();
		try
		{
			archivo = new FileReader(archivoAdmiLocal);
			lector = new BufferedReader(archivo);
			String cadena;
		
			while((cadena = lector.readLine()) != null)
			{
				String[ ] partes = cadena.split(";");
				String nombre = partes[0];
				String sede = partes[1];
				String usuario = partes[2];
				String contraseña = partes[3];
				String tipoUsuario = partes[4];
				
				
				
				AdministradorLocal Admin= new AdministradorLocal(usuario, contraseña, tipoUsuario, nombre, sede);
				adminLocal.add(Admin);
			}       
		}
		catch (FileNotFoundException e)
		{
			System.out.println("ERROR: el archivo indicado no se encontró.");
		}
		catch (IOException e)
		{
			System.out.println("ERROR: hubo un problema leyendo el archivo.");
			System.out.println(e.getMessage());
		}
		return adminLocal;
		
		
	}
	
	public ArrayList<Sede> cargarSedes(ArrayList<Empleado> lEmpleado, ArrayList<Vehiculo> lVehiculos, ArrayList<AdministradorLocal> lAdmiLocal, String ArchivoSede) 
	{
		FileReader archivo;
		BufferedReader lector;
		java.util.ArrayList<Sede> sedes = new java.util.ArrayList<>();
		try
		{
			archivo = new FileReader(ArchivoSede);
			lector = new BufferedReader(archivo);
			String cadena;
		
			while((cadena = lector.readLine()) != null)
			{
				String[ ] partes = cadena.split(";");
				String nombre = partes[0];
				String ubicacion = partes[1];
				String diasHorasAtencion = partes[2];
				
				
				ArrayList<Empleado> lEmple = new java.util.ArrayList<>();
				for(int i = lEmpleado.size()-1;i >= 0;i--) 
				{
					if(lEmpleado.get(i).getNombre() == nombre)
					{
						lEmple.add(lEmpleado.get(i));
					}
					
				}
				
				
				
				ArrayList<Vehiculo> lVehi = new java.util.ArrayList<>();
				for(int i = lVehiculos.size()-1;i >= 0;i--) 
				{
					if(lVehiculos.get(i).getSede() == nombre)
					{
						lVehi.add(lVehiculos.get(i));
					}
					
				}
				
				
				
				AdministradorLocal Admini = null;
				for(int i = lAdmiLocal.size()-1;i >= 0;i--) 
				{
					if(lAdmiLocal.get(i).getSede() == nombre)
					{
						Admini = lAdmiLocal.get(i);
					}
					
				}
				
				
			
				Sede sed = new Sede(nombre, ubicacion,diasHorasAtencion, lVehi, lEmple, Admini);
				sedes.add(sed);
			}
			
		    
		    
		}
		catch (FileNotFoundException e)
		{
			System.out.println("ERROR: el archivo indicado no se encontró.");
		}
		catch (IOException e)
		{
			System.out.println("ERROR: hubo un problema leyendo el archivo.");
			System.out.println(e.getMessage());
		}
		return sedes;
		
		
	}
	
	
	
	
	
	
	
	public ArrayList<Cliente> cargarClientes(String archivoClientes) {
		
		FileReader archivo;
		BufferedReader lector;
		java.util.ArrayList<Cliente> clientes = new java.util.ArrayList<>();
		try
		{
			archivo = new FileReader(archivoClientes);
			lector = new BufferedReader(archivo);
			String cadena;
		
			while((cadena = lector.readLine()) != null)
			{
				String[ ] partes = cadena.split(";");
				String nombre = partes[0];
				String nacionalidad = partes[1];
				int telefono = Integer.parseInt(partes[2]);
				String fechaNacimiento = partes[3];
				String usuario = partes[4];
				String contraseña = partes[5];
				String tipoUsuario = partes[6];
				
				Cliente perCliente = new Cliente(nombre, nacionalidad, telefono, fechaNacimiento, usuario, contraseña, tipoUsuario);
				clientes.add(perCliente);
			}
			
		    
		    
		}
		catch (FileNotFoundException e)
		{
			System.out.println("ERROR: el archivo indicado no se encontró.");
		}
		catch (IOException e)
		{
			System.out.println("ERROR: hubo un problema leyendo el archivo.");
			System.out.println(e.getMessage());
		}
		return clientes;
		
	}

	public ArrayList<Empleado> cargarEmpleados(String archivoEmpleados) {
		FileReader archivo;
		BufferedReader lector;
		java.util.ArrayList<Empleado> empleados = new java.util.ArrayList<>();
		try
		{
			archivo = new FileReader(archivoEmpleados);
			lector = new BufferedReader(archivo);
			String cadena;
			
			while((cadena = lector.readLine()) != null)
			{
				String[ ] partes = cadena.split(";");
				String nombre = partes[0];
				String sede = partes[1];
				String usuario = partes[2];
				String contraseña = partes[3];
				String tipoUsuario = partes[4];
				
				Empleado perCliente = new Empleado(usuario, contraseña, tipoUsuario, nombre, sede);
				empleados.add(perCliente);
			} 
		}
		catch (FileNotFoundException e)
		{
			System.out.println("ERROR: el archivo indicado no se encontró.");
		}
		catch (IOException e)
		{
			System.out.println("ERROR: hubo un problema leyendo el archivo.");
			System.out.println(e.getMessage());
		}
		return empleados;
		
	}
	
	public ArrayList<Vehiculo> cargarVehiculos(String archivoVehiculos) 
	{
		FileReader archivo;
		BufferedReader lector;
		java.util.ArrayList<Vehiculo> Vehiculos = new java.util.ArrayList<>();
		try
		{
			archivo = new FileReader(archivoVehiculos);
			lector = new BufferedReader(archivo);
			String cadena;
			
			while((cadena = lector.readLine()) != null)
			{
				String[ ] partes = cadena.split(";");
				

				
				int idVehiculo = Integer.parseInt(partes[0]);
				boolean alquilado = Boolean.parseBoolean(partes[1]);
				String sedeActual = partes[2];
				int capacidad = Integer.parseInt(partes[3]);
				String placa = partes[4];
				String modelo = partes[5];
				String color = partes[6];
				String tipoTransmision = partes[7];
				
				Vehiculo Vehi = new Vehiculo(idVehiculo, alquilado, sedeActual, capacidad, placa, modelo, color, tipoTransmision);
				Vehiculos.add(Vehi);
			} 
		}
		catch (FileNotFoundException e)
		{
			System.out.println("ERROR: el archivo indicado no se encontró.");
		}
		catch (IOException e)
		{
			System.out.println("ERROR: hubo un problema leyendo el archivo.");
			System.out.println(e.getMessage());
		}
		return Vehiculos;
		
		
	}
	
	
	
	
	public void cargarAdministradores() {}
}
