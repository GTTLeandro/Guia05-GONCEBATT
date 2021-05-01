package Entregable;

import java.time.LocalDate;
import java.util.ArrayList;

import Entregable.Trabajador.Oficio;
import Excepciones.AgendaOcupadaException;
import Excepciones.AlquilerNoEntregadoException;
import Excepciones.OficioNoCoincideException;

public class Trabajador {
	private	String nombre;
	private	String email;
	
	public enum Oficio {ALBAÑIL, ELECTRICISTA, PLOMERO, GASISTA, CERRAJERO, REP_ELECTRO, PINTOR};
	private	Oficio oficio;
	
	private double costoHora;
	private double comision;
	private ArrayList<Servicio> trabajos;
	
	
	public Trabajador(String nombre, Oficio oficio, double costoHora, double comision) {
		super();
		this.nombre = nombre;
		this.oficio = oficio;
		this.costoHora = costoHora;
		this.comision = comision;
		this.trabajos = new ArrayList<Servicio>();
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Oficio getOficio() {
		return oficio;
	}


	public void setOficio(Oficio oficio) {
		this.oficio = oficio;
	}


	public double getCostoHora() {
		return costoHora;
	}


	public void setCostoHora(double costoHora) {
		this.costoHora = costoHora;
	}


	public double getComision() {
		return comision;
	}


	public void setComision(double comision) {
		this.comision = comision;
	}


	public ArrayList<Servicio> getTrabajos() {
		return trabajos;
	}


	public void setTrabajos(ArrayList<Servicio> trabajos) {
		this.trabajos = trabajos;
	}
	
	/*Método asignarTrabajo: permite agregar trabajos a un trabajador. Verifica:
	 * La tarea tiene el mismo oficio que el trabajador (OficioNoCoincideException)
	 * Ese día el trabajador no tiene otro trabajo agendado (AgendaOcupadaException)
	 */
	
	//Asignar Servicio Estandar
	public void asignarTrabajo(Oficio oficio, boolean urgente, double precioRF, LocalDate fechaIni, Usuario usr)throws OficioNoCoincideException, AgendaOcupadaException {
		if (this.oficio == oficio) {
			for (int i=0; i< this.trabajos.size();i++) {
					if(this.trabajos.get(i).getFechaIni().equals(fechaIni)) {
						throw new AgendaOcupadaException(fechaIni);}
					}
			
			ServicioEstandar s1= new ServicioEstandar(oficio, this, urgente, precioRF, fechaIni);
			this.trabajos.add(s1);
			usr.contratar(s1,"serv");
			System.out.println("El "+ this.getOficio()+" "+this.getNombre()+" realizará el trabajo asignado el día "+fechaIni);}
		else {throw new OficioNoCoincideException();}
			
		}
	
	//Asignar Servicio Personalizado
	public void asignarTrabajo(Oficio oficio, boolean urgente, double pres,
			double valorM, double valorT, LocalDate fechaIni, Usuario usr) throws OficioNoCoincideException, AgendaOcupadaException {
		if (this.oficio == oficio) {
			for (int i=0; i< this.trabajos.size();i++) {
					if(this.trabajos.get(i).getFechaIni().equals(fechaIni)) {
						throw new AgendaOcupadaException(fechaIni);}
					}
			
			ServicioPersonalizado s1= new ServicioPersonalizado(oficio, this, urgente,fechaIni,pres,valorM,valorT);
			this.trabajos.add(s1);
			usr.contratar(s1,"serv");
			System.out.println("El "+ this.getOficio()+" "+this.getNombre()+" realizará el trabajo asignado el día "+fechaIni);}
		else {throw new OficioNoCoincideException();}
			
		}
}
	
	
	
	