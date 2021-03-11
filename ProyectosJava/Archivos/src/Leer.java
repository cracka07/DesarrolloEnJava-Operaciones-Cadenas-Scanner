import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.*;

public class Leer extends JFrame implements ActionListener{
  
	JTextArea salida;
	JTextField entrada;
	
public Leer() {
	entrada=new JTextField("Escribe el archivo/directorio");
//	AL MOMENTO DE DAR ENTER
	entrada.addActionListener(this);
	
	salida=new JTextArea();
	ScrollPane scroll=new ScrollPane();
	scroll.add(salida);
	
	Container contenedor=getContentPane();
	contenedor.add(entrada, BorderLayout.NORTH);
	contenedor.add(scroll, BorderLayout.CENTER);
	
	setSize(400,400);
	setVisible(true);
	
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
