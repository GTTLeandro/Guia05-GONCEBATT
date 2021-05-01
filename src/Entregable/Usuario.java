package Entregable;

import java.time.LocalDate;
import java.util.ArrayList;

import Entregable.Trabajador.Oficio;
import Excepciones.AlquilerNoEntregadoException;

public class Usuario {
	private	String nombre;
	private ArrayList<Contratable> contratados;

	
	
	
	
	public Usuario(String nombre) {
		super();
		this.nombre = nombre;
		this.contratados = new ArrayList<Contratable>();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/*
	 * Métodos Contratar:el usuario puede contratar un servicio o un alquiler y agregarlo a su 
	 * lista de contratables. Para este caso se debe validar que:
	 * No puede tener más de dos alquileres sin haber sido devueltos (si quiere alquilar una herramienta 
	 * y en su lista de contratables tiene más de 2 alquileres sin devolver entonces no podrá alquilar 
	 * y se lanzará una excepción AlquilerNoEntregadoException)
	 */
	

	public void contratar(Contratable cont, String z){
		int noDev=0;
		if (z=="serv") {
			this.contratados.add(cont);}
		else {
			for (int i=0; i< this.contratados.size();i++) {
					if (this.contratados.get(i).sinDevolver()) {noDev++;}
			}
			try {
				if (noDev>2) {throw new AlquilerNoEntregadoException();}
				else {this.contratados.add(cont);}
			}
			catch (AlquilerNoEntregadoException e) {System.out.println(this.nombre+e.getMessage());}
		
			}
	}
	
	public void verContratados() {
		for (int i=0; i< this.contratados.size();i++) {
			this.contratados.get(i).getDescripcion();
		}
	}
	
}
