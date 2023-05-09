package coop.gsd.daw.prog;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Alumno {
	private static Logger LOGGER=Logger.getLogger( "LOGGER TEST 1" );;
	private String Modulo,id1;
	private int numLista;
	public Alumno(String modulo, String id1, int numLista) {
		Modulo = modulo;
		this.id1 = id1;
		this.numLista = numLista;
	}
	/**Inserta cada alumno en la base de datos
	 * @param conn -> conexion
	 * @throws SQLException
	 */
	public void insertarAlumno( Connection conn ) throws SQLException {
    	String insertQuery = "INSERT INTO estudiantes_tbl (num_lista, id1, Modulo) VALUES (?, ?, ?)";
    	PreparedStatement pstmt = conn.prepareStatement(insertQuery);
    	pstmt.setInt(1, this.numLista);
    	pstmt.setString(2, this.id1);
    	pstmt.setString(3, this.Modulo);
    	pstmt.executeUpdate();
    	pstmt.close();
    	LOGGER.log( Level.FINE, "Usuario "+this.id1+" Insertado en la BBDD" );
    }
}
