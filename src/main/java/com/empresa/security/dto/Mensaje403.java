package com.empresa.security.dto;

public class Mensaje403 {

	private String codigo;
	private String mensaje;
	
	public Mensaje403(String codigo, String mensaje) {
		super();
		this.codigo = codigo;
		this.mensaje = mensaje;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public String toString() {
		return "Mensaje403 [codigo=" + codigo + ", mensaje=" + mensaje + "]";
	}
	
	
	
}
