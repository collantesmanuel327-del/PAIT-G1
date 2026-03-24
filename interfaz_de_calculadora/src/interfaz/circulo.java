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
import javax.swing.JComboBox;
import java.awt.SystemColor;

public class circulo extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField Radio1;
    private JTextArea respuesta;
    private JLabel lblInput; // ← DECLARADO como atributo de la clase

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

        // ← INICIALIZADO aquí dentro del constructor
        lblInput = new JLabel("R=");
        lblInput.setForeground(new Color(255, 255, 255));
        lblInput.setBounds(58, 225, 50, 26);
        contentPane.add(lblInput);

        JLabel lblNewLabel_7 = new JLabel("R=");
        lblNewLabel_7.setForeground(new Color(255, 255, 255));
        lblNewLabel_7.setBounds(36, 382, 29, 12);
        contentPane.add(lblNewLabel_7);

        JComboBox<String> comboBox = new JComboBox<>(new String[]{
            "Área",
            "Perímetro",
            "Radio",
            "Circunferencia"
        });
        comboBox.setBounds(223, 228, 150, 20);
        contentPane.add(comboBox);

        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String seleccion = (String) comboBox.getSelectedItem();
                switch (seleccion) {
                    case "Área":
                        lblInput.setText("R=");
                        break;
                    case "Perímetro":
                        lblInput.setText("R=");
                        break;
                    case "Radio":
                        lblInput.setText("C=");
                        break;
                    case "Circunferencia":
                        lblInput.setText("R=");
                        break;
                }
                Radio1.setText("");
                respuesta.setText("");
            }
        });

        JButton btnNewButton = new JButton("Calcular");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    float valor = Float.parseFloat(Radio1.getText());

                    if (valor <= 0) {
                        JOptionPane.showMessageDialog(null, "Solo números positivos");
                        return;
                    }

                    String seleccion = (String) comboBox.getSelectedItem();
                    String resultado = "";

                    switch (seleccion) {
                        case "Área":
                            float area = (float)(Math.PI * valor * valor);
                            resultado = "Área = " + area;
                            break;
                        case "Perímetro":
                            float perimetro = (float)(2 * Math.PI * valor);
                            resultado = "Perímetro = " + perimetro;
                            break;
                        case "Radio":
                            float radio = (float)(valor / (2 * Math.PI));
                            resultado = "Radio = " + radio;
                            break;
                        case "Circunferencia":
                            float circunferencia = (float)(2 * Math.PI * valor);
                            resultado = "Circunferencia = " + circunferencia;
                            break;
                    }

                    respuesta.setText(resultado);

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
        lblNewLabel_7_1.setBounds(358, 67, 223, 43);
        contentPane.add(lblNewLabel_7_1);

        JLabel lblNewLabel_7_1_1 = new JLabel("P=2*PI*r");
        lblNewLabel_7_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_7_1_1.setFont(new Font("Times New Roman", Font.ITALIC, 19));
        lblNewLabel_7_1_1.setBounds(358, 105, 223, 43);
        contentPane.add(lblNewLabel_7_1_1);

        JLabel lblNewLabel_7_1_1_1 = new JLabel("R=C/2PI");
        lblNewLabel_7_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_7_1_1_1.setFont(new Font("Times New Roman", Font.ITALIC, 19));
        lblNewLabel_7_1_1_1.setBounds(362, 158, 223, 43);
        contentPane.add(lblNewLabel_7_1_1_1);

        JLabel lblNewLabel_7_1_1_1_1 = new JLabel("C=2*PI*R");
        lblNewLabel_7_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_7_1_1_1_1.setFont(new Font("Times New Roman", Font.ITALIC, 19));
        lblNewLabel_7_1_1_1_1.setBounds(358, 204, 223, 43);
        contentPane.add(lblNewLabel_7_1_1_1_1);

        respuesta = new JTextArea();
        respuesta.setBackground(SystemColor.inactiveCaption);
        respuesta.setEditable(false);
        respuesta.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        respuesta.setBounds(79, 322, 283, 126);
        contentPane.add(respuesta);

        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon(circulo.class.getResource("/imagen/hollow.png")));
        lblNewLabel.setBounds(52, 28, 300, 169);
        contentPane.add(lblNewLabel);

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

        JButton btnInfo = new JButton("Info...");
        btnInfo.setBackground(SystemColor.inactiveCaptionBorder);
        btnInfo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                info i = new info();
                i.setVisible(true);
            }
        });
        btnInfo.setBounds(445, 378, 84, 20);
        contentPane.add(btnInfo);

        JButton btnBorrar = new JButton("Borrar");
        btnBorrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Radio1.setText("");
                respuesta.setText("");
            }
        });
        btnBorrar.setBounds(445, 342, 84, 20);
        contentPane.add(btnBorrar);

        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon(circulo.class.getResource("/imagen/Captura de pantalla 2026-02-28 223058.png")));
        lblNewLabel_1.setBounds(0, 0, 588, 458);
        contentPane.add(lblNewLabel_1);
    }
}