package com.examen.logica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Codigo c1 = new Codigo("DCR-88578-9");
		Codigo c2 = new Codigo("CCR-88578-9");
		Codigo c3 = new Codigo("ECR-88578-9");

		Operaciones op = new Operaciones();
		
		List<Codigo> lista = new ArrayList<Codigo>();
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		
		Collections.sort(lista, new CodigoProductoSorter());
		System.out.println(lista);
		
	}

}
