import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class VentanaW implements ChangeListener {

	private JFrame frame;
	JRadioButton r1,r2,r3;
	ButtonGroup grupo;
	private JTextField textField;
	JCheckBox c1,c2,c3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaW window = new VentanaW();
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
	public VentanaW() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		grupo=new ButtonGroup();
	     r1 = new JRadioButton("1");
	     r1.setBounds(25, 38, 109, 23);
		r1.addChangeListener(this);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(r1);
		
		r2 = new JRadioButton("2");
		r2.setBounds(25, 64, 109, 23);
		r2.addChangeListener(this);
		frame.getContentPane().add(r2);
		
		r3= new JRadioButton("3");
		r3.setBounds(25, 90, 109, 23);
		r3.addChangeListener(this); //AGREGO EL ESCUCHADOR DE EVENTO, EL CAMBIO DE BOTÓN.
		frame.getContentPane().add(r3);
		
		grupo.add(r1);
		grupo.add(r2);
		grupo.add(r3);
		
		textField = new JTextField();
		textField.setBounds(305, 11, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		c1= new JCheckBox("1");
		c1.setBounds(315, 38, 97, 23);
		c1.addChangeListener(this);
		frame.getContentPane().add(c1);
		
		c2 = new JCheckBox("2");
		c2.setBounds(325, 64, 97, 23);
		c2.addChangeListener(this);
		frame.getContentPane().add(c2);
		
		c3 = new JCheckBox("3");
	c3.setBounds(315, 90, 97, 23);
	c3.addChangeListener(this);
		frame.getContentPane().add(c3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(280, 135, -231, 88);
		frame.getContentPane().add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(59, 135, 226, 115);
		frame.getContentPane().add(scrollPane_1);
		
		JTextArea textArea = new JTextArea();
		scrollPane_1.setViewportView(textArea);
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		if(r1.isSelected()) {
			System.out.println("1");
		}
		if(r2.isSelected()) {
			System.out.println("2");
		}
		if(r3.isSelected()) {
			System.out.println("3");
		}
		if(c1.isSelected()==true) {
		   textField.setText("1");
		} else if (c2.isSelected()) {
			textField.setText("2");
		} else if(c3.isSelected()) {
			textField.setText("3");
		}
		
	}
}
