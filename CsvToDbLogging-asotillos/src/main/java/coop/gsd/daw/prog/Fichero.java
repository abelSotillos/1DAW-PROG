package coop.gsd.daw.prog;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Fichero {
	private static Logger LOGGER= Logger.getLogger( "LOGGER TEST 1" );;
	private Alumno [] Alumnos=new Alumno[10000];
	private int lineas;
	/**Abre el fichero y crea un alumno por cada línea
	 * @param ruta
	 */
	public Fichero(String ruta) {
		try {
			File f = new File(ruta);
			Scanner inputFile = new Scanner( f );
			int i=0;
			while (inputFile.hasNext()) {
				String [] line = inputFile.nextLine().split(",");
				int num=Integer.parseInt(line[1]);
				Alumnos[i]=new Alumno(line[0],line[2],num);
				LOGGER.log( Level.FINE, "Usuario "+line[2]+" Creado" );
				i++;
			}
			lineas=i;
			LOGGER.log( Level.INFO, "Usuarios leídos:"+lineas );
			inputFile.close();
		} 
		catch (FileNotFoundException e) {
			LOGGER.log(Level.SEVERE,"ERROR: no se puede abrir el fichero");
		}
	
	}
	/**Crea la conexión con la base de datos y llama a insertarAlumno por cada alumno 
	 * @param ip
	 * @param bd
	 * @param usu
	 * @param passwd
	 */
	public void conexion(String ip,String bd,String usu,String passwd ) {
		 try {
	            Connection conn = DriverManager.getConnection( "jdbc:oracle:thin:@//"+ip+"/"+bd,usu,passwd );
	            LOGGER.log(Level.INFO, "Conexión exsitosa");
	            for (int i = 0; i < lineas; i++) {
		            Alumnos[i].insertarAlumno( conn );
				}
	            conn.close();
	        } catch ( SQLException e ) {
	        	LOGGER.log(Level.SEVERE, "Fallo en la BBDD: " + e.getMessage() );
	        }
	}
}