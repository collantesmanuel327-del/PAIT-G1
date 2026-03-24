package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.ImageIcon;

public class primer extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField A;
	private JTextField B;
	private JTextField C;
	private JTextField Archivo;

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
		this.setTitle("Ecuaciones de primer grado");
		setSize(555, 420);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 225));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ecuaciones de Primer Grado");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel.setBounds(147, 11, 237, 44);
		contentPane.add(lblNewLabel);
		
		A = new JTextField();
		A.setHorizontalAlignment(SwingConstants.CENTER);
		A.setBounds(29, 91, 79, 20);
		contentPane.add(A);
		A.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Ax");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(48, 66, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("B");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(178, 66, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		B = new JTextField();
		B.setHorizontalAlignment(SwingConstants.CENTER);
		B.setBounds(174, 91, 86, 20);
		contentPane.add(B);
		B.setColumns(10);
		
		C = new JTextField();
		C.setHorizontalAlignment(SwingConstants.CENTER);
		C.setBounds(298, 91, 86, 20);
		contentPane.add(C);
		C.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("C");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(318, 66, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("=");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(256, 94, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setBounds(118, 90, 46, 22);
		contentPane.add(comboBox);
		comboBox.addItem(" +");
		comboBox.addItem(" -");
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 166, 355, 158);
		contentPane.add(scrollPane);
		JTextArea Respuesta = new JTextArea();
		Respuesta.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		scrollPane.setViewportView(Respuesta);
		Respuesta.setEditable(false);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					float a = Float.parseFloat(A.getText());
				float b = Float.parseFloat(B.getText());
				float c = Float.parseFloat(C.getText());
				String signo = (String) comboBox.getSelectedItem();
					if (a==0) {
					String res ="No es posible que Ax este en 0";
					Respuesta.setText(res);
				}else {
					switch(signo) {
					case (" +"):
						float d = (c-b)/a;
					    String r = "Pasos \n"+a+"x"+"+"+b+"="+c+"\n"+a+"x="+c+"-"+b+
					    		"\n"+"x="+(c-b)+"/"+a+"\nx="+d;
					    Respuesta.setText(r);
						break;
					case (" -"):
						float dn = (c+b)/a;
					String rn = "Pasos \n"+a+"x"+"-"+b+"="+c+"\n"+a+"x="+c+"+"+b+
				    		"\n"+"x="+(c+b)+"/"+a+"\nx="+dn;
				    Respuesta.setText(rn);
						break;
					}
				}
					
				}catch(NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Acción inválida");
				}
				
				
			}
		});
		btnNewButton.setBounds(95, 132, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpiar");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A.setText("");
				B.setText("");
				C.setText("");
				Respuesta.setText("");
			}
		});
		
		
		btnNewButton_1.setBounds(225, 132, 100, 23);
		contentPane.add(btnNewButton_1);
		JButton calcu = new JButton("Calculadora");
		calcu.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		calcu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora cl = new calculadora();
				cl.setVisible(true);
			}
		});
		calcu.setBounds(429, 132, 100, 23);
		contentPane.add(calcu);
		
		JButton btnNewButton_3 = new JButton("Info.");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				info i = new info();
				i.setVisible(true);
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton_3.setBounds(429, 204, 100, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("Atras");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ecuaciones ec = new Ecuaciones();
				ec.setVisible(true);
				primer.this.dispose();
			}
		});
		btnNewButton_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton_3_1.setBounds(429, 238, 100, 23);
		contentPane.add(btnNewButton_3_1);
		
		JButton btnNewButton_3_1_1 = new JButton("Menu");
		btnNewButton_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu m = new menu();
				m.setVisible(true);
				primer.this.dispose();
			}
		});
		btnNewButton_3_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton_3_1_1.setBounds(429, 275, 100, 23);
		contentPane.add(btnNewButton_3_1_1);
		
		JButton btnGraficar = new JButton("Graficar");
		btnGraficar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				float a = Float.parseFloat(A.getText());
				float b1 = Float.parseFloat(B.getText());
				float c = Float.parseFloat(C.getText());
				String signo = (String) comboBox.getSelectedItem();
					if (a==0) {
						JOptionPane.showMessageDialog(null, "No se puede graficar");
				}else {
					double m,b;
					switch(signo) {
					case (" +"):
					float d = c-b1;
					m=a;
					b = d/a;
					graficadora1 gr1 = new graficadora1("Gráfica ecuación de primer grado", m, b);
			        gr1.setSize(800, 600);
			        gr1.setLocationRelativeTo(null);
			        gr1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			        gr1.setVisible(true);
						break;
					case (" -"):
					float d1 = b1+c;
					m=a;
					b=d1/a;
					graficadora1 gr11 = new graficadora1("Gráfica ecuación de primer grado", m, b);
			        gr11.setSize(800, 600);
			        gr11.setLocationRelativeTo(null);
			        gr11.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			        gr11.setVisible(true);
					
						break;
					}
				}
					
				}catch(NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Acción inválida");
				}
				
			}
		});
		btnGraficar.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnGraficar.setBounds(429, 170, 100, 23);
		contentPane.add(btnGraficar);
		
		JButton btnNewButton_3_1_2 = new JButton("Guardar");
		btnNewButton_3_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Archivo.getText().isBlank()) {
					//Ruta ve en descargas
					String ruta = System.getProperty("user.home") + File.separator + "Downloads" + File.separator + "Ecuacion de primer grado.txt";
					try(BufferedWriter bw = new BufferedWriter(new FileWriter(ruta,true))){
						bw.write(Respuesta.getText());
						bw.newLine();
						
					 }catch(IOException e2) {
						 JOptionPane.showMessageDialog(null, "No se pudo guardar");
					 }
				}else {
					String nombre = Archivo.getText();
					String ruta = System.getProperty("user.home") + File.separator + "Downloads" + File.separator +nombre+ ".txt";
					try(BufferedWriter bw = new BufferedWriter(new FileWriter(ruta,true))){
						bw.write(Respuesta.getText());
						bw.newLine();
						
					 }catch(IOException e2) {
						 JOptionPane.showMessageDialog(null, "No se pudo guardar");
				}
			}
			}
		});
		btnNewButton_3_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton_3_1_2.setBounds(29, 348, 100, 23);
		contentPane.add(btnNewButton_3_1_2);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(primer.class.getResource("/imagen/imagen_2026-03-09_233106329.png")));
		lblNewLabel_5.setBounds(0, 0, 541, 337);
		contentPane.add(lblNewLabel_5);
		
		Archivo = new JTextField();
		Archivo.setBounds(212, 349, 276, 20);
		contentPane.add(Archivo);
		Archivo.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Nombre");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(147, 352, 55, 14);
		contentPane.add(lblNewLabel_6);
		
		
		

	}
}
