import java.util.Scanner;

public class Main {
/*
 * bloque de comentario
 * bloque de comentario
 * bloque de comentario
   
 */
	public static void main(String args[]) {
		int numero=32;
		System.out.println(numero);
		
//		DIVISIÓN ENTRE ENTEROS, VALOR ENTERO
	int numF=33/2;  
		System.out.println(numF);
//		float se indica con f
		float num=19.3f;
		System.out.println(num);
//		tipo double más extenso que float
		
		double numD=32.5;
	    System.out.println(numD);
	    
//	    cadena de texto, String
	    String cadena="HOla mundo";
	    System.out.println(cadena);
//	   imprimir comillas dobles
	    String cadena1="\"\"";
	    System.out.println(cadena1);
	    // ingreso por teclado. CLASE SCANNER
	    System.out.println("Ingrese su nombre:");

	    Scanner leer=new Scanner(System.in);
	    int nom=leer.nextInt();
	    System.out.println(nom);
	    
	}
}
