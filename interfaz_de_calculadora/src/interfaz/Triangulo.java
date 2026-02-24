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

public class Triangulo extends JFrame {

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
					Triangulo frame = new Triangulo();
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
	public Triangulo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
        setSize(602, 495);
        this.setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 250, 154));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblArea = new JLabel("Área = (a²√(3))/4");
        lblArea.setFont(new Font("Times New Roman", Font.ITALIC, 16));
        lblArea.setHorizontalAlignment(SwingConstants.CENTER);
        lblArea.setBounds(320, 40, 250, 43);
        contentPane.add(lblArea);

        JLabel lblPerimetro = new JLabel("Perimetro = 3a");
        lblPerimetro.setFont(new Font("Times New Roman", Font.ITALIC, 16));
        lblPerimetro.setHorizontalAlignment(SwingConstants.CENTER);
        lblPerimetro.setBounds(320, 100, 250, 43);
        contentPane.add(lblPerimetro);

        JLabel lblLado = new JLabel("Lado =");
        lblLado.setBounds(47, 252, 70, 26);
        contentPane.add(lblLado);

        textField = new JTextField();
        textField.setBounds(115, 256, 96, 18);
        textField.setColumns(10);
        contentPane.add(textField);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(textField.getText());

                    if (a <= 0) {
                        JOptionPane.showMessageDialog(null, "Solo números positivos");
                        return;
                    }

                    double area = (a * a * Math.sqrt(3)) / 4;
                    double perimetro = 3 * a;

                    textArea.setText(
                        String.format("Area= %.2f\nPerimetro= %.2f", area, perimetro)
                    );

                } catch (NumberFormatException e1) {
                    JOptionPane.showMessageDialog(null, "Ingrese solo números");
                }
            }
        });
        btnCalcular.setBounds(264, 255, 84, 20);
        contentPane.add(btnCalcular);

        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        textArea.setBounds(79, 322, 283, 126);
        contentPane.add(textArea);

        JLabel lblR = new JLabel("R=");
        lblR.setBounds(10, 346, 70, 26);
        contentPane.add(lblR);

        
        JButton retroseder = new JButton("Atras");
        retroseder.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                figuras menu = new figuras();
                menu.setVisible(true);
                dispose(); 
            }
        });
        retroseder.setBounds(451, 420, 84, 20); 
        contentPane.add(retroseder);              
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon(Triangulo.class.getResource("/imagen/imagen_2026-02-24_015826849.png")));
        lblNewLabel.setBounds(46, 10, 283, 229);
        contentPane.add(lblNewLabel);
        
        JButton btnNewButton = new JButton("Info...");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		info i = new info();
        		i.setVisible(true);
        	}
        });
        btnNewButton.setBounds(451, 372, 84, 20);
        contentPane.add(btnNewButton);

	}

}
