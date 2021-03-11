
public class if_anidados {
  public static void main(String args[]) {
	  
	  int num=6;
	  int numB=5;
	  
	  if(num>0) {
		  if(num<10) {
			  System.out.println("Bloque 1");
		      if(num>5) {
			  System.out.println("Bloque 3");
		         if(numB>19) {
			          System.out.println("Bloque 4");
		     }
		  }
		  }else {
			  System.out.println("Bloque 2");
		  }
	  }
  }
}
