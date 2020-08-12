package com.examen.logica;

import java.util.Comparator;

public class CodigoProductoSorter implements Comparator<Codigo> {

	@Override
	public int compare(Codigo o1, Codigo o2) {
		return o1.getCodigoProducto().compareTo(o2.getCodigoProducto());
	}

}
