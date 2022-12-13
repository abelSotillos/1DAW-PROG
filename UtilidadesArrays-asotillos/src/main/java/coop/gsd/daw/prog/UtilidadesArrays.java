package coop.gsd.daw.prog;
public class UtilidadesArrays 
{
	/** 
	 * Suma un número a todas las posiciones de un array nuevo
	 * @param array recibe el array que quieres sumar
	 * @param num es el valor que incrementa cada uno de los valores del array
	 * @return devuelve un array con la suma de array y num
	 */
	public static int [] incrementar(int [] array ,int num) {
		int [] arrayincrementado= new int [array.length];
		for (int i = 0; i < array.length; i++) {
			arrayincrementado[i]=array[i]+num;
		}
		return arrayincrementado;
		
	}
	/** Suma un número a todas las posiciones de un array
	 * @param array recibe el array que quieres sumar
	 * @param num es el valor que incrementa cada uno de los valores del array
	 */
	public static void incrementarArray(int [] array ,int num) {
		for (int i = 0; i < array.length; i++) {
			array[i]=array[i]+num;
		}
		
	}
	/** cambia las posiciones de un array y te devuelve uno nuevo con los cambios
	 * @param array recibe el array que hay que invertir
	 * @return arrayinvertido devuelve el nuevo array ya invertido
	 */
	public static int[] invertir(int [] array ) {
		int [] arrayinvertido= new int [array.length];
		int cont=array.length-1;
		for (int i = 0; i < array.length; i++) {
			arrayinvertido[cont]=array[i];
			cont--;
		}
		return arrayinvertido;
		
	}
	/**cambia las posiciones de un array
	 * @param array recibe el array que hay que invertir
	 */
	public static void invertirArray(int [] array) {
		int aux=0;
		int cont=array.length-1;
		for (int i = 0; i < array.length; i++) {
			aux=array[cont];
			array[cont]=array[i];
			array[i]=aux;
			cont--;
		}
	}
	/** Lee un array y saca el valor máximo
	 * @param array es el que vamos a sacar el valor
	 * @return devuelve el número mayor
	 */
	public static int maximo(int [] array) {
		int num=-999;
		for (int i = 0; i < array.length; i++) {
			if(array[i]>num) {
				num=array[i];
			}
		}
		return num;
		
	}
	/**Lee un array y debuelve la posición del valor máximo
	 * @param array es el que vamos a sacar el valor
	 * @return la posición del valor
	 */
	public static int maximoIndice(int [] array) {
		int num=-999;
		int cont=0;
		for (int i = 0; i < array.length; i++) {
			if(array[i]>num) {
				cont=i;
				num=array[i];
			}
		}
		return cont;
		
	}
	/** Suma todas las posiciónes del array y saca la media
	 * @param array recibe el array que quieras sacar la media
	 * @return devuelve la media de los valores del array
	 */
	public static double media(int [] array) {
		int suma=0;
		for (int i = 0; i < array.length; i++) {
			suma=suma+array[i];
		}
		return suma/array.length;
		
	}
	/**Lee un array y debuelve la posición del valor mínimo
	 * @param array es el que vamos a sacar el valor
	 * @return devuelve el número menor
	 */
	public static int minimo(int [] array) {
		int num=999;
		for (int i = 0; i < array.length; i++) {
			if(array[i]<num) {
				num=array[i];
			}
		}
		return num;
		
	}
	
	/**Lee un array y debuelve la posición del valor mínimo
	 * @param array es el que vamos a sacar el valor
	 * @return la posición del valor
	 */
	public static int minimoIndice(int [] array) {
		int num=999;
		int cont=0;
		for (int i = 0; i < array.length; i++) {
			if(array[i]<num) {
				cont=i;
				num=array[i];
			}
		}
		return cont;
		
	}
}
