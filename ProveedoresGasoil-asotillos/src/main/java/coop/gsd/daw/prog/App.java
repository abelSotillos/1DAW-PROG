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
		System.out.println(proveedor1.getNombre());
		System.out.print(proveedor1.toString());
		System.out.println(proveedor2.getNombre());
		System.out.print(proveedor2.toString()); 
		System.out.println("Importe del 3/1/2023 Proveedor:"+proveedor1.getNombre()+" Importe:"+proveedor1.getImporte(3,1,2023));
		System.out.println("Media mensual del 1/2023 Proveedor:"+proveedor2.getNombre()+" Media:"+proveedor2.getMediaMensual(1,2023));
		System.out.println("El precio minimo de Proveedor:"+proveedor1.getNombre()+" Importe:"+proveedor1.getPrecioMinimo().getImporte());
		System.out.println("El precio minimo de Proveedor:"+proveedor2.getNombre()+" Importe:"+proveedor2.getPrecioMinimo().getImporte());
	}
}
