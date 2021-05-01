package Excepciones;

import java.time.LocalDate;

public class AgendaOcupadaException extends Exception {
	public AgendaOcupadaException(LocalDate fechaIni) {
		super("ya tiene un trabajo asignado el día "+fechaIni);
		}


}
