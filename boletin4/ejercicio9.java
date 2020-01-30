package boletin4;

import java.util.Scanner;

public class ejercicio9 {
	

    private static Scanner sc;
	public static void main(String[]arg){
		sc = new Scanner(System.in);
		int [] num = new int[10];
		int [] num2 = new int[10];
		
		int i=0,j=0,c=9;
		System.out.print("\nIngresar 10 numeros");
		
		while (i<10) {
			num[i]=sc.nextInt();
			i++;
			
		}
		
	    while(c>=0) {
	    	
	    	if(c>0) {
	    		num2[c]=num[c-1];
	     }
	    	else if(c<=0) {
	    		num2[c]=num[9];
	    	}
	    	c--;
	    }
	    
	    
	    
		
	    while (j<10) {
	    	System.out.print("\n"+num2[j]);
			j++;
			
		}
}
}