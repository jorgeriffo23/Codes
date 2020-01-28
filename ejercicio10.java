package boletin4;

import java.util.Scanner;

public class ejercicio10 {
	

    private static Scanner sc;
	public static void main(String[]arg){
		sc = new Scanner(System.in);
		int [] num = new int[10];
		int [] num2 = new int[10];
		
		int i=0,j=0,c,N;
		System.out.print("\nIngresar 10 numeros");
		
		while (i<10) {
			num[i]=sc.nextInt();
			i++;
			
		}
		System.out.print("\nMover N posiciones, con N= ");
		N=sc.nextInt();
	    c=9;
		
	    while((c)>=0) {
	    	
	    	if(c>(N-1)) {
	    		num2[c]=num[c-N];
	     }
	    	else if(c<=(N-1)) {
	    		num2[c]=num[9-(N-c-1)];
	    	}
	    	c--;
	    }
	    
	    
	    
		
	    while (j<10) {
	    	System.out.print("\n"+num2[j]);
			j++;
			
		}
}
}