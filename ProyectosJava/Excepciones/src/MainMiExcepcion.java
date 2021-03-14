
public class MainMiExcepcion {

	public static void main(String[] args) {
		try {
			System.out.println("provocamos el error");
			throw new MiExcepcion();
		}catch(MiExcepcion me) {
			System.out.println(me.excepcionError() );
		}
	}

}
