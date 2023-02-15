package com.luisantolin.daw.prog;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import coop.gsd.daw.prog.Proveedor;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
	Proveedor proveedor1= new Proveedor("supergasoil.txt");
	Proveedor proveedor2= new Proveedor("D:\\\\asdasdfas.txt");
	@Test
    public void comprobarficheroTrue() {
    	assertTrue(proveedor1!=null);
    }
	
	@Test
	public void comprobarProvgetProvPrecioTrue() {
		double preciobien=2.38;
		double precio=proveedor1.getImporte(3,1,2023);
		assertEquals( precio, preciobien);
	}
	@Test
	public void comprobarProvgetProvPrecioFalse() {
		double preciobien=0;
		double precio=proveedor1.getImporte(3,1,2020);
		assertEquals( precio, preciobien);
	}
	@Test
	public void comprobarProvgetProvPrecioFechaMal() {
		double preciobien=0;
		double precio=proveedor1.getImporte(300,1,2020);
		assertEquals( precio, preciobien);
	}
	@Test
	public void comprobarProvGetPrecMin() {
		Double precio=proveedor1.getPrecioMinimo().getImporte();
		Double precioBien = 2.0;
		assertEquals(precio, precioBien);
		
	}
	@Test
	public void comprobarProvGetNombre() {
		String Nombre=proveedor1.getNombre();
		String NombreBien="supergasoil";
		assertEquals(Nombre, NombreBien);
	}
	@Test
	public void comprobarProvGetMediaMensualBien() {
		double media=proveedor1.getMediaMensual(1, 2023);
		double mediaBien=2.4025;
		assertEquals(media, mediaBien);
	}
	@Test
	public void comprobarProvGetMediaMensualMal() {
		double media=proveedor1.getMediaMensual(123, 2023);
		double mediaBien=0;
		assertEquals(media, mediaBien);
	}
} 
