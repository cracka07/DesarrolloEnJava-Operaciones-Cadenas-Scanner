import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;

public class Escribir extends JFrame implements ActionListener {

	JTextField entrada;
	File archivo;
	JButton boton;
	
//	CONSTRUCTOR
	public Escribir() {
		
		entrada=new JTextField("Escribir");
		boton=new JButton("Guardar");
		add(entrada);
		add(boton);
		boton.addActionListener(this);
		
	Container contenedor=getContentPane();
	contenedor.add(entrada,BorderLayout.NORTH);
		
	    setVisible(true);
		setSize(400,400);
		
		
	}
	
	public static void main(String args[]) {
		Escribir escribir=new Escribir();
		escribir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String texto=entrada.getText();
//		SI LE DI CLICK AL BOTON
		if(e.getSource()==boton) {
			
//			crear archivo
				File archivo=new File("D:\\DESARROLLADOR JAVA\\JAVA\\ejemplo\\archivo.txt");
				
		 try {
			FileWriter writer=new FileWriter(archivo);
			PrintWriter escribir=new PrintWriter(writer);
			//escribir.append("Hola");
			escribir.println("");
			escribir.append(texto);
			escribir.close();
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		}
	}

}
