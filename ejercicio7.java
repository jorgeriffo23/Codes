package boletin4;

import java.util.Scanner;

public class ejercicio7 {
	

    private static Scanner sc;
	public static void main(String[]arg){
		sc = new Scanner(System.in);
		int [] num = new int[10];
		
		int i=0,k=0,l=0;
		System.out.print("\nIngresar 10 numeros");
		
		while (i<10) {
			num[i]=sc.nextInt();
			i++;
			
		}
		
		while (l<9) {
			if (num[l]<=num[l+1]) {
				k++;
			}
			else if (num[l]>=num[l+1]) {
				k--;
			}
			l++;
			}
		if(k==9) {
			System.out.print("orden creciente");
			
		}
		if(k==-9) {
			System.out.print("orden decreciente");
			
		}
		else if(k!=9 && k!=-9) {
			System.out.print("\nLos numeros estan desordenados.");
		}
}
}