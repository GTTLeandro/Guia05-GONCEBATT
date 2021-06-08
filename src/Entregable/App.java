package Entregable;

import java.time.LocalDate;
import Entregable.Trabajador.Oficio;
import Excepciones.AgendaOcupadaException;
import Excepciones.OficioNoCoincideException;

public class App {

	public static void main(String[] args) {
		
		Herramienta h1 = new Herramienta("Serrucho", 100);
		Herramienta h2 = new Herramienta("Taladro", 150);
		Herramienta h3 = new Herramienta("Escalera", 300);
		Herramienta h4 = new Herramienta("Andamio", 700);
		Herramienta h5 = new Herramienta("Tester", 300);
		Herramienta h6 = new Herramienta("Generador", 6500);
		Herramienta h7 = new Herramienta("Lijadora", 700);
		Herramienta h8 = new Herramienta("Soldadora", 780);
		Herramienta h9 = new Herramienta("Amoladora", 690);
		Herramienta h10 = new Herramienta("Sierra", 610);
		Herramienta h11 = new Herramienta("Contenedor", 3060);
		Herramienta h12 = new Herramienta("Balde", 300);
		Herramienta h14 = new Herramienta("Fratacho", 300);
		
		Trabajador t1 = new Trabajador("Gonzalez",Oficio.PINTOR, 65, 0.30);
		Trabajador t2 = new Trabajador("Perez", Oficio.ALBAÑIL, 35, 0.30);
		Trabajador t3 = new Trabajador("Acevedo", Oficio.ELECTRICISTA, 45, 0.25);
		Trabajador t4 = new Trabajador("Fernandez", Oficio.PLOMERO, 40, 0.35);
		
		Usuario u1 = new Usuario("JUAN007");
		Usuario u2 = new Usuario("MOROCHA_10");
		Usuario u3 = new Usuario("TIGRE77");
		
		System.out.println();
		System.out.println("ALQUILERES REALIZADOS POR USUARIOS WEB");
		System.out.println();
		h1.alquilar(LocalDate.parse("2021-06-04"), LocalDate.parse("2021-06-07"), null, u2);
		h2.alquilar(LocalDate.parse("2021-05-04"), LocalDate.parse("2021-05-15"), null, u1);
		h3.alquilar(LocalDate.parse("2021-04-04"), LocalDate.parse("2021-04-07"), null, u2);
		h8.alquilar(LocalDate.parse("2021-06-04"), LocalDate.parse("2021-06-15"), null, u2);
		h7.alquilar(LocalDate.parse("2021-05-04"), LocalDate.parse("2021-05-07"), null, u2);
		h9.alquilar(LocalDate.parse("2021-01-04"), LocalDate.parse("2021-06-15"), null, u3);
		h11.alquilar(LocalDate.parse("2021-06-04"), LocalDate.parse("2021-06-07"), null, u3);
		h12.alquilar(LocalDate.parse("2021-02-04"), LocalDate.parse("2021-06-15"), null, u3);
		h10.alquilar(LocalDate.parse("2021-02-04"), LocalDate.parse("2021-06-15"), null, u3);
		
		System.out.println();
		System.out.println("TRABAJOS SOLICITADOS AL TRABAJADOR "+t1.getNombre()+":");
		try {
			t1.asignarTrabajo(Oficio.GASISTA, false, 700,LocalDate.parse("2021-06-04"),u3);}
		catch (OficioNoCoincideException e) {System.out.println(e.getMessage()+" al trabajador "+t1.getNombre());
		}
		catch (AgendaOcupadaException a) {System.out.println("Lamentablemente el "+ t1.getOficio()+" "+t1.getNombre()+" "+a.getMessage());
		}
		try {
			t1.asignarTrabajo(Oficio.PINTOR, false, 800,LocalDate.parse("2021-04-30"),u3);}
		catch (OficioNoCoincideException e) {System.out.println(e.getMessage()+" al trabajador "+t1.getNombre());
		}
		catch (AgendaOcupadaException a) {System.out.println("Lamentablemente el "+ t1.getOficio()+" "+t1.getNombre()+" "+a.getMessage());
		}
		try {
			t1.asignarTrabajo(Oficio.PINTOR, false, 800,LocalDate.parse("2021-04-30"),u3);}
		catch (OficioNoCoincideException e) {System.out.println(e.getMessage()+" al trabajador "+t1.getNombre());
		}
		catch (AgendaOcupadaException a) {System.out.println("Lamentablemente el "+ t1.getOficio()+" "+t1.getNombre()+" "+a.getMessage());
		}
		
		
		System.out.println();
		System.out.println("TRABAJOS SOLICITADOS AL TRABAJADOR "+t2.getNombre()+":");
		try {
			t2.asignarTrabajo(Oficio.ALBAÑIL, false, 900,LocalDate.parse("2021-06-04"),u3);}
		catch (OficioNoCoincideException e) {System.out.println(e.getMessage()+" al trabajador "+t1.getNombre());
		}
		catch (AgendaOcupadaException a) {System.out.println("Lamentablemente el "+ t2.getOficio()+" "+t2.getNombre()+" "+a.getMessage());
		}
		try {
			t2.asignarTrabajo(Oficio.ALBAÑIL, false, 900,LocalDate.parse("2021-07-15"),u3);}
		catch (OficioNoCoincideException e) {System.out.println(e.getMessage()+" al trabajador "+t1.getNombre());
		}
		catch (AgendaOcupadaException a) {System.out.println("Lamentablemente el "+ t2.getOficio()+" "+t2.getNombre()+" "+a.getMessage());
		}
		
		try {
			t2.asignarTrabajo(Oficio.ALBAÑIL, false, 900,LocalDate.parse("2021-06-04"),u3);}
		catch (OficioNoCoincideException e) {System.out.println(e.getMessage()+" al trabajador "+t1.getNombre());
		}
		catch (AgendaOcupadaException a) {System.out.println("Lamentablemente el "+ t2.getOficio()+" "+t2.getNombre()+" "+a.getMessage());
		}
		try {
			t2.asignarTrabajo(Oficio.GASISTA, false, 900,LocalDate.parse("2021-11-04"),u2);}
		catch (OficioNoCoincideException e) {System.out.println(e.getMessage()+" al trabajador "+t1.getNombre());
		}
		catch (AgendaOcupadaException a) {System.out.println("Lamentablemente el "+ t2.getOficio()+" "+t2.getNombre()+" "+a.getMessage());
		}
		try {
			t2.asignarTrabajo(Oficio.ALBAÑIL, false, 900,LocalDate.parse("2021-10-04"),u2);}
		catch (OficioNoCoincideException e) {System.out.println(e.getMessage()+" al trabajador "+t1.getNombre());
		}
		catch (AgendaOcupadaException a) {System.out.println("Lamentablemente el "+ t2.getOficio()+" "+t2.getNombre()+" "+a.getMessage());
		}
		
				
		System.out.println();
		System.out.println("CONTRATADOS DEL USUARIO: "+u3.getNombre());
		u3.verContratados();
		
		System.out.println();
		System.out.println("DEVUELVE LAS HERRAMIENTAS EL DÍA 2021-09-30");
		u3.devolver(LocalDate.parse("2021-09-30"));
		
		System.out.println();
		System.out.println("ACTUALIZACIÓN DE COSTOS: "+u3.getNombre());
		u3.verContratados();
		
		System.out.println();
		System.out.println();
		
		System.out.println("CONTRATADOS DEL USUARIO: "+u2.getNombre());
		u2.verContratados();
		
		System.out.println();
		System.out.println("DEVUELVE LAS HERRAMIENTAS EL DÍA 2021-09-30");
		u2.devolver(LocalDate.parse("2021-06-29"));
		
		System.out.println();
		System.out.println("ACTUALIZACIÓN DE COSTOS: "+u2.getNombre());
		u2.verContratados();
		
		
		
		
		
		
		
		
		
	
		//System.out.println("En mora "+ a1 +" = "+a1.enMora());
		//System.out.println("En mora a2 = "+a2.enMora());
		
		//System.out.println("Llega!!!");
		
	}

}
