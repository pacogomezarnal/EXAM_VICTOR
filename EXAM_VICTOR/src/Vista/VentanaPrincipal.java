package Vista;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;

	//Constructor del JFrame y mostraremos la primera pantalla
	
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 350);
		contentPane = new JPanel();
		setTitle("THE LABY");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new CardLayout(0, 0));
		setContentPane(contentPane);
		
		
		JPanel VentanaUsuario = new VentanaUsuario();
		VentanaUsuario.setBounds(0, 0, 434, 30);
		getContentPane().add(VentanaUsuario,"Principal");
		VentanaUsuario.setLayout(null);
		
		
		
		
	}

}
