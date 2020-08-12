package com.consultorio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.examen.logica.Codigo;
import com.examen.logica.CodigoProductoSorter;
import com.examen.logica.Operaciones;

public class Test {

	public static void main(String[] args) {
		try {
			
		Codigo c1 = new Codigo("DCR-88578-9");
		Codigo c2 = new Codigo("PCR-88578-9");
		Codigo c3 = new Codigo("ECR-88578-9");
		Codigo c4 = new Codigo("ECR-88578-7");
		Codigo c5 = new Codigo("ECR-88578-3");

		
		//clase que realiza los puntos solicitados
		Operaciones op = new Operaciones();
		
		//verificamos si son prioritarios o no
		op.esPrioritario(c1);
		op.esPrioritario(c2);
		op.esPrioritario(c3);
		op.esPrioritario(c4);
		op.esPrioritario(c5);
		
	
		//realizamos la verificacio si es valida
		op.verificar(c1);
		op.verificar(c2);
		op.verificar(c3);
		op.verificar(c4);
		op.verificar(c5);
				
		//ordenamos la lista
		List<Codigo> lista1 = new ArrayList<Codigo>();
		lista1.add(c1);
		lista1.add(c2);
		lista1.add(c3);
		lista1.add(c4);
		lista1.add(c5);
		
		op.ordenar(lista1);
		
		
		//hacemos la union
		List<Codigo> lista2 = new ArrayList<Codigo>();
		Codigo c6;

			c6 = new Codigo("DCR-88578-9");
			Codigo c7 = new Codigo("PCR-88578-9");
			Codigo c8 = new Codigo("ECR-88578-9");
			Codigo c9 = new Codigo("ECR-88578-7");
			Codigo c10 = new Codigo("ECR-88578-3");
			lista2.add(c6);
		
			lista2.add(c7);
			lista2.add(c8);
			lista2.add(c9);
			lista2.add(c10);
			
			op.union(lista1, lista2);
			
			//hacemos la interseccion 
			
			op.interseccion(lista1, lista2);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
