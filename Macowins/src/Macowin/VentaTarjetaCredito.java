package Macowin;

import java.util.ArrayList;

public class VentaTarjetaCredito extends Venta {
	
	int cantCuotas;
	double coeficienteFijo;
	
	VentaTarjetaCredito(ArrayList<Prenda> prendas, int cantCuotas, double coeficienteFijo, int fecha) {
		super(prendas, fecha);
		this.cantCuotas = cantCuotas;
		this.coeficienteFijo = coeficienteFijo;
	}
	
	double totalVenta() {
		return prendas.stream().mapToDouble(prenda -> prenda.calcularPrecio()).sum()
				* (this.cantCuotas * this.coeficienteFijo +				
				prendas.stream().mapToDouble(prenda -> prenda.calcularPrecio()*0.01).sum() );
	}
}
