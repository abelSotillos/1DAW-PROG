package coop.gsd.daw.prog;


public class App {
    public static void main( String[] args ) {
     if(args.length<5||args.length>5) {
    	 System.err.println("Error Tiene que ingresar 5 argumentos IP BD, Nomre BD, UsuBD, passwd BD, CSV");
     }
     Fichero csv = new Fichero(args[4]);
     csv.conexion(args[0],args[1],args[2],args[3]);
    }
}
