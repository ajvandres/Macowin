package Macowin;

import java.util.ArrayList;

public class VentaTarjetaCredito extends Venta {
	
	int cantCuotas;
	double coeficienteFijo;
	
	VentaTarjetaCredito(ArrayList<Item> items, int cantCuotas, double coeficienteFijo, int fecha) {
		super(items, fecha);
		this.cantCuotas = cantCuotas;
		this.coeficienteFijo = coeficienteFijo;
	}
	
	double totalVenta() {
		return items.stream().mapToDouble(prenda -> prenda.importe()).sum()
				* (1+this.cantCuotas * this.coeficienteFijo) +				
				items.stream().mapToDouble(prenda -> prenda.importe()*0.01).sum() ;
	}
}
