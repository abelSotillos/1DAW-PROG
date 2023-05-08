package coop.gsd.daw.prog;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
	private static Logger LOGGER;
    public static void main( String[] args ) {
    	LOGGER = Logger.getLogger( "LOGGER TEST 1" );
     if(args.length<5||args.length>5) {
    	 LOGGER.log(Level.WARNING, "Error Tiene que ingresar 5 argumentos IP BD, Nomre BD, UsuBD, passwd BD, CSV");
     }
     Fichero csv = new Fichero(args[4]);
     csv.conexion(args[0],args[1],args[2],args[3]);
    }
}
