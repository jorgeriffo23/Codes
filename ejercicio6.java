package boletin4;

import java.util.Scanner;

public class ejercicio6 {
	

    private static Scanner sc;
	public static void main(String[]arg){
		sc = new Scanner(System.in);
		int [] num = new int[12];
		int [] num2 = new int[12];
		int [] numr = new int[24];
		int i1=0,i2=0,k=0,l=0;
		System.out.print("\nIngresar 2 tablas de 12 numeros");
		
		while (i1<12) {
			num[i1]=sc.nextInt();
			
			
		
			i1++;
		}
		System.out.print("\nIngresar 10 numeros mas");
		while (i2<12) {
			
			num2[i2]=sc.nextInt();
			
			
			i2++;
		}

		System.out.print("\nLos numeros  son:");
		while (l<4) {
			
			numr[6*l]=num[3*l];
			numr[6*l+1]=num[3*l+1];
			numr[6*l+2]=num[3*l+2];
			numr[6*l+3]=num2[3*l];
			numr[6*l+4]=num2[3*l+1];
			numr[6*l+5]=num2[3*l+2];
		
			l++;
			
			
		}
		while (k<24) {
			System.out.print("\n"+numr[k]);
			
			k++;
		}
		
}
}