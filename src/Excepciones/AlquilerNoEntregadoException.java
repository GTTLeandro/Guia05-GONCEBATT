package Excepciones;

public class AlquilerNoEntregadoException extends Exception {

	public AlquilerNoEntregadoException() {
		super(" ya no puede alquilar, tiene m�s de 2 herramientas sin devolver");
	}
	

}
