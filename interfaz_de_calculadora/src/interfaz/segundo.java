package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.ImageIcon;

public class segundo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField A;
	private JTextField B;
	private JTextField C;
	private JTextField textField_3;
	private JTextField Archivo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					segundo frame = new segundo();
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
	public segundo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Ecuaciones de segundo grado");
		this.setResizable(false);
		setSize(556, 479);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 239, 213));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Atrás");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ecuaciones ec = new Ecuaciones();
				ec.setVisible(true);
				segundo.this.dispose();
			}
		});
		btnNewButton.setBounds(426, 231, 104, 23);
		contentPane.add(btnNewButton);
		
		A = new JTextField();
		A.setHorizontalAlignment(SwingConstants.RIGHT);
		A.setBounds(20, 94, 57, 20);
		contentPane.add(A);
		A.setColumns(10);
		
		B = new JTextField();
		B.setHorizontalAlignment(SwingConstants.RIGHT);
		B.setColumns(10);
		B.setBounds(113, 94, 57, 20);
		contentPane.add(B);
		
		C = new JTextField();
		C.setHorizontalAlignment(SwingConstants.RIGHT);
		C.setColumns(10);
		C.setBounds(209, 94, 57, 20);
		contentPane.add(C);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_3.setText("0");
		textField_3.setColumns(10);
		textField_3.setBounds(299, 94, 57, 20);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel = new JLabel("Ax²");
		lblNewLabel.setForeground(new Color(255, 250, 250));
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(20, 81, 57, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblBx = new JLabel("Bx");
		lblBx.setForeground(new Color(255, 250, 250));
		lblBx.setHorizontalAlignment(SwingConstants.CENTER);
		lblBx.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblBx.setBounds(113, 81, 57, 14);
		contentPane.add(lblBx);
		
		JLabel lblC = new JLabel("C");
		lblC.setForeground(new Color(255, 250, 250));
		lblC.setHorizontalAlignment(SwingConstants.CENTER);
		lblC.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblC.setBounds(209, 81, 57, 14);
		contentPane.add(lblC);
		
		JLabel lblNewLabel_1 = new JLabel("Ecuaciones de Segundo Grado");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(131, 0, 264, 37);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("=");
		lblNewLabel_2.setForeground(new Color(255, 250, 250));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(255, 96, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("+");
		lblNewLabel_3.setForeground(new Color(255, 250, 250));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(66, 97, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("+");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3_1.setForeground(new Color(255, 250, 250));
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBounds(169, 96, 46, 14);
		contentPane.add(lblNewLabel_3_1);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 182, 406, 200);
		contentPane.add(scrollPane);
		
		JTextArea resultado = new JTextArea();
		resultado.setEditable(false);
		resultado.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		scrollPane.setColumnHeaderView(resultado);
		
		JButton btnNewButton_1 = new JButton("Calcular");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				double a = Double.parseDouble(A.getText());
				double b = Double.parseDouble(B.getText());
				double c = Double.parseDouble(C.getText());
				if(a==0) {
					resultado.setText("Ax² no puede ser 0");
				}else {
					double d = (b*b)-(4*a*c);
				if(d<0) {
					double dr = Math.sqrt(-d);
					double bf = (-1)*b;
					double rp = (bf+dr)/(2*a);
					double rn = (bf-dr)/(2*a);
					String solucion = "Pasos \n"+a+"x²+"+b+"x+"+c+"=0"+
					"\nSe aplica la formula general: x=(-b±¹√b²-4(c)(a))/2a \n"+
					"Aplicando a la ecuacion: x=("+bf+"±"+"√("+b+")²"+"-4"+"("+c+"*"+a+"))"+"/2("+a
					+")\nResultados \nx1="+rp+"i\nx2="+rn+"i";
					resultado.setText(solucion);
					
				}else {
				double dr = Math.sqrt(d);
				double bf = (-1)*b;
				double rp = (bf+dr)/(2*a);
				double rn = (bf-dr)/(2*a);
				String solucion = "Pasos \n"+a+"x²+"+b+"x+"+c+"=0"+
				"\nSe aplica la formula general: x=(-b±¹√b²-4(c)(a))/2a \n"+
				"Aplicando a la ecuacion: x=("+bf+"±"+"√("+b+")²"+"-4"+"("+c+"*"+a+"))"+"/2("+a
				+")\nResultados \nx1="+rp+"\nx2="+rn;
				resultado.setText(solucion);
				}
				}
				
				}catch(NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Acción inválida");
				}
			}
		});
		btnNewButton_1.setBounds(66, 148, 104, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Limpiar");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A.setText("");
				B.setText("");
				C.setText("");
				resultado.setText("");
			}
		});
		btnNewButton_2.setBounds(229, 148, 104, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Calculadora");
		btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora cl = new calculadora();
				cl.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(426, 153, 104, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Info.");
		btnNewButton_4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				info i = new info();
				i.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(426, 197, 104, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Menú");
		btnNewButton_5.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu m = new menu();
				m.setVisible(true);
				segundo.this.dispose();
			}
		});
		btnNewButton_5.setBounds(426, 277, 104, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_3_1 = new JButton("Guardar");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Archivo.getText().isBlank()) {
					//Ruta ve en descargas
					String ruta = System.getProperty("user.home") + File.separator + "Downloads" + File.separator + "Ecuacion de segundo grado.txt";
					try(BufferedWriter bw = new BufferedWriter(new FileWriter(ruta,true))){
						bw.write(resultado.getText());
						bw.newLine();
						
					 }catch(IOException e2) {
						 JOptionPane.showMessageDialog(null, "No se pudo guardar");
					 }
				}else {
					String nombre = Archivo.getText();
					String ruta = System.getProperty("user.home") + File.separator + "Downloads" + File.separator +nombre+ ".txt";
					try(BufferedWriter bw = new BufferedWriter(new FileWriter(ruta,true))){
						bw.write(resultado.getText());
						bw.newLine();
						
					 }catch(IOException e2) {
						 JOptionPane.showMessageDialog(null, "No se pudo guardar");
				}
			}
			}
		});
		btnNewButton_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton_3_1.setBounds(20, 406, 104, 23);
		contentPane.add(btnNewButton_3_1);
		
		JButton btnNewButton_3_2 = new JButton("Graficar");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				double a = Double.parseDouble(A.getText());
				double b = Double.parseDouble(B.getText());
				double c = Double.parseDouble(C.getText());
				if(a!=0) {
					double ae = b*b;
					double ce =4*a*c;
					double determinante = ae-ce;
					if(determinante>=0) {
					gradicadora2 gr2 = new gradicadora2("Graficador de Ecuaciones de Segundo Grado ",a, b, c);
			        gr2.setSize(800, 600);
			        gr2.setLocationRelativeTo(null);
			        gr2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			        gr2.setVisible(true);
					}else {
						imaginarios img = new imaginarios("Graficador de Ecuaciones de Segundo Grado Imaginarios ",a, b, c);
				        img.setSize(800, 600);
				        img.setLocationRelativeTo(null);
				        img.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				        img.setVisible(true);
					}
					
				}else {
					JOptionPane.showMessageDialog(null, "Acción inválida");
				}
				 
				}catch(NumberFormatException e2) {
					JOptionPane.showMessageDialog(null, "Datos inválidos");
				}
				
			}
		});
		btnNewButton_3_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton_3_2.setBounds(426, 114, 104, 23);
		contentPane.add(btnNewButton_3_2);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(segundo.class.getResource("/imagen/imagen_2026-03-09_233456584.png")));
		lblNewLabel_4.setBounds(20, 22, 506, 373);
		contentPane.add(lblNewLabel_4);
		
		Archivo = new JTextField();
		Archivo.setBounds(212, 407, 237, 20);
		contentPane.add(Archivo);
		Archivo.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Nombre");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(148, 410, 57, 14);
		contentPane.add(lblNewLabel_5);
		
		

	}
}
