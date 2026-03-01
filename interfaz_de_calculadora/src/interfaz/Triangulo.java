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

public class Triangulo extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField Incognita;
    private JTextArea textArea;
    private JLabel lblLado; // ← declarado como atributo para poder modificarlo

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
        lblArea.setForeground(new Color(255, 255, 255));
        lblArea.setBackground(new Color(240, 240, 240));
        lblArea.setFont(new Font("Times New Roman", Font.ITALIC, 16));
        lblArea.setHorizontalAlignment(SwingConstants.CENTER);
        lblArea.setBounds(328, 47, 250, 43);
        contentPane.add(lblArea);

        JLabel lblPerimetro = new JLabel("Perimetro = 3a");
        lblPerimetro.setForeground(new Color(255, 255, 255));
        lblPerimetro.setFont(new Font("Times New Roman", Font.ITALIC, 16));
        lblPerimetro.setHorizontalAlignment(SwingConstants.CENTER);
        lblPerimetro.setBounds(320, 100, 250, 43);
        contentPane.add(lblPerimetro);

        // Etiqueta dinámica que cambia según la opción seleccionada
        lblLado = new JLabel("I=");
        lblLado.setBounds(47, 252, 70, 26);
        contentPane.add(lblLado);

        Incognita = new JTextField();
        Incognita.setForeground(new Color(255, 255, 255));
        Incognita.setBounds(115, 256, 96, 18);
        Incognita.setColumns(10);
        contentPane.add(Incognita);

        // ComboBox con las opciones
        JComboBox<String> comboBox = new JComboBox<>(new String[]{
            "Área",
            "Perímetro",
            "Lado"
        });
        comboBox.setBounds(240, 255, 100, 20);
        contentPane.add(comboBox);

        // Cambia la etiqueta según la opción elegida
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String seleccion = (String) comboBox.getSelectedItem();
                switch (seleccion) {
                    case "Área":
                        lblLado.setText("L=");
                        break;
                    case "Perímetro":
                        lblLado.setText("L=");
                        break;
                    case "Lado":
                        lblLado.setText("P=");
                        break;
                }
                Incognita.setText("");
                textArea.setText("");
            }
        });

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    float valor = Float.parseFloat(Incognita.getText());

                    if (valor <= 0) {
                        JOptionPane.showMessageDialog(null, "Solo números positivos");
                        return;
                    }

                    String seleccion = (String) comboBox.getSelectedItem();
                    String resultado = "";

                    switch (seleccion) {
                        case "Área":
                            // Entrada: Lado → calcula Área
                            float area = (float)((valor * valor * Math.sqrt(3)) / 4);
                            resultado = String.format("Área = %.2f", area);
                            break;

                        case "Perímetro":
                            // Entrada: Lado → calcula Perímetro
                            float perimetro = 3 * valor;
                            resultado = String.format("Perímetro = %.2f", perimetro);
                            break;

                        case "Lado":
                            // Entrada: Perímetro → calcula Lado
                            float lado = valor / 3;
                            resultado = String.format("Lado = %.2f", lado);
                            break;
                    }

                    textArea.setText(resultado);

                } catch (NumberFormatException e1) {
                    JOptionPane.showMessageDialog(null, "Ingrese solo números");
                }
            }
        });
        btnCalcular.setBounds(201, 292, 84, 20);
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
        lblNewLabel.setBounds(17, 10, 250, 207);
        contentPane.add(lblNewLabel);

        JButton btnNewButton = new JButton("Info...");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                info i = new info();
                i.setVisible(true);
            }
        });
        btnNewButton.setBounds(451, 390, 84, 20);
        contentPane.add(btnNewButton);

        JLabel lblLadoP = new JLabel("Lado = P/3");
        lblLadoP.setForeground(new Color(255, 255, 255));
        lblLadoP.setHorizontalAlignment(SwingConstants.CENTER);
        lblLadoP.setFont(new Font("Times New Roman", Font.ITALIC, 16));
        lblLadoP.setBounds(308, 153, 250, 43);
        contentPane.add(lblLadoP);
        
        JButton btnBorrar = new JButton("Borrar");
        btnBorrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Incognita.setText("");
                textArea.setText("");
            }
        });
        btnBorrar.setBounds(451, 360, 84, 20);
        contentPane.add(btnBorrar);
        btnBorrar.setBounds(451, 360, 84, 20);
        contentPane.add(btnBorrar);
        
        JLabel lblNewLabel_1 = new JLabel("New label");
        lblNewLabel_1.setIcon(new ImageIcon(Triangulo.class.getResource("/imagen/imagen_2026-02-28_233615731.png")));
        lblNewLabel_1.setBounds(0, 0, 588, 458);
        contentPane.add(lblNewLabel_1);
    }
}