package paquete4;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		int[] numero = new int[5];
	    int i=0;
	    int mayor = numero[0];
	    System.out.println("Ingrese 5 números positivos: ");
     	 do {
     		System.out.println("Numero "+(i+1)+ ":");
           numero[i] = teclado.nextInt();
           if (numero[i] < 0) {
           	System.out.println("Error");  
       }
           else {
           	i++;   	
       }
     	 }while(i<5);
  
       System.out.println("Positivos: " + i);     
       		
		for ( i = 0; i < 5; i++) {
			if (numero[i] > mayor) {
				 mayor = numero[i];
			}
		}
		System.out.println("El mayor es: " + mayor);
	}

}
