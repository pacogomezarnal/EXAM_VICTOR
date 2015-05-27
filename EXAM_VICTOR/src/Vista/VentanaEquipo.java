package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaEquipo extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;


	//Constructor del JPanel
	
	public VentanaEquipo() {
		
		setLayout(null);
		//rellenamos las ventanas con lo que queremos tener visible
		//Creamos las etiquetas(Jlabel)con sus respectivos jtextfield y JButton para poder pasar a la siguiente ventana
		JLabel lblNewLabel = new JLabel("Equipo");
		lblNewLabel.setBounds(10, 31, 46, 14);
		add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 56, 139, 20);
		add(comboBox);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(175, 31, 46, 14);
		add(lblNombre);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(175, 56, 144, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblerApellido = new JLabel("1er Apellido");
		lblerApellido.setBounds(171, 87, 86, 14);
		add(lblerApellido);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(171, 112, 148, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblApellido = new JLabel("2\u00BA Apellido");
		lblApellido.setBounds(175, 143, 86, 14);
		add(lblApellido);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(171, 168, 148, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setBounds(171, 199, 86, 14);
		add(lblNacionalidad);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(171, 224, 148, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		//Le decimos al boton que cuando hagamos clic en el nos lleve a la siguiente pantalla
		JButton button = new JButton("<< Atr\u00E1s");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaUsuario VentanaUsuario = new VentanaUsuario();
				VentanaUsuario.show();
			}
		});
		button.setBounds(10, 250, 89, 23);
		add(button);
		
		//Le decimos al boton que cuando hagamos clic en el nos lleve a la anterior ventana
		JButton btnSiguiente = new JButton("Siguiente >>");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VentanaComprobacion VentanaComprobar = new VentanaComprobacion();
				VentanaComprobar.show();
			}
		});
		btnSiguiente.setBounds(323, 250, 104, 23);
		add(btnSiguiente);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(339, 31, 46, 14);
		add(lblId);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBounds(329, 56, 86, 20);
		add(textField_4);
		textField_4.setColumns(10);

	}

}
