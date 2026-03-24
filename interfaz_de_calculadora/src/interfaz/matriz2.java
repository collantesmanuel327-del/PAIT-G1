package interfaz;

import java.awt.BorderLayout;
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
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class matriz2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField x1;
	private JTextField x2;
	private JTextField y1;
	private JTextField y2;
	private JTextField t1;
	private JTextField t2;
	private JTextField Archivo;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					matriz2 frame = new matriz2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public matriz2() {
		setBackground(new Color(0, 255, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Sistema 2x2");
		this.setResizable(false);
		this.setSize(390, 482);
		this.setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 224, 208));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Atrás");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				matrices v2 = new matrices();
				v2.setVisible(true);
				matriz2.this.dispose();
			}
		});
		btnNewButton.setBounds(259, 330, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Menú");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu v1 = new menu();
				v1.setVisible(true);
				matriz2.this.dispose();
			}
		});
		btnNewButton_1.setBounds(23, 330, 89, 23);
		contentPane.add(btnNewButton_1);
		
		x1 = new JTextField();
		x1.setHorizontalAlignment(SwingConstants.CENTER);
		x1.setBounds(23, 60, 76, 23);
		contentPane.add(x1);
		x1.setColumns(10);
		
		x2 = new JTextField();
		x2.setHorizontalAlignment(SwingConstants.CENTER);
		x2.setColumns(10);
		x2.setBounds(23, 94, 76, 23);
		contentPane.add(x2);
		
		JLabel lblNewLabel = new JLabel("X");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel.setBounds(23, 45, 76, 14);
		contentPane.add(lblNewLabel);
		
		y1 = new JTextField();
		y1.setHorizontalAlignment(SwingConstants.CENTER);
		y1.setColumns(10);
		y1.setBounds(142, 60, 76, 23);
		contentPane.add(y1);
		
		y2 = new JTextField();
		y2.setHorizontalAlignment(SwingConstants.CENTER);
		y2.setColumns(10);
		y2.setBounds(142, 94, 76, 23);
		contentPane.add(y2);
		
		t1 = new JTextField();
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setColumns(10);
		t1.setBounds(272, 60, 76, 23);
		contentPane.add(t1);
		
		t2 = new JTextField();
		t2.setHorizontalAlignment(SwingConstants.CENTER);
		t2.setColumns(10);
		t2.setBounds(272, 94, 76, 23);
		contentPane.add(t2);
		
		JLabel lblY = new JLabel("Y");
		lblY.setHorizontalAlignment(SwingConstants.CENTER);
		lblY.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblY.setBounds(142, 45, 76, 14);
		contentPane.add(lblY);
		
		JLabel lblTi = new JLabel("TI");
		lblTi.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblTi.setHorizontalAlignment(SwingConstants.CENTER);
		lblTi.setBounds(272, 45, 76, 14);
		contentPane.add(lblTi);
		
		JLabel lblNewLabel_1 = new JLabel("Sistema de ecuaciones 2x2");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblNewLabel_1.setBounds(79, 11, 240, 23);
		contentPane.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 162, 330, 157);
		contentPane.add(scrollPane);
		
		JTextArea Res = new JTextArea();
		Res.setEditable(false);
		scrollPane.setViewportView(Res);
		Res.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		JButton btnNewButton_2 = new JButton("Borrar");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x1.setText("");
				x2.setText("");
				y1.setText("");
				y2.setText("");
				t1.setText("");
				t2.setText("");
				Res.setText("");
			}
		});
		btnNewButton_2.setBounds(23, 128, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Calcular");
		btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//x
				float X1= Float.parseFloat(x1.getText());
				float X2= Float.parseFloat(x2.getText());
				//y
				float Y1= Float.parseFloat(y1.getText());
				float Y2= Float.parseFloat(y2.getText());
				//terminos independientes
				float T1= Float.parseFloat(t1.getText());
				float T2= Float.parseFloat(t2.getText());
				//Determinante de la matriz, x e y
				float d = (X1*Y2)-(X2*Y1);
				
				if(d==0) {
					Res.setText("No es posible resolver el sistema de ecuaciones");
				}else {
					float dx = (T1*Y2)-(T2*Y1);
				float dy = (X1*T2)-(X2*T1);
				//Resultados
				float x = dx/d;
				float y = dy/d;
				//Transforma los resultados a String para que puedan
				//imprimirse en el campo de texto "Res"
				String res = "Solucion\nDetermiante del sistema = "+d+"\nDeterminante de x = "+dx+
						"\nDeterminate de y = "+dy+"\nx= "+dx+"/"+
						d+" = "+x+"\n"+" y= "+dy+"/"+d+" = "+y;
				Res.setText(res);
				}
				
				}catch(NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Acción inválida");
				}
				
			}
		});
		btnNewButton_3.setBounds(142, 128, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Info.");
		btnNewButton_4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				info i = new info();
				i.setVisible(true);
				
				
			}
		});
		btnNewButton_4.setBounds(142, 330, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_2 = new JLabel("+");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(79, 64, 76, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("+");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(79, 97, 76, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("=");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_2_2.setBounds(204, 63, 76, 14);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("=");
		lblNewLabel_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_2_2_1.setBounds(204, 97, 76, 14);
		contentPane.add(lblNewLabel_2_2_1);
		
		JButton btnNewButton_3_1 = new JButton("Calculadora");
		btnNewButton_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora cl = new calculadora();
				cl.setVisible(true);
			}
		});
		btnNewButton_3_1.setBounds(259, 128, 89, 23);
		contentPane.add(btnNewButton_3_1);
		
		JButton btnNewButton_1_1 = new JButton("Guardar");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Archivo.getText().isBlank()) {
					//Ruta ve en descargas
					String ruta = System.getProperty("user.home") + File.separator + "Downloads" + File.separator + "Sistema de ecuacion 2x2.txt";
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
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton_1_1.setBounds(23, 396, 89, 23);
		contentPane.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("Nombre");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(136, 377, 57, 14);
		contentPane.add(lblNewLabel_3);
		
		Archivo = new JTextField();
		Archivo.setBounds(133, 397, 215, 20);
		contentPane.add(Archivo);
		Archivo.setColumns(10);
		
		
		
	}
}
