package coop.gsd.daw.prog;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Proveedor {
	private String Nombre;
	private Precio [] ProvPrecio;
	
	public Proveedor(String nombre) {
		String [] SepararNombreFichero= nombre.split("/|\\\\|\\.");
		Nombre = SepararNombreFichero[SepararNombreFichero.length-2];
		try {
				File f = new File(nombre);
				Scanner inputFile = new Scanner( f );
				int i=0;
				while(inputFile.hasNextLine()) {
					 inputFile.nextLine();
					i++;
				}
				inputFile.close();
				Scanner inputFile2 = new Scanner( f );
				ProvPrecio= new Precio[i];
				i=0;
				while (inputFile2.hasNext()) {
					String [] line = inputFile2.nextLine().split(" ");
					SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
					Date fecha = null ;
					try {
						fecha = (Date) formato.parse(line[0]);
					} catch (ParseException e) {
					    System.out.println("No se pudo parsear la fecha: " + line[0]);
					    e.printStackTrace();
					}
					double importe = Double.parseDouble(line[1]);
					ProvPrecio[i]=new Precio(fecha,importe);
					i++;
				}
				inputFile2.close();
		} catch (FileNotFoundException e) {
			System.err.println("ERROR: no se puede abrir el fichero");
		}
		
	}
	public Precio[] getProvPrecio() {
		return ProvPrecio;
	}
	public String getNombre() {
		return Nombre;
	}
	@Override
	public String toString() {
		String toString=Nombre+"\n";
		for (int i = 0; i < ProvPrecio.length; i++) {
			toString+=ProvPrecio[0].getFecha()+" --> "+ProvPrecio[0].getImporte()+"\n";
		}
		return toString;
	}
	
	
}
