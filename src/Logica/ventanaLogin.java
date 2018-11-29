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
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

public class ventanaLogin extends JFrame {

	private JPanel contentPane;
	public static JTextField textUsuario;
	public static JPasswordField textPassword;
	private JTextField txtTrendingNews;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() throws NullPointerException, FileSystemNotFoundException{
				try {
					ventanaLogin frame = new ventanaLogin();
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
	public ventanaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 15));
		lblUsuario.setBounds(90, 69, 112, 30);
		contentPane.add(lblUsuario);
		
		JLabel lblPassword = new JLabel("Contrase\u00F1a");
		lblPassword.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 15));
		lblPassword.setBounds(90, 112, 112, 30);
		contentPane.add(lblPassword);
		
		textUsuario = new JTextField();
		textUsuario.setBounds(227, 73, 116, 22);
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);
		
		textPassword = new JPasswordField();
		textPassword.setBounds(227, 116, 116, 22);
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
							JOptionPane.showMessageDialog(ventanaLogin.this, "Bienvenido al juego");
						}
						else
						{
							JOptionPane.showMessageDialog(ventanaLogin.this,"Usuario o contraseña incorrectos");
						}
					} catch (CannotRedoException e1) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(ventanaLogin.this, "Caracteres no validos");
					}
					
					
				}
				else
				{
					JOptionPane.showMessageDialog(ventanaLogin.this,"Usuario o contraseña incorrectos");
				}
				
			}

			private void ComprobarPass(String clave) {
				// Se comprueba si el usuario y contraseña almacenados en la base de datos coinciden
				
			}
		});
		
		
		btnEntrar.setBounds(90, 166, 116, 25);
		contentPane.add(btnEntrar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(227, 166, 116, 25);
		contentPane.add(btnSalir);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			// Nueva ventana registrarse, con los datos del usuario que iran almacenados en la base de datos
				JOptionPane.showMessageDialog(ventanaLogin.this,"Rellena los siguientes datos");
			}
		});
		btnRegistrarse.setBounds(90, 204, 116, 25);
		contentPane.add(btnRegistrarse);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 432, 50);
		contentPane.add(panel);
		
		txtTrendingNews = new JTextField();
		txtTrendingNews.setFont(new Font("Tahoma", Font.BOLD, 34));
		txtTrendingNews.setEditable(false);
		txtTrendingNews.setBackground(SystemColor.control);
		txtTrendingNews.setText("Trending News");
		panel.add(txtTrendingNews);
        
		
		
	}
}