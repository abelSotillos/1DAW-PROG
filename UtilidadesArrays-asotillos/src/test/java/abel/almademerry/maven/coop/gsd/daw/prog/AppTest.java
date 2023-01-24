package abel.almademerry.maven.coop.gsd.daw.prog;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import coop.gsd.daw.prog.UtilidadesArrays;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	int[] ArrayBien = {1,2,3,4,5};
	int[] ArrayBienComp = {1,2,3,4,5};
	int[] ArrayNegativo= {1,2,-3,4,7};
	int[] cero= {0};
	@Test
	@DisplayName("Test prueba incrementar ArrayNormal")
	public void incrementarTrue() {
		int[] ArrayBien = {2,3,4,5,6};
		int[]ArrayIncrementar=UtilidadesArrays.incrementar(this.ArrayBien, 1);
		assertArrayEquals(ArrayBien, ArrayIncrementar);
	}
	@Test
	@DisplayName("Test prueba incrementarArray ArrayNormal")
	public void incrementarArrayTrue() {
		int[] ArrayBien = {2,3,4,5,6};
		UtilidadesArrays.incrementarArray(this.ArrayBien, 1);
		assertArrayEquals(ArrayBien, this.ArrayBien);
	}
	@Test
	@DisplayName("Test prueba invertir ArrayNormal")
	public void invertirTrue() {
		int[] ArrayBien = {5,4,3,2,1};
		int[]ArrayInvertir=UtilidadesArrays.invertir(this.ArrayBien);
		assertArrayEquals(ArrayBien, ArrayInvertir);
	}
	@Test
	@DisplayName("Test prueba invertirArray ArrayNormal")
	public void invertirArrayTrue() {
		int[] ArrayBien = {5,4,3,2,1};
		UtilidadesArrays.invertirArray(this.ArrayBien);
		assertArrayEquals(ArrayBien, this.ArrayBien);
	}
	@Test
	@DisplayName("Test prueba maximo ArrayNormal")
	public void maximoTrue() {
		int Bien = 5;
		int vuelve=UtilidadesArrays.maximo(this.ArrayBien);
		assertEquals(Bien,vuelve );
	}
	@Test
	@DisplayName("Test prueba maximoIndice ArrayNormal")
	public void maximoIndiceTrue() {
		int Bien = 4;
		int vuelve=UtilidadesArrays.maximoIndice(this.ArrayBien);
		assertEquals(Bien,vuelve );
	}
	@Test
	@DisplayName("Test prueba media ArrayNormal")
	public void mediaTrue() {
		double Bien = 3;
		double vuelve=UtilidadesArrays.media(this.ArrayBien);
		assertEquals(Bien,vuelve );
	}
	@Test
	@DisplayName("Test prueba minimo ArrayNormal")
	public void minimoTrue() {
		int Bien = 1;
		int vuelve=UtilidadesArrays.minimo(this.ArrayBien);
		assertEquals(Bien,vuelve );
	}
	@Test
	@DisplayName("Test prueba minimoIndice ArrayNormal")
	public void minimoIndiceTrue() {
		int Bien = 0;
		int vuelve=UtilidadesArrays.minimoIndice(this.ArrayBien);
		assertEquals(Bien,vuelve );
	}
	@Test
	@DisplayName("Test prueba incrementar ArrayNegativo")
	public void incrementarTrueNeg() {
		int[] ArrayBien = {0,1,-4,3,6};
		int[]ArrayIncrementar=UtilidadesArrays.incrementar(this.ArrayNegativo, -1);
		assertArrayEquals(ArrayBien, ArrayIncrementar);
	}
	@Test
	@DisplayName("Test prueba incrementarArray ArrayNegativo")
	public void incrementarArrayTrueNeg() {
		int[] ArrayBien = {0,1,-4,3,6};
		UtilidadesArrays.incrementarArray(this.ArrayNegativo, -1);
		assertArrayEquals(ArrayBien, this.ArrayNegativo);
	}
	@Test
	@DisplayName("Test prueba invertirTrue ArrayNegativo")
	public void invertirTrueNeg() {
		int[] ArrayBien = {7,4,-3,2,1};
		int[]ArrayInvertir=UtilidadesArrays.invertir(this.ArrayNegativo);
		assertArrayEquals(ArrayBien, ArrayInvertir);
	}
	@Test
	@DisplayName("Test prueba invertir ArrayNegativo")
	public void invertirArrayTrueNeg() {
		int[] ArrayBien = {7,4,-3,2,1};
		UtilidadesArrays.invertirArray(this.ArrayNegativo);
		assertArrayEquals(ArrayBien, this.ArrayNegativo);
	}
	@Test
	@DisplayName("Test prueba maximo ArrayNegativo")
	public void maximoTrueNeg() {
		int Bien = 7;
		int vuelve=UtilidadesArrays.maximo(this.ArrayNegativo);
		assertEquals(Bien,vuelve );
	}
	@Test
	@DisplayName("Test prueba maximoIndice ArrayNegativo")
	public void maximoIndiceTrueNeg() {
		int Bien = 4;
		int vuelve=UtilidadesArrays.maximoIndice(this.ArrayNegativo);
		assertEquals(Bien,vuelve );
	}
	@Test
	@DisplayName("Test prueba media ArrayNegativo")
	public void mediaTrueNeg() {
		double Bien = 2.2;
		double vuelve=UtilidadesArrays.media(this.ArrayNegativo);
		assertEquals(Bien,vuelve );
	}
	@Test
	@DisplayName("Test prueba minimo ArrayNegativo")
	public void minimoTrueNeg() {
		int Bien = -3;
		int vuelve=UtilidadesArrays.minimo(this.ArrayNegativo);
		assertEquals(Bien,vuelve );
	}
	@Test
	@DisplayName("Test prueba minimoIndice ArrayNegativo")
	public void minimoIndiceTrueNeg() {
		int Bien = 2;
		int vuelve=UtilidadesArrays.minimoIndice(this.ArrayNegativo);
		assertEquals(Bien,vuelve );
	}
	@Test
	@DisplayName("Test crea objeto vacío para 100% de covertura")
	public void Objeto() {
		UtilidadesArrays A1 = new UtilidadesArrays();
		assertTrue(true);
	}
	@Test
	@DisplayName("Test prueba incrementar ArrayCero")
	public void incrementarCero() {
		int[] ArrayBien = {1};
		assertArrayEquals(ArrayBien,UtilidadesArrays.incrementar(cero,1));
	}
	@Test
	@DisplayName("Test prueba incrementarArray ArrayCero")
	public void incrementarArrayCero() {
		int[] ArrayBien = {1};
		UtilidadesArrays.incrementarArray(this.cero, 1);
		assertArrayEquals(ArrayBien, this.cero);
	}
	@Test
	@DisplayName("Test prueba invertir ArrayCero")
	public void invertirCero() {
		int[] ArrayBien = {0};
		int[]ArrayInvertir=UtilidadesArrays.invertir(this.cero);
		assertArrayEquals(ArrayBien, ArrayInvertir);
	}
	@Test
	@DisplayName("Test prueba invertirArray ArrayCero")
	public void invertirArrayCero() {
		int[] ArrayBien = {0};
		UtilidadesArrays.invertirArray(this.cero);
		assertArrayEquals(ArrayBien, this.cero);
	}
	@Test
	@DisplayName("Test prueba maximo ArrayCero")
	public void maximoCero() {
		int Bien = 0;
		int vuelve=UtilidadesArrays.maximo(this.cero);
		assertEquals(Bien,vuelve );
	}
	@Test
	@DisplayName("Test prueba maximoIndice ArrayCero")
	public void maximoIndiceCero() {
		int Bien = 0;
		int vuelve=UtilidadesArrays.maximoIndice(this.cero);
		assertEquals(Bien,vuelve );
	}
	@Test
	@DisplayName("Test prueba media ArrayCero")
	public void mediaCero() {
		double Bien = 0;
		double vuelve=UtilidadesArrays.media(this.cero);
		assertEquals(Bien,vuelve );
	}
	@Test
	@DisplayName("Test prueba minimo ArrayCero")
	public void minimoCero() {
		int Bien = 0;
		int vuelve=UtilidadesArrays.minimo(this.cero);
		assertEquals(Bien,vuelve );
	}
	@Test
	@DisplayName("Test prueba minimoIndice ArrayCero")
	public void minimoIndiceCero() {
		int Bien = 0;
		int vuelve=UtilidadesArrays.minimoIndice(this.cero);
		assertEquals(Bien,vuelve );
	}
	@Test
	@DisplayName("Test prueba en incrementar no toca el Array que le paso")
	public void incrementarNoTocaArray() {
		int[]ArrayIncrementar=UtilidadesArrays.incrementar(this.ArrayBien, 1);
		assertArrayEquals(this.ArrayBienComp,this.ArrayBien );
	}
	@Test
	@DisplayName("Test prueba en invertir no toca el Array que le paso")
	public void invertirNoTocaArray() {
		int[]ArrayInvertir=UtilidadesArrays.invertir(this.ArrayBien);
		assertArrayEquals(this.ArrayBienComp,this.ArrayBien );
	}
	@Test
	@DisplayName("Test prueba en maximo no toca el Array que le paso")
	public void maximoNoTocaArray() {
		int vuelve=UtilidadesArrays.maximo(this.ArrayBien);
		assertArrayEquals(this.ArrayBienComp,this.ArrayBien );
	}
	@Test
	@DisplayName("Test prueba en maximoIndice no toca el Array que le paso")
	public void maximoIndiceNoTocaArray() {
		int vuelve=UtilidadesArrays.maximoIndice(this.ArrayBien);
		assertArrayEquals(this.ArrayBienComp,this.ArrayBien );
	}
	@Test
	@DisplayName("Test prueba en media no toca el Array que le paso")
	public void mediaNoTocaArray() {
		double vuelve=UtilidadesArrays.media(this.ArrayBien);
		assertArrayEquals(this.ArrayBienComp,this.ArrayBien );
	}
	@Test
	@DisplayName("Test prueba en minimo no toca el Array que le paso")
	public void minimoNoTocaArray() {
		int vuelve=UtilidadesArrays.minimo(this.ArrayBien);
		assertArrayEquals(this.ArrayBienComp,this.ArrayBien );
	}
	@Test
	@DisplayName("Test prueba en minimoIndice no toca el Array que le paso")
	public void minimoIndiceNoTocaArray() {
		int vuelve=UtilidadesArrays.minimoIndice(this.ArrayBien);
		assertArrayEquals(this.ArrayBienComp,this.ArrayBien );
	}
}
