package Macowin;

import java.util.ArrayList;

public class Venta {
	ArrayList<Item> items;
	int fecha;
	
	Venta(ArrayList<Item> items, int fecha) {
		this.items = items;
		this.fecha = fecha;
	}
	
	int getFecha() {
		return this.fecha;
	}	
	double totalVenta() {
		return items.stream().mapToDouble(prenda -> prenda.importe()).sum();
	}
	
}
