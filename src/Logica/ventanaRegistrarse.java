package Logica;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventanaRegistrarse extends JFrame {

	private JPanel contentPane;
	private JTextField txtTrendingNews;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblRepetirContrasea;
	private JTextField textField_2;
	private JRadioButton rdbtnPoltica;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaRegistrarse frame = new ventanaRegistrarse();
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
	public ventanaRegistrarse() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 482, 50);
		contentPane.add(panel);
		
		txtTrendingNews = new JTextField();
		txtTrendingNews.setFont(new Font("Tahoma", Font.BOLD, 34));
		txtTrendingNews.setEditable(false);
		txtTrendingNews.setBackground(SystemColor.control);
		txtTrendingNews.setText("Trending News");
		panel.add(txtTrendingNews);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombre.setBounds(105, 74, 100, 16);
		contentPane.add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(250, 72, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblContrasea.setBounds(105, 120, 100, 16);
		contentPane.add(lblContrasea);
		
		textField_1 = new JTextField();
		textField_1.setBounds(250, 118, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblRepetirContrasea = new JLabel("Repetir Contrase\u00F1a");
		lblRepetirContrasea.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRepetirContrasea.setBounds(105, 170, 130, 16);
		contentPane.add(lblRepetirContrasea);
		
		textField_2 = new JTextField();
		textField_2.setBounds(250, 168, 116, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JCheckBox chckbxAceptasLosTerminos = new JCheckBox("Aceptas los términos");
		chckbxAceptasLosTerminos.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chckbxAceptasLosTerminos.setBounds(250, 340, 160, 25);
		contentPane.add(chckbxAceptasLosTerminos);
		
		JRadioButton rdbtnNoticiasDeportivas = new JRadioButton("Deportes");
		rdbtnNoticiasDeportivas.setBounds(105, 249, 90, 25);
		contentPane.add(rdbtnNoticiasDeportivas);
		
		JRadioButton rdbtnSociedad = new JRadioButton("Sociedad ");
		rdbtnSociedad.setBounds(200, 249, 90, 25);
		contentPane.add(rdbtnSociedad);
		
		rdbtnPoltica = new JRadioButton("Pol\u00EDtica");
		rdbtnPoltica.setBounds(296, 249, 127, 25);
		contentPane.add(rdbtnPoltica);
		
		btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(250, 385, 116, 25);
		contentPane.add(btnNewButton);
		
	}
}
