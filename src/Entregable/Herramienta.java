package Entregable;

import java.time.LocalDate;

import Excepciones.AlquilerNoEntregadoException;

public class Herramienta {
	
	private String nombre;
	private double costoDia;
	
	
	public Herramienta(String nombre, double costoDia) {
		super();
		this.nombre = nombre;
		this.costoDia = costoDia;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getCostoDia() {
		return costoDia;
	}


	public void setCostoDia(double costoDia) {
		this.costoDia = costoDia;
	}
	
	
	public void alquilar(LocalDate fechaIni, LocalDate fechaFin, LocalDate fechaDev, Usuario usr){
		Alquiler a1 = new Alquiler(this,fechaIni,fechaFin, fechaDev);
		usr.contratar(a1,"alq");
	}
	
	
}

