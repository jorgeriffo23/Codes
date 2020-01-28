package boletin4;

import java.util.Scanner;

public class ejercicio4 {
	

    private static Scanner sc;
	public static void main(String[]arg){
		sc = new Scanner(System.in);
		int [] num = new int[10];
		int i=0,j=0;
		System.out.print("\nIngresar 5 numeros");
		
		while (i<10) {
			num[i]=sc.nextInt();
			i++;
		}

		System.out.print("\nLos numeros  son:");
		while (j<5) {
			System.out.print("\n"+num[j]);
			System.out.print("\n"+num[-j+9]);
			j++;
		}
		
}
}