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

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class matriz3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField x1;
	private JTextField x2;
	private JTextField x3;
	private JTextField y1;
	private JTextField y2;
	private JTextField y3;
	private JTextField z1;
	private JTextField z2;
	private JTextField z3;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JButton btnNewButton_4;
	private JTextArea Res;
	private JScrollPane scrollPane;
	private JButton btnNewButton_5;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JButton btnGuardar;
	private JTextField Archivo;
	private JLabel lblNewLabel_14;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					matriz3 frame = new matriz3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public matriz3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Sistema 3x3");
		this.setResizable(false);
		this.setSize(415, 500);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(60, 179, 113));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Menú");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu v1 = new menu();
				v1.setVisible(true);
				matriz3.this.dispose();
			}
		});
		btnNewButton.setBounds(20, 350, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Atrás");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				matrices v2 = new matrices();
				v2.setVisible(true);
				matriz3.this.dispose();
			}
		});
		btnNewButton_1.setBounds(291, 350, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Sistema de ecuaciones 3x3");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblNewLabel.setBounds(94, 11, 229, 23);
		contentPane.add(lblNewLabel);
		
		x1 = new JTextField();
		x1.setHorizontalAlignment(SwingConstants.CENTER);
		x1.setBounds(20, 63, 57, 20);
		contentPane.add(x1);
		x1.setColumns(10);
		
		x2 = new JTextField();
		x2.setHorizontalAlignment(SwingConstants.CENTER);
		x2.setColumns(10);
		x2.setBounds(20, 94, 57, 20);
		contentPane.add(x2);
		
		x3 = new JTextField();
		x3.setHorizontalAlignment(SwingConstants.CENTER);
		x3.setColumns(10);
		x3.setBounds(20, 125, 57, 20);
		contentPane.add(x3);
		
		y1 = new JTextField();
		y1.setHorizontalAlignment(SwingConstants.CENTER);
		y1.setColumns(10);
		y1.setBounds(121, 63, 57, 20);
		contentPane.add(y1);
		
		y2 = new JTextField();
		y2.setHorizontalAlignment(SwingConstants.CENTER);
		y2.setColumns(10);
		y2.setBounds(121, 94, 57, 20);
		contentPane.add(y2);
		
		y3 = new JTextField();
		y3.setHorizontalAlignment(SwingConstants.CENTER);
		y3.setColumns(10);
		y3.setBounds(121, 125, 57, 20);
		contentPane.add(y3);
		
		z1 = new JTextField();
		z1.setHorizontalAlignment(SwingConstants.CENTER);
		z1.setColumns(10);
		z1.setBounds(217, 63, 57, 20);
		contentPane.add(z1);
		
		z2 = new JTextField();
		z2.setHorizontalAlignment(SwingConstants.CENTER);
		z2.setColumns(10);
		z2.setBounds(217, 94, 57, 20);
		contentPane.add(z2);
		
		z3 = new JTextField();
		z3.setHorizontalAlignment(SwingConstants.CENTER);
		z3.setColumns(10);
		z3.setBounds(217, 125, 57, 20);
		contentPane.add(z3);
		
		t1 = new JTextField();
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setColumns(10);
		t1.setBounds(323, 63, 57, 20);
		contentPane.add(t1);
		
		t2 = new JTextField();
		t2.setHorizontalAlignment(SwingConstants.CENTER);
		t2.setColumns(10);
		t2.setBounds(323, 94, 57, 20);
		contentPane.add(t2);
		
		t3 = new JTextField();
		t3.setHorizontalAlignment(SwingConstants.CENTER);
		t3.setColumns(10);
		t3.setBounds(323, 125, 57, 20);
		contentPane.add(t3);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 201, 360, 138);
		contentPane.add(scrollPane);
		
		Res = new JTextArea();
		Res.setEditable(false);
		Res.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		scrollPane.setViewportView(Res);
		
		JButton btnNewButton_2 = new JButton("Borrar");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x1.setText("");
				x2.setText("");
				x3.setText("");
				y1.setText("");
				y2.setText("");
				y3.setText("");
				z1.setText("");
				z2.setText("");
				z3.setText("");
				t1.setText("");
				t2.setText("");
				t3.setText("");
				Res.setText("");
			}
		});
		btnNewButton_2.setBounds(20, 166, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Calcular");
		btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//x
				float X1= Float.parseFloat(x1.getText());
				float X2= Float.parseFloat(x2.getText());
				float X3= Float.parseFloat(x3.getText());
				//y
				float Y1= Float.parseFloat(y1.getText());
				float Y2= Float.parseFloat(y2.getText());
				float Y3= Float.parseFloat(y3.getText());
				//Z
				float Z1= Float.parseFloat(z1.getText());
				float Z2= Float.parseFloat(z2.getText());
				float Z3= Float.parseFloat(z3.getText());
				//terminos independientes
				float T1= Float.parseFloat(t1.getText());
				float T2= Float.parseFloat(t2.getText());
				float T3= Float.parseFloat(t3.getText());
				//Determinante de la matriz, x, y y z
				float d = (X1*Y2*Z3)+(X2*Y3*Z1)+(X3*Y1*Z2)-(Z1*Y2*X3)-(Z2*Y3*X1)-(Z3*Y1*X2);
				if(d==0) {
					Res.setText("No es posible resolver el sistema");
				}else {
					float dx = (T1*Y2*Z3)+(T2*Y3*Z1)+(T3*Y1*Z2)-(Z1*Y2*T3)-(Z2*Y3*T1)-(Z3*Y1*T2);
				float dy = (X1*T2*Z3)+(X2*T3*Z1)+(X3*T1*Z2)-(Z1*T2*X3)-(Z2*T3*X1)-(Z3*T1*X2);
				float dz = (X1*Y2*T3)+(X2*Y3*T1)+(X3*Y1*T2)-(T1*Y2*X3)-(T2*Y3*X1)-(T3*Y1*X2);
				//Resultados
				float x = dx/d;
				float y = dy/d;
				float z = dz/d;
				//Transforma los resultados a String para que puedan
				//imprimirse en el campo de texto "Res"
				String res = "Solucion\nDetermiante del sistema = "+d+"\nDeterminante de x = "+dx+
						"\nDeterminate de y = "+dy+"\nDeterminate de z = "+dz+"\nx= "+dx+"/"+
						d+" = "+x+"\ny= "+dy+"/"+d+" = "+y+"\nz= "+dz+"/"+d+" = "+z;
				Res.setText(res);
				}
				
				}catch(NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Acción inválida");
				}
				
			}
		});
		btnNewButton_3.setBounds(158, 166, 89, 23);
		contentPane.add(btnNewButton_3);
		
		lblNewLabel_1 = new JLabel("X");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(20, 45, 57, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Y");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(121, 45, 57, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Z");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(220, 45, 57, 14);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("TI");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(323, 50, 57, 14);
		contentPane.add(lblNewLabel_4);
		
		btnNewButton_4 = new JButton("Info.");
		btnNewButton_4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				info i = new info ();
				i.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(158, 350, 89, 23);
		contentPane.add(btnNewButton_4);
		
		
		
		btnNewButton_5 = new JButton("Calculadora");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora cl = new calculadora();
				cl.setVisible(true);
			}
		});
		btnNewButton_5.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnNewButton_5.setBounds(291, 166, 89, 23);
		contentPane.add(btnNewButton_5);
		
		lblNewLabel_5 = new JLabel("+");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(71, 66, 57, 14);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("+");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(71, 97, 57, 14);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("+");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(71, 128, 57, 14);
		contentPane.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("+");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(168, 65, 57, 14);
		contentPane.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("+");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_9.setBounds(168, 97, 57, 14);
		contentPane.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("+");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_10.setBounds(170, 128, 57, 14);
		contentPane.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("=");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_11.setBounds(270, 66, 57, 14);
		contentPane.add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel("=");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_12.setBounds(270, 97, 57, 14);
		contentPane.add(lblNewLabel_12);
		
		lblNewLabel_13 = new JLabel("=");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_13.setBounds(270, 128, 57, 14);
		contentPane.add(lblNewLabel_13);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Archivo.getText().isBlank()) {
					//Ruta ve en descargas
					String ruta = System.getProperty("user.home") + File.separator + "Downloads" + File.separator + "Sistema de ecuacion 3x3.txt";
					try(BufferedWriter bw = new BufferedWriter(new FileWriter(ruta,true))){
						bw.write(Res.getText());
						bw.newLine();
						
					 }catch(IOException e2) {
						 JOptionPane.showMessageDialog(null, "No se pudo guardar");
					 }
				}else {
					String nombre = Archivo.getText();
					String ruta = System.getProperty("user.home") + File.separator + "Downloads" + File.separator +nombre+ ".txt";
					try(BufferedWriter bw = new BufferedWriter(new FileWriter(ruta,true))){
						bw.write(Res.getText());
						bw.newLine();
						
					 }catch(IOException e2) {
						 JOptionPane.showMessageDialog(null, "No se pudo guardar");
				}
			}
			}
		});
		btnGuardar.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnGuardar.setBounds(20, 413, 89, 23);
		contentPane.add(btnGuardar);
		
		Archivo = new JTextField();
		Archivo.setBounds(139, 414, 241, 20);
		contentPane.add(Archivo);
		Archivo.setColumns(10);
		
		lblNewLabel_14 = new JLabel("Nombre");
		lblNewLabel_14.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_14.setBounds(139, 398, 57, 14);
		contentPane.add(lblNewLabel_14);

	}

}
