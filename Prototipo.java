package calculadora;
import java.util.Scanner;
public class Prototipo {
          public static void main (String args []) {
        Boolean aceptar;
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija una opcion");
        System.out.println("1 Calculadora de sistema de ecuaciones \n2 Ecuaciones 1 y 2 grado \n3 Figuras geometricas");
        
        do {
            try {
                Integer op = sc.nextInt();
                aceptar = true;
            } 
            catch (Exception e) {
                System.out.println("Debes ingresar 1,2 o 3");
            }
        } while (aceptar=true);
        
          }
public static float sistema (float x1,float x2,float y1,float y2,float t1,float t2) {
	float d =(x1*y2)-(x2*y1);
	
	return d;
}
         
}
