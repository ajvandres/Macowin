package Macowin;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import Macowin.EstadoPrenda.Nueva;


class Testeo {

	  @Test
	  public void ventaPantalon() {
	    Prenda pantalon = new Prenda(TipoPrenda.PANTALONES, 57, new Nueva() );
	    ArrayList<Prenda> prendas = new ArrayList<>();
	    prendas.add(pantalon);
	    Venta venta = new Venta(prendas, 20220718);
	    Assertions.assertEquals(57, venta.totalVenta());
	  }

}
