
public class Robot {
    int ext;
    boolean extras;
    
    
//    DEFINIENDO CONSTRUCTOR
    public Robot() {
    	ext=3;
    	extras=true;
    }
//    SOBRECARGA DE CONSTRUCTORES
    public Robot(String cadena) {
    	ext=4;
    	extras=false;
    }
    public void caminar() {
    	System.out.println("Estoy caminando");
    	ext=ext + 2;
    }
    public void caminar(int numero) {
    	ext=ext+numero;
    }
//    METODO SOBRECARGADO
    public void caminar(String cadena) {
    	System.out.println("Metodo sobrecargado");
    }
    public void caminar(int num,int num2) {
    	ext=ext+num+num2;
    }
}
