package coop.gsd.daw.prog;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;


public class App {
	private static Logger LOGGER;
    public static void main( String[] args ) {
    	 InputStream ficheroDeConfiguracion = App.class.getClassLoader().getResourceAsStream( "config/logging-prod.properties" );
         try {
             LogManager.getLogManager().readConfiguration( ficheroDeConfiguracion );
         } catch ( IOException e ) {
             e.printStackTrace();
             return;
         }
    	LOGGER = Logger.getLogger( "LOGGER TEST 1" );
    	String loglvl = System.getenv().get("LOG_LEVEL");
    	switch (loglvl) {
    	case "SEVERE":
    		System.out.println("Configuracion de logs ha cambiado a :SEVERE");
    		LOGGER.setLevel(Level.SEVERE);
			break;
    	case "WARNING":
    		System.out.println("Configuracion de logs ha cambiado a :WARNING");
    		LOGGER.setLevel(Level.WARNING);
			break;
    	case "INFO":
    		System.out.println("Configuracion de logs ha cambiado a :INFO");
			LOGGER.setLevel(Level.INFO);
			break;
    	case "CONFIG":
    		System.out.println("Configuracion de logs ha cambiado a :CONFIG");
			LOGGER.setLevel(Level.CONFIG);
			break;
		case "FINE":
			System.out.println("Configuracion de logs ha cambiado a :FINE");
			LOGGER.setLevel(Level.FINE);
			break;
		case "FINER":
			System.out.println("Configuracion de logs ha cambiado a :FINNER");
			LOGGER.setLevel(Level.FINER);
			break;
		case "FINEST":
			System.out.println("Configuracion de logs ha cambiado a :FINNEST");
			LOGGER.setLevel(Level.FINEST);
			break;
		default:
			System.err.println("Error al leer la variable de entorno estableciendo log por defecto");
			LOGGER.setLevel(Level.INFO);
			break;
		}
     if(args.length<5||args.length>5) {
    	 LOGGER.log(Level.SEVERE, "Error Tiene que ingresar 5 argumentos IP BD, Nomre BD, UsuBD, passwd BD, CSV");
     }
     LOGGER.log( Level.FINE, "Ingresastes 5 argumentos: IP BD: "+args[4]+"-Nomre BD:"+args[1]+"-UsuBD: "+args[2]+"-Passwd BD:"+args[3]+"-CSV: "+args[4] );
     Fichero csv = new Fichero(args[4]);
     csv.conexion(args[0],args[1],args[2],args[3]);
    }
}
