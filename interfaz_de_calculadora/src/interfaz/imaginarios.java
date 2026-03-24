package interfaz;

import java.awt.Color;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.annotations.XYPointerAnnotation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class imaginarios extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public imaginarios(String titulo, double a, double b, double c) {
        super(titulo);

        XYSeries series = new XYSeries("y = " + a + "x² + " + b + "x + " + c);

        // Usamos un incremento pequeño (0.1) para que la curva sea fluida
        for (double x = -5; x <= 5; x += 0.1) {
            // Aplicamos la fórmula: y = ax^2 + bx + c
            double y2 = (-a * Math.pow(x, 2)) + (b * x) + c; 
            series.add(x, y2);
        }
        
        XYSeriesCollection dataset = new XYSeriesCollection(series);
        JFreeChart chart = ChartFactory.createXYLineChart(
                "Gráfica de Segundo Grado (Imaginario)",
                "Eje X (imaginario)",
                "Eje Y",
                dataset
        );

        ChartPanel panel = new ChartPanel(chart);
        setContentPane(panel);
        
        
        double discriminante = (b * b) - (4 * a * c);

        if (discriminante <= 0) {
            // Cálculo de las dos raíces
            double x1 = (-b + Math.sqrt(-discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(-discriminante)) / (2 * a);

            // Dibujar Punto 1
            
            String nombre = "X1i=";
          
			XYPointerAnnotation punto1 = new XYPointerAnnotation(
        nombre + " (" + String.format("%.2f", x1) + " i, 0)", 
        x1, 0, -Math.PI / 2 // Flecha apuntando hacia abajo
    );
             punto1.setPaint(Color.BLUE);
            chart.getXYPlot().addAnnotation(punto1);

            // Dibujar Punto 2 (solo si es distinto al primero)
            if (discriminante < 0) {
            	 String nombre1 = "X2i=";
 			XYPointerAnnotation punto11 = new XYPointerAnnotation(
             nombre1 + " (" + String.format("%.2f", x2) + " i, 0)", 
             x2, 0, -Math.PI / 2 
         );
                chart.getXYPlot().addAnnotation(punto11);
            }
        } 
        
    }

}
