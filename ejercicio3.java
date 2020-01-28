package boletin4;

import java.util.Scanner;

public class ejercicio3 {
	

    private static Scanner sc;
	public static void main(String[]arg){
		sc = new Scanner(System.in);
		int [] num = new int[5];
		int i=0,j=0;
		double mn=0,mp=0,n=0,p=0,c=0,sp=0,sn=0;
		System.out.print("\nIngresar 5 numeros");
		
		while (i<5) {
			System.out.print("\nIngresar valor: "+(i+1));
			num[i]=sc.nextInt();
			i++;
		}

		System.out.print("\nLos numeros  son:");
		while (j<5) {
			if (num[j]<0) {
				n++;
				sn = sn +num[j];
				mn=sn/n;
			}
			else if (num[j]>0) {
				
				p++;
				sp = sp +num[j];
				mp=sp/p;
			}
			else {
				c++;
			}
			
			j++;
		}
		System.out.print("\nMedia positivos:"+mp);
		System.out.print("\nMedia negativos:"+mn);
		System.out.print("\nNumero de ceros:"+c);
}
}