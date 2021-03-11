import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.mysql.cj.jdbc.Driver;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Ventana {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(25, 35, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mat");
		lblNewLabel_1.setBounds(25, 77, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Buscar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id=Integer.parseInt(textField_1.getText());
				
			     try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					java.sql.Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/universidad","root","");
//					CREAR STATEMENT, SENTENCIA
					Statement statement=conexion.createStatement();
					ResultSet resultSet=statement.executeQuery("select * from alumnos where matricula="+id);
					
					if(resultSet.next()) {
						lblNewLabel_1.setText(resultSet.getString("nombre"));
					}
					conexion.close();
					
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			     
			}
		});
		btnNewButton_1.setBounds(10, 166, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(77, 32, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(77, 74, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Agregar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
//					PASAMOS EL CONECTOR A USAR, EL DRIVER
					Class.forName("com.mysql.cj.jdbc.Driver");
//					CREAR CONEXION
					java.sql.Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/universidad","root","");
//					crear sentencia, la cual sierve para consultar la base de datos
					Statement statement=conexion.createStatement();
					String nom=textField.getText();
					String resultSet="insert into alumnos(nombre) values('"+nom+"')";
					statement.executeUpdate(resultSet);
					
					conexion.close();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
		
			}
		});
		btnNewButton.setBounds(10, 116, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Borrar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id=Integer.parseInt(textField_1.getText());
				try {
//					PASAMOS EL CONECTOR A USAR, EL DRIVER
					Class.forName("com.mysql.cj.jdbc.Driver");
//					CREAR CONEXION
					java.sql.Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/universidad","root","");
//					crear sentencia, la cual sierve para consultar la base de datos
					Statement statement=conexion.createStatement();
				
					String delete="delete from alumnos where matricula="+id;
			
					statement.executeUpdate(delete);
					
					conexion.close();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_2.setBounds(10, 200, 99, 28);
		frame.getContentPane().add(btnNewButton_2);
	}
}