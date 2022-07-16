package Macowin;

import java.util.ArrayList;

public class Venta {
	ArrayList<Prenda> prendas = new ArrayList<>();
	
	double totalVenta() {
		return prendas.stream().mapToDouble(prenda -> prenda.calcularPrecio()).sum();
	}
	
}
