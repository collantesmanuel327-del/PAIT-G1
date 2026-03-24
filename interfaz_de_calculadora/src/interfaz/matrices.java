package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class matrices extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					matrices frame = new matrices();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public matrices() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Matrices");
		this.setResizable(false); 
		this.setSize(512, 306);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 255, 47));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sistema de ecuaciones");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblNewLabel.setBounds(133, 11, 202, 27);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Volver a menú");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu v1 = new menu();
				v1.setVisible(true);
				matrices.this.dispose();
			}
		});
		btnNewButton.setBounds(185, 227, 125, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2x2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				matriz2 c2 = new matriz2();
				c2.setVisible(true);
				matrices.this.dispose();
			}
		});
		btnNewButton_1.setBounds(64, 183, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3x3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				matriz3 m3 = new matriz3();
				m3.setVisible(true);
				matrices.this.dispose();
			}
		});
		btnNewButton_2.setBounds(330, 183, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(matrices.class.getResource("/imagen/sistema22 (1).png")));
		lblNewLabel_1.setBounds(10, 51, 202, 121);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setIcon(new ImageIcon(matrices.class.getResource("/imagen/sistema 3x3 (1).png")));
		lblNewLabel_1_1.setBounds(277, 51, 209, 121);
		contentPane.add(lblNewLabel_1_1);

	}
}
