package Logica;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.FileSystemNotFoundException;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.undo.CannotRedoException;

public class VentanaLogin extends JFrame {

	private JPanel contentPane;
	public static JTextField textUsuario;
	public static JPasswordField textPassword;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() throws NullPointerException, FileSystemNotFoundException{
				try {
					VentanaLogin frame = new VentanaLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(12, 32, 56, 16);
		contentPane.add(lblUsuario);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setBounds(12, 75, 56, 16);
		contentPane.add(lblPassword);
		
		textUsuario = new JTextField();
		textUsuario.setBounds(136, 29, 116, 22);
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);
		
		textPassword = new JPasswordField();
		textPassword.setBounds(136, 72, 116, 22);
		contentPane.add(textPassword);
		
		final Fichero1 data= new Fichero1();
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HashMap<String, String> usuarios = Fichero1.Gestion();
				String nombreUsuario = textUsuario.getText();
		
				
				if (usuarios.containsKey(nombreUsuario))
				{
					String clave = textPassword.getText();
					try {
						ComprobarPass(clave);
						String passwordHashMap = usuarios.get(nombreUsuario);
						if(clave.equals(passwordHashMap))
						{
							JOptionPane.showMessageDialog(VentanaLogin.this, "Bienvenido al juego");
						}
						else
						{
							JOptionPane.showMessageDialog(VentanaLogin.this,"Usuario o contraseña incorrectos");
						}
					} catch (CannotRedoException e1) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(VentanaLogin.this, "Caracteres no validos");
					}
					
					
				}
				else
				{
					JOptionPane.showMessageDialog(VentanaLogin.this,"Usuario o contraseña incorrectos");
				}
				
			}

			private void ComprobarPass(String clave) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		btnEntrar.setBounds(36, 150, 97, 25);
		contentPane.add(btnEntrar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(194, 150, 97, 25);
		contentPane.add(btnSalir);
		
		
	}
}