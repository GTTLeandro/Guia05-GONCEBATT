package Entregable;

import java.time.LocalDate;

import Entregable.Trabajador.Oficio;

public class ServicioEstandar extends Servicio implements Contratable {

	private double precioRF;
			
		
	public ServicioEstandar(Oficio oficio, Trabajador trabajador, boolean urgente, double precioRF, LocalDate fechaIni) {
		super(oficio, trabajador, urgente, fechaIni);
		this.precioRF = precioRF;
	}




	/*
	 * En los servicios estándares se cobra un monto fijo, definido por ReparaFix 
	 * para ese servicio más el plus que cobre el profesional seleccionado.
	 */
	@Override
	public double costo() {
		if (urgente)
			{return (this.precioRF + (this.precioRF + trabajador.getComision()))*1.5;} 
		else 
			{return this.precioRF + (this.precioRF + trabajador.getComision());}
	}
	
	
	
	 

}
