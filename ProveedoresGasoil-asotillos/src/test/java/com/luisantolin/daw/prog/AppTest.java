package com.luisantolin.daw.prog;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import coop.gsd.daw.prog.Proveedor;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
	String [] args = {"D:\\\\supergasoil.txt"};
	Proveedor proveedor1= new Proveedor(args[0]);
	@Test
    public void comprobarficheroTrue() {
    	assertTrue(proveedor1!=null);
    }
	public void comprobarProvgetProvPrecio() {
		double precio=proveedor1.getImporte(3,1,2023);
		assertEquals( precio, 2.38);
	}
} 
