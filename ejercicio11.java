package boletin4;

import java.util.Scanner;

public class ejercicio11 {
	

    private static Scanner sc;
	public static void main(String[]arg){
		sc = new Scanner(System.in);
		int [] num = new int[10];
		int [] num2 = new int[10];
		
		int i=0,j=0,c=9;
		System.out.print("\nIngresar 5 numeros");
		
		while (i<5) {
			num[i]=sc.nextInt();
			
			while(j<10) {
				if(num[i]>=num2[j]) {
					
					 while(c>j) {
					    	num2[c]=num[c-1];
					    	c--;
					    }
					 num2[j]=num[i];
					
				}
				else {
					num2[j]=num[i];
				}
				c=9;
				j++;
			
				
			}
			j=0;
			i++;
		}
		
	    
		
	    while (j<10) {
	    	System.out.print("\n"+num2[j]);
			j++;
			
		}
}
}