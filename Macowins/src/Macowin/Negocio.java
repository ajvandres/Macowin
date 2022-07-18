package Macowin;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Negocio {
	
	ArrayList<Venta> ventas = new ArrayList<>();
	
	void agregarVenta(Venta venta) {
		ventas.add(venta);
	}
	double getVentasFecha(int fecha) {
		List<Venta> ventaFecha = ventas.stream().filter(venta -> venta.getFecha() == fecha).collect(Collectors.toList());
		return ventaFecha.stream().mapToDouble(venta -> venta.totalVenta()).sum();		
	}
}
