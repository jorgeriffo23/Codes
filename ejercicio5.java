package boletin4;

import java.util.Scanner;

public class ejercicio5 {
	

    private static Scanner sc;
	public static void main(String[]arg){
		sc = new Scanner(System.in);
		int [] num = new int[10];
		int [] num2 = new int[10];
		int [] numr = new int[20];
		int i1=0,i2=0,j=0,k=0,l=0;
		System.out.print("\nIngresar 10 numeros");
		
		while (i1<10) {
			num[i1]=sc.nextInt();
			
			i1++;
		}
		System.out.print("\nIngresar 10 numeros mas");
		while (i2<10) {
			
			num2[i2]=sc.nextInt();
			i2++;
		}

		System.out.print("\nLos numeros  son:");
		while (l<10) {
			
			numr[2*l]=num[l];
			numr[2*l+1]=num[l];
			
			l++;
			
			
		}
		while (k<20) {
			System.out.print("\n"+numr[k]);
			
			k++;
		}
		
}
}