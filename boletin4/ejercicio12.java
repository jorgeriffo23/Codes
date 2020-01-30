package boletin4;

import java.util.Scanner;

public class ejercicio12 {
	

    private static Scanner sc;
	public static void main(String[]arg){
		sc = new Scanner(System.in);
		int [] num = new int[10];
		
		int i=0,p,j=0,c=0;
		System.out.print("\nIngresar 10 numeros");
		
		while (i<10) {
			num[i]=sc.nextInt();
			i++;
			
		}
		System.out.print("\nIngresar una posicion para eliminar el elemento de la tabla.");
		p=sc.nextInt();
		c=p;
	    
	    while(c<9) {
	    	num[c]=num[c+1];
	    	c++;
	    }
	    num[9]=0;
	    
		
	    while (j<10) {
	    	System.out.print("\n"+num[j]);
			j++;
			
		}
}
}