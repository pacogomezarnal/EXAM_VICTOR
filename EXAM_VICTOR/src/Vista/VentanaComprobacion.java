package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaComprobacion extends JPanel {
	modelos.IngresoLaby IngresoLab = new modelos.IngresoLaby();
	private JPanel VentanaEquipo;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	//Constructor del JPanel
	
	public VentanaComprobacion() {
		
		//rellenamos las ventanas con lo que queremos tener visible
		//Creamos las etiquetas(Jlabel)con sus respectivos jtextfield y JButton para poder pasar a la siguiente ventana
		setLayout(null);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(10, 24, 46, 14);
		add(lblId);
		
		
		textField = new JTextField();
		textField.setBounds(10, 56, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblerApellido = new JLabel("1er Apellido");
		lblerApellido.setBounds(134, 24, 78, 14);
		add(lblerApellido);
		
		textField_1 = new JTextField();
		textField_1.setBounds(134, 56, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("COMPROBAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(10, 103, 430, 23);
		add(btnNewButton);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 137, 430, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		//Le decimos al boton que cuando hagamos clic en el nos lleve a la anterior ventana
		JButton button = new JButton("<< Atr\u00E1s");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaEquipo VentanaEquipo = new VentanaEquipo();
				VentanaEquipo.show();
			}
		});
		button.setBounds(10, 266, 89, 23);
		add(button);

	}

}
