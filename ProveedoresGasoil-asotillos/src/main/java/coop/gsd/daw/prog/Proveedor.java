package coop.gsd.daw.prog;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;

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
				System.out.println(i);
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
	public String toString() {
		String toString=Nombre+"\n";
		for (int i = 0; i < ProvPrecio.length; i++) {
			toString+=ProvPrecio[0].getFecha()+" --> "+ProvPrecio[0].getImporte()+"\n";
		}
		return toString; 
	}
	public Precio getPrecioMinimo() {
		int aux=0;
		for (int i = 0; i < ProvPrecio.length; i++) {
			if(ProvPrecio[i].getImporte()<ProvPrecio[aux].getImporte()) {
				aux=i;
			}
		}
		return ProvPrecio[aux];
	}
	public double getMediaMensual(int mes,int año) {
		if(mes>12||año<1000||año>9999) {return 0;}
		double suma=0;
		int cont=0;
		for (int i = 0; i < ProvPrecio.length; i++) {
			Date aux=ProvPrecio[i].getFecha();
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(aux);
			if(mes==calendar.get(Calendar.MONTH)+1) {
				if(año==calendar.get(Calendar.YEAR)){
					suma+=ProvPrecio[i].getImporte();  
					cont++;
				}
			}
		}
		return suma/cont;
	}
	public double getImporte(int dia,int mes,int año) {
		if(dia>31||mes>12) {return 0;}
		for (int i = 0; i < ProvPrecio.length; i++) {
			Date aux=ProvPrecio[i].getFecha();
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(aux);
			if(dia==calendar.get(Calendar.DAY_OF_MONTH)) {
				if(mes==calendar.get(Calendar.MONTH)+1) {
					if(año==calendar.get(Calendar.YEAR)) {
						return ProvPrecio[i].getImporte();
					}
				}
			}
		}
		return 0;
	}
	
}
