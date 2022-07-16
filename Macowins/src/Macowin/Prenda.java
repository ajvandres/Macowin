package Macowin;

import Macowin.EstadoPrenda.EstadoPrenda;

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
	double calcularPrecio() {
		return this.estadoPrenda.modificacionPrecio(this.precio);
	}
	
	
}
