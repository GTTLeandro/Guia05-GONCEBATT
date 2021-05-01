package Entregable;

import java.time.Duration;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

public class Alquiler implements Contratable {
	
	private Herramienta herramienta;
	private LocalDate fechaIni;
	private LocalDate fechaFin;
	private LocalDate fechaDev;
	
	
	
	public Alquiler(Herramienta herramienta, LocalDate fechaIni, LocalDate fechaFin, LocalDate fechaDev) {
		super();
		this.herramienta = herramienta;
		this.fechaIni = fechaIni;
		this.fechaFin = fechaFin;
		this.fechaDev = fechaDev;
	}
	
	
	public void setFechaDev(LocalDate fechaDev) {
		this.fechaDev = fechaDev;
	}
	
	public LocalDate getFechaDev() {
		return fechaDev;
	}

	
	/*
	 * Costo de un alquiler: producto de los días que la herramienta estuvo alquilada 
	 * (diferencia en días entre la fecha de entrega real y la fecha de inicio del alquiler). 
	 * El sistema por el momento no cobra multa por entregas tardías.
	 */
	@Override
	public double costo() {
		if (fechaDev==null) {return 0;}
		else {
		return herramienta.getCostoDia()*DAYS.between(fechaIni, fechaDev);}
			//return herramienta.getCostoDia()*Duration.between(fechaIni, fechaDev).toDays();}
	}
	
	/*
	 * Método “enMora”: retorna verdadero si el mismo fue devuelto con fecha posterior a 
	 * la contratada, o si aun no fue devuelto pero el día actual es posterior al del vencimiento.	
	 */
	public boolean enMora() {
		if (this.fechaDev==null) 
		{LocalDate hoy = LocalDate.now();
		return hoy.isAfter(fechaFin);}
		else
		{return this.fechaDev.isAfter(fechaFin);}
	}	
	
	/*
	 * Método “finalizado”: retorna verdadero si la herramienta fue devuelta.
	 */
	public boolean finalizado() {
		if (this.fechaDev==null) 
				{return false;}
		else
				{return true;}
	}


	@Override
	public void getDescripcion() {
		System.out.println(herramienta.getNombre()+" desde el "+fechaIni+" hasta el "+fechaFin);
	}


	@Override
	public boolean sinDevolver() {
		return !this.finalizado();
	}
		
}
