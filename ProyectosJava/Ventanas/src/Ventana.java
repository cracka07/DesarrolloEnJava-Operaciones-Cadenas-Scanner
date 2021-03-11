import javax.swing.*;


public class Ventana {
   JFrame ventana;
   JPanel panelA,panelB;
//   ETIQUETA
   JLabel saludo,saludo2;
   JButton boton;
	
	
	public void crearPanelA() {
		panelA=new JPanel();
		saludo=new JLabel("Bienvenido");
//		saludo2=new JLabel("Bienvenido de nuevo");
//   	poner texto a la etiqueta
//		saludo.setText("Bienvenido");
		panelA.setLayout(new BoxLayout(panelA,BoxLayout.X_AXIS));//Poner tipo de contenedor en la caja y en eje x
//		panelA.setLayout(new BoxLayout(panelA, BoxLayout.X_AXIS));
		
//		AGREGO AL PANEL
		panelA.add(saludo);
//		panelA.add(saludo2);
	}
	public void crearPanelB() {
		panelB=new JPanel();
		boton=new JButton();
		boton.setText("Entrar");
		panelB.setLayout(new BoxLayout(panelB, BoxLayout.X_AXIS));
		panelB.add(boton);
	}
	
	public void crearVentana() {
	
	 ventana=new JFrame();
	 ventana.setTitle("Ventana Nueva");
	 ventana.setSize(400, 400);
	 ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.Y_AXIS));
//	 AGREGO PANEL
	 ventana.add(panelA);
	 ventana.add(panelB);
//	 IMPORTANTE
	 ventana.setLocationRelativeTo(null); //No colocar ventana en posición relativa.
	 ventana.setVisible(true);
	 ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE); //Cerrar ventana
	}
	public Ventana() {
		crearPanelA();
		crearPanelB();
		crearVentana();
	}
}
