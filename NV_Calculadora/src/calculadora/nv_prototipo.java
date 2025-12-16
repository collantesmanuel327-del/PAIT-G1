package calculadora;

import java.util.Scanner;

public class nv_prototipo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Elija una opcion");
        System.out.println("1 Calculadora de sistema de ecuaciones 2x2 \n2 Ecuaciones 1 y 2 grado \n3 Figuras geometricas");
        
        Integer op = sc.nextInt();
        switch (op) {
        case 1:
        	System.out.println("Ingrese x1");
        	float x1=sc.nextFloat();
        	System.out.println("Ingrese y1");
        	float y1=sc.nextFloat();
        	System.out.println("Ingrese t1");
        	float t1=sc.nextFloat();
        	System.out.println("Ingrese x2");
        	float x2=sc.nextFloat();
        	System.out.println("Ingrese y2");
        	float y2=sc.nextFloat();
        	System.out.println("Ingrese t2");
        	float t2=sc.nextFloat();
        	sistema (x1,x2,y1,y2,t1,t2);
        	break;
        case 2:
        	System.out.print("Hola mundo");
        	break;
        case 3:
        	System.out.print("Hola mundo");
        	break;
        default:
        	System.out.println("No es valido ");
        	break;
        }
          }
public static float sistema (float x1,float x2,float y1,float y2,float t1,float t2) {
	float d =(x1*y2)-(x2*y1);
	if (d!=0) {
		float dx=(t1*y2)-(y1*t2);
		float dy=(t2*x1)-(x2*t1);
		float x=dx/d;
		float y=dy/d;
		System.out.println("Los valores son: \nx="+x+"\ny="+y);
	}else {
	    System.out.println("El determinante es 0, no se puede");
	}
	float r=0;
	return r;
}


	}
