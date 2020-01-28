package boletin4;

import java.util.Scanner;

public class ejercicio8 {
	

    private static Scanner sc;
	public static void main(String[]arg){
		sc = new Scanner(System.in);
		int [] num = new int[10];
		
		int i=0,k=0,n,p,j=0,c=0;
		System.out.print("\nIngresar 8 numeros");
		
		while (i<8) {
			num[i]=sc.nextInt();
			i++;
			
		}
		System.out.print("\nIngresar un numero y una posicion para agregarlo a la tabla.");
		n=sc.nextInt();
		p=sc.nextInt();
		c=9;
	    
	    while(c>p) {
	    	num[c]=num[c-1];
	    	c--;
	    }
	    
	    num[p]=n;
		
	    while (j<10) {
	    	System.out.print("\n"+num[j]);
			j++;
			
		}
}
}