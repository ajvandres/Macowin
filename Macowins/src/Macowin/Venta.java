package Macowin;

import java.util.ArrayList;

public class Venta {
	ArrayList<Prenda> prendas;
	int fecha;
	
	Venta(ArrayList<Prenda> prendas, int fecha) {
		this.prendas = prendas;
		this.fecha = fecha;
	}
	
	int getFecha() {
		return this.fecha;
	}	
	double totalVenta() {
		return prendas.stream().mapToDouble(prenda -> prenda.calcularPrecio()).sum();
	}
	
}
