package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class figuras extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					figuras frame = new figuras();
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
	public figuras() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Figuras geometricas");
		setSize( 577, 367);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Circulo");
		btnNewButton.setBounds(54, 31, 85, 21);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				circulo cua = new circulo();
				cua.setVisible(true);
				figuras.this.dispose();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		JButton btnTriangulo = new JButton("Triangulo");
		btnTriangulo.setBounds(54, 84, 85, 21);
		btnTriangulo.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Triangulo tri = new Triangulo();
				tri.setVisible(true);
				figuras.this.dispose();
			}
		});
		btnTriangulo.setBackground(Color.WHITE);
		contentPane.add(btnTriangulo);
	
		
		JButton btnCirculo = new JButton("Cuadrado");
		btnCirculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cuadrado cir = new cuadrado();
				cir.setVisible(true);
				figuras.this.dispose();
				
			}
		});
		btnCirculo.setBounds(54, 132, 85, 21);
		contentPane.add(btnCirculo);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(figuras.class.getResource("/imagen/88716ab4-ee0d-4f7d-bbff-dcbecd767447.png")));
		lblNewLabel.setBounds(177, 10, 322, 173);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Info.");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 info i = new info();
			 i.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(55, 179, 84, 20);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Atras");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu mn = new menu();
				mn.setVisible(true);
				figuras.this.dispose();
			}
		});
		btnNewButton_2.setBounds(10, 300, 84, 20);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(figuras.class.getResource("/imagen/imagen_2026-02-28_231510186.png")));
		lblNewLabel_1.setBounds(0, 0, 563, 330);
		contentPane.add(lblNewLabel_1);
		
	}
}