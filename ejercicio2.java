package boletin4;

import java.util.Scanner;

public class ejercicio2 {
	

    private static Scanner sc;
	public static void main(String[]arg){
		sc = new Scanner(System.in);
		int [] num = new int[6];
		int i=0,j=4;
		System.out.print("\nIngresar 5 numeros");
		
		while (i<5) {
			num[i]=sc.nextInt();
			i++;
		}

		System.out.print("\nLos numeros  son:");
		while (j>=0 && j<5) {
			System.out.print("\n"+num[j]);
			j--;
		}
		
}
}