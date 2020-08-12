package com.consultorio.excepciones;

import com.examen.logica.Codigo;

public class Respuesta {

	private String mensaje;
	
	private Codigo codigo ;

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Codigo getCodigo() {
		return codigo;
	}

	public void setCodigo(Codigo codigo) {
		this.codigo = codigo;
	}
	

}
