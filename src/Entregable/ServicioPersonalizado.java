package Entregable;

import java.time.LocalDate;

import Entregable.Trabajador.Oficio;

public class ServicioPersonalizado extends Servicio implements Contratable {

	private double presupuesto;
	private double valorMateriales;
	private double valorTransporte;
		
	
	public ServicioPersonalizado(Oficio oficio, Trabajador trabajador, boolean urgente, LocalDate fechaIni, double presupuesto,
			double valorMateriales, double valorTransporte) {
		super(oficio, trabajador, urgente, fechaIni);
		this.presupuesto = presupuesto;
		this.valorMateriales = valorMateriales;
		this.valorTransporte = valorTransporte;
	}





	
		
	/*
	 * En los servicios personalizados, el costo es un valor presupuestado, 
	 * más un costo de materiales y un costo de transporte que se guardan 
	 * directamente en este tipo de servicio
	 */
	
	@Override
	public double costo() {
		if (urgente)
		{return (this.presupuesto + this.valorMateriales + this.valorTransporte)*1.5;} 
	else 
		{return (this.presupuesto + this.valorMateriales + this.valorTransporte);}
	}
	


}
	


