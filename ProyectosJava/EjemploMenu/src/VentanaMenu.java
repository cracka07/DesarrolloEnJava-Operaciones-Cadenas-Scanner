import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class VentanaMenu implements ActionListener{
 JFrame ventana;
 JMenu opcion1,opcion2,Sopcion1,Sopcion2,Sopcion3,Sopcion4; //Un menú con dos opciones
 JMenuItem sub1,sub2;
 JMenuBar menubar;

public void crearMenu() {
	
	menubar=new JMenuBar();
	
	opcion1=new JMenu("Menu Uno");
	opcion2=new JMenu("Menu dos");
	
	Sopcion1=new JMenu("A");
	Sopcion2=new JMenu("B");
    Sopcion3=new JMenu("C");
    Sopcion4=new JMenu("D");
    
    sub1=new JMenuItem("X");
    sub2=new JMenuItem("Y");
    
    menubar.add(opcion1);
    menubar.add(opcion2);
    
    opcion1.add(Sopcion1);
    opcion1.add(Sopcion2);
    
    opcion2.add(Sopcion3);
    opcion2.add(Sopcion4);
    
    Sopcion2.add(sub1);
    Sopcion2.add(sub2);
    
    Sopcion1.addActionListener(this);
    Sopcion2.addActionListener(this);
    Sopcion3.addActionListener(this);
    Sopcion4.addActionListener(this);
    
    	
	sub1.addActionListener(this);
	sub2.addActionListener(this);
}
public void crearVentana() {
	ventana=new JFrame("Ventana de Menú");
	ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.Y_AXIS));
	ventana.setSize(300,300);
	ventana.setJMenuBar(menubar);
	ventana.setVisible(true);
	ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
}

//Controlar la creación de elementos
public VentanaMenu() {
	crearMenu();
	crearVentana();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==sub1) {
		System.out.println("X");
		ventana.setSize(500,500);
	}
	
}
	
}