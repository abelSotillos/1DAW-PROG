package coop.gsd.daw.prog;

import java.io.FileNotFoundException;

public class App {
	public static void main( String[] args ) throws FileNotFoundException {
		if (args.length < 1 || args.length>10) {
			System.err.println("USO:<nombre-de-fichero> (Máximo 10,Mínimo1)");
			return;
		}
		Proveedor proveedor1= new Proveedor(args[0]);
		Proveedor proveedor2= new Proveedor(args[1]);
		Proveedor proveedor3= new Proveedor(args[2]);
		System.out.print(proveedor1.toString()); 
		System.out.print(proveedor2.toString()); 
		System.out.print(proveedor3.toString());
		System.out.println(proveedor1.getNombre());
		System.out.println(proveedor1.getImporte(3,1,2023));
		System.out.println(proveedor1.getMediaMensual(1,2023));
		System.out.println(proveedor1.getPrecioMinimo().getImporte());
	}
}
