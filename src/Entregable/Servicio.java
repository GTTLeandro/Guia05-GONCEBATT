package Entregable;

import java.time.LocalDate;

import Entregable.Trabajador.Oficio;

public class Servicio implements Contratable{
	private	Oficio oficio;
	protected Trabajador trabajador;
	protected boolean urgente;
	private LocalDate fechaIni;
	private LocalDate fechaFin;
	
		
	public Servicio(Oficio oficio, Trabajador trabajador, boolean urgente, LocalDate fechaIni) {
		this.oficio = oficio;
		this.trabajador = trabajador;
		this.urgente = urgente;
		this.fechaIni = fechaIni;
	}

	public void finalizar(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	public LocalDate getFechaFin() {
		return fechaFin;
	}
	
	public LocalDate getFechaIni() {
		return fechaIni;
	}
	/*@Override
	public void getDescripcion() {
		System.out.println(oficio.toString()+" - "+trabajador.getNombre()+" - "+fechaIni);
	}
	*/

	//Método “finalizado”: retorna verdadero si un trabajo tiene fecha de fin
	public boolean finalizado() {
		if (this.fechaFin!=null) 
				{return true;}
		else
				{return false;}
	}

	@Override
	public double costo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean sinDevolver() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void getDescripcion() {
		System.out.println(oficio.toString()+" - "+trabajador.getNombre()+" - "+fechaIni);
		
	}
}
