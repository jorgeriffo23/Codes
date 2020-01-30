package boletin4;

import java.util.Scanner;

public class ejercicio16 {
	

    private static Scanner sc;
	public static void main(String[]arg){
		sc = new Scanner(System.in);
		
		String [] nombre = new String[5];
		int [] ptri = new int[5];
		int [] stri = new int[5];
		int [] ttri = new int[5];
		double s1=0,s2=0,s3=0,mpt,mst,mtt,prom;
		
		int i1=0,n;
		
		for(i1=0;i1<5;i1++) {
			System.out.print("\nIngresar nombre del alumno: ");
			nombre[i1]=sc.next();
			System.out.print("\nIngresar nota primer trimestre del alumno: ");
			ptri[i1]=sc.nextInt();
			System.out.print("\nIngresar nota segundo trimestre del alumno: ");
			stri[i1]=sc.nextInt();
			System.out.print("\nIngresar nota tercer trimestre del alumno: ");
			ttri[i1]=sc.nextInt();
		}
		 for(i1=0;i1<5;i1++) {
			    System.out.print("\n"+(i1+1)+". Nombre del alumno: "+nombre[i1]);
			    System.out.print("\nNota primer trimestre del alumno: "+ptri[i1]);
		        System.out.print("\nNota segundo trimestre del alumno: "+stri[i1]);
				System.out.print("\nNota tercer trimestre del alumno: "+ttri[i1]);
				System.out.print("\n---------------------------------------------------------------------");
		        }
			    
		
		//Calculo de media primer trimestre//
	    for(i1=0;i1<5;i1++) {
	    	s1=s1+ptri[i1];
	    	s2=s2+stri[i1];
	    	s3=s3+ttri[i1];
	    }
	    
	    mpt= s1/5;
	    mst= s2/5;
	    mtt= s3/5;
	    
	    System.out.print("\nMedia primer trimestre del curso: "+mpt);
        System.out.print("\nMedia segundo trimestre del curso: "+mst);
		System.out.print("\nMedia tercer trimestre del curso: "+mtt);
		System.out.print("\n---------------------------------------------------------------------");
	   
	    System.out.print("\nIngresar numero de lista de un alumno: ");
	    n=sc.nextInt();
	    
	    prom=(ptri[n-1]+stri[n-1]+ttri[n-1])/3;
	    System.out.print("\nEl promedio del alumno "+nombre[n-1]+" es: "+prom);
}    
}