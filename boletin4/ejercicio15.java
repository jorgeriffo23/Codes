package boletin4;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio15 {
	

    private static Scanner sc;
	public static void main(String[]arg){
		sc = new Scanner(System.in);
		int [] num = new int[10];
		
		int i1=0,n;
		
		for(i1=0;i1<10;i1++) {
			num[i1]=(int)(Math.random()*20);
		}
		
		Arrays.sort(num);
		System.out.print("\nIngresar 1 numero:"+Arrays.toString(num));
		
		while (i1<10) {
			num[i1]=sc.nextInt();
			
			i1++;
		}
		System.out.print("\nIngresar 1 numero:");
		n=sc.nextInt();
		
		for(i1=0;i1<10;i1++) {
			if (num[i1]==n) {
				System.out.print("\nNumero ingresado en posicion "+i1);
				break;
			}
			else if (num[i1]==9) {
				System.out.print("\nEl numero ingresado no se encuentra en el conjunto.");
			}
		}
		
}
}