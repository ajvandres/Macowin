package Macowin;

public class Prenda {
	TipoPrenda tipoPrenda;
	double precio;
	EstadoPrenda estadoPrenda;
	
	Prenda(TipoPrenda tipoPrenda, float precio, EstadoPrenda estadoPrenda) {
		this.tipoPrenda = tipoPrenda;
		this.precio = precio;
		this.estadoPrenda = estadoPrenda; 
	}
	
	TipoPrenda getTipoPrenda() {
		return tipoPrenda;
	}
	EstadoPrenda getEstadoPrenda() {
		return this.estadoPrenda;
	}
	double getPrecio() {
		return estadoPrenda.modificacionPrecio(this.precio);
	}
	
	
}
