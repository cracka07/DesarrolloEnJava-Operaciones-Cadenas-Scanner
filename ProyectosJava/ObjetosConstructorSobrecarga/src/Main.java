
public class Main {

	public static void main(String args[]) {
//		Creación de objetos
//		PASARLE ARGUMENTOS DEL CONSTRUCTOR o no
		Robot robot=new Robot();
		System.out.println(robot.ext);

//		Accediendo a todos los atributos y métodos	
		
		robot.caminar();
//		METODO SOBRECARGADO
		robot.caminar("jUAN");
		robot.caminar(8);
		robot.caminar(6, 2);
		System.out.println(robot.ext);
	}
}
