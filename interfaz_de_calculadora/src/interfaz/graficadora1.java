package interfaz;

import java.awt.Color;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.annotations.XYPointerAnnotation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import java.awt.FlowLayout;

public class graficadora1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public graficadora1(String titulo, double m, double b) {
        super(titulo);

        // Crear la serie de datos
        XYSeries series = new XYSeries("Ecuación: y = " + m + "x + " + b);
        
        // Generar puntos (por ejemplo, de x = -10 a x = 10)
        for (double x = -10; x <= 10; x++) {
            double y = (m * x) + b;
            series.add(x, y);
        }

        XYSeriesCollection dataset = new XYSeriesCollection(series);

        // Se crea el gráfico
        JFreeChart chart = ChartFactory.createXYLineChart(
                "Gráfica de Primer Grado", // Título
                "Eje X",                   // Etiqueta X
                "Eje Y",                   // Etiqueta Y
                dataset
        );

        // Lo muestra en un panel de la libreria
        ChartPanel panel = new ChartPanel(chart);
        setContentPane(panel);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        
        double puntoX = 0;
        double puntoY = b;

        XYPointerAnnotation anotacion = new XYPointerAnnotation(
            "Intercepto (0, " + b + ")", 
            puntoX, 
            puntoY, 
            Math.PI / 4 // Ángulo de la flecha (45 grados)
        );
        anotacion.setPaint(Color.BLACK); // Color del texto y flecha
        anotacion.setArrowPaint(Color.RED);
        
        chart.getXYPlot().addAnnotation(anotacion);
    }
}