package interfaz;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.annotations.XYPointerAnnotation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import java.awt.Color;

import javax.swing.JFrame;

public class gradicadora2 extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	// Recibimos los parámetros a, b y c de: ax^2 + bx + c
    public gradicadora2(String title, double a, double b, double c) {
    	//titulo
        super(title);

        XYSeries series = new XYSeries("y = " + a + "x² + " + b + "x + " + c);
        
        // Usamos un incremento pequeño (0.1) para que la curva sea fluida
        for (double x = -10; x <= 5; x += 0.1) {
            // Aplicamos la fórmula: y = ax^2 + bx + c
            double y = (a * Math.pow(x, 2)) + (b * x) + c;
            series.add(x, y);
        }
        
        //datos de la grafica
        XYSeriesCollection dataset = new XYSeriesCollection(series);
        JFreeChart chart = ChartFactory.createXYLineChart(
        		//titulo
                "Gráfica de Segundo Grado (Reales)",
                "Eje X",
                "Eje Y",
                dataset
        );

        ChartPanel panel = new ChartPanel(chart);
        setContentPane(panel);
        if (a != 0) {
            double vx = -b / (2 * a);
            double vy = (a * vx * vx) + (b * vx) + c;

            // Crear la anotación (Etiqueta, x, y, ángulo de la flecha)
            XYPointerAnnotation punto = new XYPointerAnnotation(
                "Vértice (" + String.format("%.2f", vx) + ", " + String.format("%.2f", vy) + ")",
                vx, vy, 3.0 * Math.PI / 4.0 // Ángulo en radianes
            );
            
            punto.setTipRadius(0); // Para que la punta toque exactamente el punto
            chart.getXYPlot().addAnnotation(punto);
            
            
            double discriminante = (b * b) - (4 * a * c);

            if (discriminante >= 0) {
                // Cálculo de las dos raíces
                double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

                // Dibujar Punto 1
                
                String nombre = "X1 =";
              
				XYPointerAnnotation punto1 = new XYPointerAnnotation(
            nombre + " (" + String.format("%.2f", x1) + ", 0)", 
            x1, 0, -Math.PI / 2 // Flecha apuntando hacia abajo
        );
                 punto1.setPaint(Color.BLUE);
                chart.getXYPlot().addAnnotation(punto1);

                // Dibujar Punto 2 (solo si es distinto al primero)
                if (discriminante > 0) {
                	 String nombre1 = "X2 =";
     			XYPointerAnnotation punto11 = new XYPointerAnnotation(
                 nombre1 + " (" + String.format("%.2f", x2) + ", 0)", 
                 x2, 0, -Math.PI / 2 
             );
                    chart.getXYPlot().addAnnotation(punto11);
                }
            } 
            
        }
        
    }
    
    
}
