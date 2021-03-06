package Macowin;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;

public class Testeo {

  @Test
  public void ventaPantalon() {
    Prenda pantalon = new Prenda(TipoPrenda.PANTALONES, 57, new Nueva() );
    Item pantalones = new Item(pantalon, 3);
    ArrayList<Item> items = new ArrayList<>();
    items.add(pantalones);
    Venta venta = new Venta(items, 20220718);
    Assertions.assertEquals(171, venta.totalVenta());
  }


	@Test
	public void venta20220105() {
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
	  
	  Assertions.assertEquals(735.62, negocio.getVentasFecha(20220105));
	  Assertions.assertEquals(1624.35, Math.round(negocio.getVentasFecha(20220106) * 100.0) / 100.0);
	}

}