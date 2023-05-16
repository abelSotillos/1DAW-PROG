package coop.gsd.daw.prog;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
	private static Logger LOGGER;
    public static void main( String[] args ) {
    	LOGGER = Logger.getLogger( "LOGGER TEST 1" );
    	LOGGER.setLevel(Level.FINEST);
    	System.out.println(LOGGER.getLevel());
     if(args.length<5||args.length>5) {
    	 LOGGER.log(Level.SEVERE, "Error Tiene que ingresar 5 argumentos IP BD, Nomre BD, UsuBD, passwd BD, CSV");
     }
     LOGGER.log( Level.FINE, "Ingresastes 5 argumentos: IP BD: "+args[4]+"-Nomre BD:"+args[1]+"-UsuBD: "+args[2]+"-Passwd BD:"+args[3]+"-CSV: "+args[4] );
     System.out.println(LOGGER.getLevel());
     Fichero csv = new Fichero(args[4]);
     csv.conexion(args[0],args[1],args[2],args[3]);
    }
}
