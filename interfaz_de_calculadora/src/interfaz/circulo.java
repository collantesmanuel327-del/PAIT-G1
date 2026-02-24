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

public class circulo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Radio1;
    private JTextArea respuesta; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					circulo frame = new circulo();
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
	public circulo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
        setSize(602, 495);
        this.setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(176, 224, 230));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        Radio1 = new JTextField();
        Radio1.setBounds(104, 229, 96, 18);
        contentPane.add(Radio1);
        Radio1.setColumns(10);

        JLabel lblNewLabel_7 = new JLabel("R=");
        lblNewLabel_7.setBounds(36, 382, 29, 12);
        contentPane.add(lblNewLabel_7);

        JButton btnNewButton = new JButton("Calcular");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double Ra = Double.parseDouble(Radio1.getText());
                    if (Ra <= 0) {
                        JOptionPane.showMessageDialog(null, "Solo números positivos");
                        return;
                    }
                    double area = Math.PI * Ra * Ra;
                    double perimetro = 2 * Math.PI * Ra;
                    respuesta.setText("A= " + area + "\nP= " + perimetro);

                } catch (NumberFormatException e1) {
                    JOptionPane.showMessageDialog(null, "Ingrese solo números");
                }
            }
        });
        btnNewButton.setBounds(264, 255, 84, 20);
        contentPane.add(btnNewButton);

        JLabel lblNewLabel_7_1 = new JLabel(" A= PI*r^2");
        lblNewLabel_7_1.setFont(new Font("Times New Roman", Font.ITALIC, 19));
        lblNewLabel_7_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_7_1.setBounds(362, 40, 223, 43);
        contentPane.add(lblNewLabel_7_1);

        JLabel lblNewLabel_7_1_1 = new JLabel("P=2*PI*r");
        lblNewLabel_7_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_7_1_1.setFont(new Font("Times New Roman", Font.ITALIC, 19));
        lblNewLabel_7_1_1.setBounds(358, 105, 223, 43);
        contentPane.add(lblNewLabel_7_1_1);

        JLabel lblNewLabel_7_2 = new JLabel("Radio=");
        lblNewLabel_7_2.setBounds(58, 225, 70, 26);
        contentPane.add(lblNewLabel_7_2);

        respuesta = new JTextArea();
        respuesta.setEditable(false);
        respuesta.setBounds(79, 322, 283, 126);
        contentPane.add(respuesta);
       
        JButton Retriceso = new JButton("Atras");
        Retriceso.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                figuras fi = new figuras();
                fi.setVisible(true);
                dispose(); 
            }
        });
        Retriceso.setBounds(445, 411, 84, 20);
        contentPane.add(Retriceso);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon(circulo.class.getResource("/imagen/circu (1) (1).jpg")));
        lblNewLabel.setBounds(52, 28, 300, 169);
        contentPane.add(lblNewLabel);
        
        JButton btnInfo = new JButton("Info...");
        btnInfo.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		info i = new info();
        		i.setVisible(true);
        	}
        });
        btnInfo.setBounds(445, 378, 84, 20);
        contentPane.add(btnInfo);
	}

}
