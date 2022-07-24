package Macowin;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;

public class Programa {
	 public static void main(String args[])
	    {
		  Prenda saco = new Prenda(TipoPrenda.SACOS, 39, new Nueva() );
		  ArrayList<Item> items1 = new ArrayList<>();
		  Item sacos = new Item(saco, 2);
		  items1.add(sacos);
		  Venta venta1 = new Venta(items1, 20220105);
		  
		  Prenda pantalon = new Prenda(TipoPrenda.PANTALONES, 93, new Promocion(15) );
		  Prenda camisa = new Prenda(TipoPrenda.CAMISAS, 134, new Liquidacion() );  
		  ArrayList<Item> items2 = new ArrayList<>();
		  Item pantalones = new Item(pantalon, 3);
		  Item camisas = new Item(camisa, 4);
		  items2.add(pantalones);
		  items2.add(camisas);	  
		  Venta venta2 = new VentaTarjetaCredito(items2, 3, 0.1, 20220105);
		  
		  Prenda pantalon1 = new Prenda(TipoPrenda.PANTALONES, 147, new Nueva() );	    
		  ArrayList<Item> items3 = new ArrayList<>();
		  Item pantalones1 = new Item(pantalon1, 5);
		  items3.add(pantalones1);	  	  
		  Venta venta3 = new VentaTarjetaCredito(items3, 6, 0.2, 20220106);
		  
		  Negocio negocio = new Negocio();
		  negocio.agregarVenta(venta1);
		  negocio.agregarVenta(venta2);
		  negocio.agregarVenta(venta3);
		  
		  //Assertions.assertEquals(657.52, negocio.getVentasFecha(20220105));   
		 
		  System.out.println(saco.getPrecio());
		  System.out.println(pantalon.getPrecio());
		  System.out.println(camisa.getPrecio());
		  System.out.println(venta1.totalVenta());
		  System.out.println(pantalones.importe());
		  System.out.println(camisas.importe());
		  System.out.println(venta2.totalVenta());
		  System.out.println(negocio.getVentasFecha(20220105));
		  
		  System.out.println(Math.round(negocio.getVentasFecha(20220106) * 100.0) / 100.0);
	    }
}
