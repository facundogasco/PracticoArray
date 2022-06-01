package paquete1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner teclado = new Scanner(System.in);
	  
	    int arr[]=new int[5];
	       for (int i=0; i<arr.length;i++) {
	    	   System.out.println("Ingrese un número: ");
	    	   arr[i]=teclado.nextInt();
	      }
	    int mayor, menor;
	   mayor=menor=arr[0];

        for (int i = 0; i < 5; i++) {
           if(arr [i] > mayor) {
                mayor = arr[i];
           }
           if(arr[i]<menor) {
               menor = arr[i];
            }
        }
       System.out.println("El valor mas grande es: " + mayor);
        System.out.println("El valor mas pequeño es: " + menor);      
    	}   
	}
	


