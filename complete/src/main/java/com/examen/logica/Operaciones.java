package com.examen.logica;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Operaciones {
	
	public boolean esPrioritario (Codigo codigo) {
			
			codigo.setCodigoProducto(codigo.getCodigoProducto().toUpperCase());
			
			if (codigo.getCodigoProducto().startsWith("P") || codigo.getCodigoProducto().startsWith("W") ) {
				System.out.println("es prioritario");
				return true;
			}
			System.out.println("no es prioritario");
			return false;
		}
		
	
	public boolean verificar(Codigo codigo) {
		char[] lista = this.convertirToArray(codigo.getRegionGeografica());
		//char[] lista = this.convertirToArray(codigo);
		int suma = 0;
		boolean primeravez = true;
		boolean sigoSumando = true;
		do {
			if (!primeravez) {
				 lista =  this.convertirToArray(String.valueOf(suma));
				 suma = 0;
			}
			for (char output : lista) {
				 suma = suma + Integer.parseInt(String.valueOf(output));
			}
			if (suma <= 9) {
				sigoSumando = false;
			}
			primeravez = false;
		} while (sigoSumando);
		
		if (codigo.getDigitoVerificador() ==  suma) {
			return true;
		}
		return false;
		
	}
	
	private char[] convertirToArray(String numeros) {
		char[] lista = numeros.toCharArray();
		return lista;
	}
	
	public List<Codigo> ordenar(List<Codigo> lista) {
		 Collections.sort(lista, new CodigoProductoSorter());
		 return lista;
	}

	public List<Codigo> interseccion(List<Codigo> lista1, List<Codigo> lista2) {
		List<Codigo> listaUnida =  new ArrayList<Codigo>();
		for (Codigo codigo : lista2) {
		
			if (lista1.contains(codigo)) {
				listaUnida.add(codigo);
			}
		}	
		return ordenar(listaUnida);
	}
	
	public List<Codigo> union(List<Codigo> lista1, List<Codigo> lista2){
		lista1.addAll(lista2);
		return ordenar(lista1);
	}
	
	
	
	
	
	
	
	
}



