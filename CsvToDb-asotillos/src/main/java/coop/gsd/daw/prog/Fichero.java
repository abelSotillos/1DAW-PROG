package coop.gsd.daw.prog;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fichero {
	private Alumno [] Alumnos;
	public Fichero(String ruta) {
		try {
			File f = new File(ruta);
			Scanner inputFile = new Scanner( f );
			int i=0;
			while (inputFile.hasNext()) {
				String [] line = inputFile.nextLine().split(" ");
				int num=Integer.parseInt(line[2]);
				Alumnos[i]=new Alumno(line[0],line[1],num);
				i++;
			}
			inputFile.close();
		} 
		catch (FileNotFoundException e) {
			System.err.println("ERROR: no se puede abrir el fichero");
		}
	
	}
	
}
