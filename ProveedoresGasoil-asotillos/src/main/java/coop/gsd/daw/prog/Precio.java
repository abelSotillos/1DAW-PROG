package coop.gsd.daw.prog;

import java.util.Date;

public class Precio {
	private Date Fecha;
	private Double Importe;
	public Precio(Date fecha2, Double importe) {
		Fecha = fecha2;
		Importe = importe;
	}
	public Date getFecha() {
		return Fecha;
	}
	public Double getImporte() {
		return Importe;
	}
	
}
