package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;

public class primer extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField a;
	private JTextField b;
	private JTextField c;
	private JTextField r;
	private final JLabel lblNewLabel_3 = new JLabel("Primer grado");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					primer frame = new primer();
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
	public primer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		setSize(446, 307);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		a = new JTextField();
		a.setHorizontalAlignment(SwingConstants.CENTER);
		a.setBounds(21, 80, 96, 18);
		contentPane.add(a);
		a.setColumns(10);
		
		b = new JTextField();
		b.setHorizontalAlignment(SwingConstants.CENTER);
		b.setBounds(166, 80, 96, 18);
		contentPane.add(b);
		b.setColumns(10);
		
		c = new JTextField();
		c.setBounds(308, 80, 96, 18);
		contentPane.add(c);
		c.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("X");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(112, 83, 44, 12);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("+");
		lblNewLabel_1.setBounds(145, 83, 44, 12);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("=");
		lblNewLabel_2.setBounds(272, 83, 44, 12);
		contentPane.add(lblNewLabel_2);
		
		r = new JTextField();
		r.setHorizontalAlignment(SwingConstants.CENTER);
		r.setBounds(133, 174, 171, 31);
		contentPane.add(r);
		r.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				float i =-1;
				float A= Float.parseFloat(a.getText());
				float B= Float.parseFloat(b.getText());
				float C= Float.parseFloat(c.getText());
				String a1 = a.getText().trim();
				String b1 = b.getText().trim();
				String c1 = c.getText().trim();
				if (a1.isBlank() && b1.isBlank() && c1.isBlank()) {
					r.setText("Llenar los espacios");
				}
				if(A==0) {
					String negacion = "No es posible tener x en 0";
					r.setText(negacion);
				}
				if (A==0 && B==0 && C==0) {
					String nada = "Porfavor llenar con datos";
					r.setText(nada);
				}
				if(A!=0) {
					float g =(B*i);
				float h=C+g;
				float d=h/A;
				String respuesta = "X= "+d;
				r.setText(respuesta);
				}
				
				
				
				
			}
		});
		btnNewButton.setBounds(104, 132, 84, 20);
		contentPane.add(btnNewButton);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(164, 11, 98, 32);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Atrás");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ecuaciones ec = new Ecuaciones();
				ec.setVisible(true);
				primer.this.dispose();
			}
		});
		btnNewButton_1.setBounds(28, 222, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Limpiar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.setText("");
				b.setText("");
				c.setText("");
				r.setText("");
			}
		});
		btnNewButton_2.setBounds(227, 129, 89, 23);
		contentPane.add(btnNewButton_2);

	}
}
