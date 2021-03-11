import java.util.Scanner;

public class MatrizBidimensional {

	
	public static void main(String args[]) {
		
		int[][] arreglo=new int[4][4];
		Scanner leer=new Scanner(System.in);
		int i,j;
		
		for(i=0;i<arreglo.length;i++) {
		   for(j=0;j<arreglo.length;j++) {
			   System.out.println("Ingrese dato");
			   arreglo[i][j]=leer.nextInt();
		   }
		}
		
		for(i=0;i<arreglo.length;i++) {
			   for(j=0;j<arreglo.length;j++) {
				   System.out.println( arreglo[i][j]);
				  
			   }
			}
	}
}
