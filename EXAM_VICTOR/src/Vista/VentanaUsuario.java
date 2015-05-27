package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import modelos.Cadete;

import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaUsuario extends JPanel {
	
	

	private JPanel VentanaEquipo;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	
	//Constructor del JPanel
	
	public VentanaUsuario() {
		Cadete cd = new Cadete();
	
		//rellenamos las ventanas con lo que queremos tener visible
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(243, 11, 46, 14);
		add(lblNombre);
		
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(243, 31, 86, 20);
		add(textField);
		textField.setColumns(10);
		String nombre = cd.getNombre();
		textField.setText(nombre);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(243, 68, 46, 14);
		add(lblApellidos);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(243, 93, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(243, 120, 46, 14);
		add(lblEdad);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(243, 145, 86, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setBounds(243, 182, 86, 14);
		add(lblNacionalidad);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(243, 207, 86, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(VentanaUsuario.class.getResource("/img/victor.jpg")));
		lblNewLabel.setBounds(10, 11, 209, 216);
		add(lblNewLabel);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(349, 11, 46, 14);
		add(lblId);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBounds(343, 31, 86, 20);
		add(textField_4);
		textField_4.setColumns(10);
		
		//Le decimos al boton que cuando hagamos clic en el nos lleve a la siguiente ventana
		
		JButton btnSiguiente = new JButton("Siguiente >>");		
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CardLayout layout = (CardLayout) getVentanaEquipo().getLayout();
				layout.show(VentanaEquipo, "Usuario");
				
			}
		});
		btnSiguiente.setBounds(343, 246, 95, 23);
		add(btnSiguiente);
		

	}

	public JPanel getVentanaEquipo() {
		return VentanaEquipo;
	}

	public void setVentanaEquipo(JPanel ventanaEquipo) {
		VentanaEquipo = ventanaEquipo;
	}
}
