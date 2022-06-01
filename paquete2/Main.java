package paquete2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner teclado = new Scanner(System.in);

	    int sueldos[] = new int[6];
        double promedio;
        int suma=0;
        int mayores=0;
    	for (int i=0; i<6; i++) {
    		System.out.println("Ingrese el sueldo "+ (i+1) + ":");
    		sueldos[i]=teclado.nextInt();
    		if (sueldos[i]>5000) {
    			
    			suma = (suma+sueldos[i]);
    		}
    	}
    		promedio = suma/mayores;
    		System.out.println("El promedio de los sueldos mayores a $5000 es " + mayores);
	}
	}



