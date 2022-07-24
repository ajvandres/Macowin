package Macowin;

public class Item {
	
	Prenda prenda;
	int cantidad;
	
	Item(Prenda prenda, int cantidad) {
		this.prenda = prenda;
		this.cantidad = cantidad; 
	}
	
	double importe() {
		return this.cantidad * prenda.getPrecio();
	}
}
