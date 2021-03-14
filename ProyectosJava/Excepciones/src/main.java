
public class main {

	public static void main(String[] args) {
	   
//		error por ende lo pongo en un try,catch
		try {
			int numero= Integer.parseInt("L");
			System.out.println("Bloque 1");
		}catch(Exception e){
            System.out.println("Bloque 2");			
		}finally {
			System.out.println("Bloque 3");
		}
		

	}

}
