package interfaz;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class cuadrado extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;   
    private JTextArea textArea;  

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cuadrado frame = new cuadrado();
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
	public cuadrado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
        setSize(602, 495);
        this.setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(210, 180, 140));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);


        JLabel lblLado = new JLabel("Lado=");
        lblLado.setBounds(58, 225, 70, 26);
        contentPane.add(lblLado);

        textField = new JTextField();
        textField.setBounds(104, 229, 96, 18);
        textField.setColumns(10);
        contentPane.add(textField);

        JLabel lblArea = new JLabel("A = L²");
        lblArea.setFont(new Font("Times New Roman", Font.ITALIC, 19));
        lblArea.setHorizontalAlignment(SwingConstants.CENTER);
        lblArea.setBounds(362, 40, 223, 43);
        contentPane.add(lblArea);

        JLabel lblPerimetro = new JLabel("P = 4*L");
        lblPerimetro.setFont(new Font("Times New Roman", Font.ITALIC, 19));
        lblPerimetro.setHorizontalAlignment(SwingConstants.CENTER);
        lblPerimetro.setBounds(362, 90, 223, 43);
        contentPane.add(lblPerimetro);

        JLabel lblDiagonal = new JLabel("D = L*√2");
        lblDiagonal.setFont(new Font("Times New Roman", Font.ITALIC, 19));
        lblDiagonal.setHorizontalAlignment(SwingConstants.CENTER);
        lblDiagonal.setBounds(362, 140, 223, 43);
        contentPane.add(lblDiagonal);

        JButton btnNewButton = new JButton("Calcular");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double L = Double.parseDouble(textField.getText());

                    if (L <= 0) {
                        JOptionPane.showMessageDialog(null, "Solo números positivos");
                        return;
                    }

                    double area     = L * L;
                    double perimetro = 4 * L;
                    double diagonal  = L * Math.sqrt(2);

                    textArea.setText(
                        "A= " + area + "\n" +
                        "P= " + perimetro + "\n" +
                        "D= " + diagonal
                    );

                } catch (NumberFormatException e1) {
                    JOptionPane.showMessageDialog(null, "Ingrese solo números");
                }
            }
        });
        btnNewButton.setBounds(264, 255, 84, 20);
        contentPane.add(btnNewButton);

        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        textArea.setBounds(79, 322, 283, 126);
        contentPane.add(textArea);
        
        JLabel lblR = new JLabel("R=");
        lblR.setBounds(28, 358, 70, 26);
        contentPane.add(lblR);
        
        //  BOTON MENU 
        JButton retro = new JButton("Atras");
        retro.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
                figuras menu = new figuras();
                menu.setVisible(true);
                dispose(); 
            }
        });
        retro.setBounds(453, 407, 84, 20);
        contentPane.add(retro);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon(cuadrado.class.getResource("/imagen/images.jpg")));
        lblNewLabel.setBounds(104, 33, 158, 160);
        contentPane.add(lblNewLabel);
        
        JButton btnInfo = new JButton("Info...");
        btnInfo.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		info i = new info();
        		i.setVisible(true);
        	}
        });
        btnInfo.setBounds(453, 376, 84, 20);
        contentPane.add(btnInfo);

	}

}
