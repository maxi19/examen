package com.examen.logica;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

import com.consultorio.excepciones.LengthInvalidoException;

public class Codigo implements Comparable<Codigo> {

	private String codigoProducto;
	private String regionGeografica;
	private int digitoVerificador;
	
	private Pattern codigoPattern;
	private Matcher codigoMatcher;
	
	private String PATRON ="([A-Z]{3})-(\\d{5})-(\\d{1})" ;
	
	
	public Codigo(String codigo) throws Exception {
		codigo = codigo.trim();
		codigo = codigo.replace(" ", "");
		if (codigo.length() != 11 ) {
			System.out.println("el codigo creado es invalido y no cumple con el formato requerido");
		}
		this.separarCodigo(codigo);
	
	}
	
	private void separarCodigo(String codigo) throws Exception {
		this.codigoPattern = codigoPattern.compile(this.PATRON);
		codigoMatcher = codigoPattern.matcher(codigo);
		if (codigoMatcher.find()) {
			this.codigoProducto = codigoMatcher.group(1);
			this.regionGeografica = codigoMatcher.group(2);
			this.digitoVerificador = Integer.parseInt(codigoMatcher.group(3));
		}else {
			throw new Exception("El codigo no tiene el formato adecuado");
		}
	}
		
	public int getDigitoVerificador() {
		return digitoVerificador;
	}

	public void setDigitoVerificador(int digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}


	public String getRegionGeografica() {
		return regionGeografica;
	}

	public void setRegionGeografica(String regionGeografica) {
		this.regionGeografica = regionGeografica;
	}

	public String getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	@Override
	public int compareTo(Codigo o) {
		return this.getCodigoProducto().compareTo(o.getCodigoProducto());
		
	}

	@Override
	public String toString() {
		return "Codigo [codigoProducto=" + codigoProducto + ", regionGeografica=" + regionGeografica
				+ ", digitoVerificador=" + digitoVerificador + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoProducto == null) ? 0 : codigoProducto.hashCode());
		result = prime * result + digitoVerificador;
		result = prime * result + ((regionGeografica == null) ? 0 : regionGeografica.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Codigo other = (Codigo) obj;
		if (codigoProducto == null) {
			if (other.codigoProducto != null)
				return false;
		} else if (!codigoProducto.equals(other.codigoProducto))
			return false;
		if (digitoVerificador != other.digitoVerificador)
			return false;
		if (regionGeografica == null) {
			if (other.regionGeografica != null)
				return false;
		} else if (!regionGeografica.equals(other.regionGeografica))
			return false;
		return true;
	}
	
}
