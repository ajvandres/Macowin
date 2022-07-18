package Macowin;

public class Promocion implements EstadoPrenda {
	
	double valorFijo;
	
	Promocion(float valorFijo) {
		this.valorFijo = valorFijo;
	}
	
	public double modificacionPrecio(double precio) {
		return precio - this.valorFijo;
	}
}