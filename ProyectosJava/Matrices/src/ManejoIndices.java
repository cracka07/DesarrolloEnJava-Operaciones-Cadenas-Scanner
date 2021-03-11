import java.util.Scanner;

public class ManejoIndices {
   
  public static void main(String args[]) {
	  
	  int arreglo[]=new int[10];
	  Scanner leer=new Scanner(System.in);
	  
	  int i;
	  
	  for(i=0;i<arreglo.length;i++) {
		  System.out.println("Poner Dato");
		  arreglo[i]=leer.nextInt();
	  }
	  
	  for(i=0;i<arreglo.length;i++) {
		  System.out.println(arreglo[i]);
	  }
	  
  }
}
