package paquete3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado=new Scanner (System.in);
	int edades[]=new int[10];
	int mayores=0;
	int contador=0;
	double promedio=0;
	int valor;
	int i=0;
	do {
	System.out.print("Ingrese una edad mayor de 18: ");
	valor=teclado.nextInt();
	if(valor<=18) {
		System.out.println("Error, las personas deben der mayores de 18, ingrese de nuevo.");
	}
	else {
		edades[i]=valor;
		mayores=mayores+edades[i];
		i++;
		contador++;
	}
}while (i<10);
	promedio=mayores/contador;
	System.out.println("El promedio de edad es:" + promedio);
	}

}
