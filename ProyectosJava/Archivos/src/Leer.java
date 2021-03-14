import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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

  public static void main(String args[]) {
		Leer leer=new Leer();
		leer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		creamos y le decimos que vamos a tener condiciones
	File archivo=new File(e.getActionCommand());
	
	if(archivo.exists()) {
		salida.setText(archivo.getName() + "existe\n");
		
		if(archivo.isFile()) {
			salida.append("Es un archivo\n");
			
		}else {
			salida.append("No es un archivo");
		}
		if(archivo.isDirectory()) {
			salida.append("Es un directorio");
		}else {
			salida.append("No es un directorio");
		}
		if(archivo.isFile()) {
			
			try {
//				LE DECIMOS QUE LO VAMOS A LEER
				BufferedReader leer=new BufferedReader(new FileReader(archivo));
//				FUNCIONA DE CONTENDEDOR
				StringBuffer buffer=new StringBuffer();
				String texto;
				
				salida.append("\n\n\n");
				
				while((texto=leer.readLine())!=null) {
//					en el buffer donde tengo los datos agrego el texto
					buffer.append(texto+"\n");
				}
//				AGREGA AL BUFFER LO QUE SE CONVIRTIÓ EN CADENA
				  salida.append(buffer.toString());
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(this,"ERROR EN ARCHIVO","Esto es error",JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	if(archivo.isDirectory()) {
		String directorio[]=archivo.list();
		salida.append("\nArchivo del directorio:\n");
		for (int i = 0; i < directorio.length; i++) {
			salida.append(directorio[i]+"\n");
			
		}
		}
		
	}
	

}
