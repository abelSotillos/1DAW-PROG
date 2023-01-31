package coop.gsd.daw.prog;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
	public static void main( String[] args ) {
		if (args.length < 1) {
			System.err.println("USO: <comando> <nombre-de-fichero>");
			return;
		}
		try {
			File f = new File(args[0]);
			Scanner inputFile = new Scanner( f );

			while (inputFile.hasNext()) {
				String line = inputFile.nextLine();
				String[] parts = line.split("\\,");
				for (int i = 0; i < parts.length; i++) {
					System.out.print("["+parts[i]+"]");
				}
				System.out.println("");
			}

			inputFile.close();
		} catch (FileNotFoundException e) {
			System.err.println("ERROR: no se puede abrir el fichero");
		}
	}

}
