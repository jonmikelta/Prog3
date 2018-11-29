package Logica;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ventanaRegistrarse extends JFrame {

	private JPanel contentPane;
	private JTextField txtTrendingNews;

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
		setBounds(100, 100, 500, 600);
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
		
		txtTrendingNews = new JTextField();
		txtTrendingNews.setEditable(false);
		panel.add(txtTrendingNews);
		txtTrendingNews.setColumns(10);
	}


}
