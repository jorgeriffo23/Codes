package ejerciciosrandom;
import java.util.Scanner;
public class pizzarra {

	

	    private static Scanner sc;
		public static void main(String[] args) {
			sc= new Scanner(System.in);
			int cont,cont2=0,c,na=0,cont3=0;
			String alumno [] = new String [10];
			String alumnoexc [] = new String [10];
			float nota[]= new float[10];
			long telefono[]= new long[10];
			float notaexc[]=new float[10];
			
			//ingreso datos al arreglo
			System.out.println("Ingrese numero de alumnos");
			na = sc.nextInt();
			
			for(int i=0; i<na; i++) {
				System.out.println("Ingrese nombre del alumno");
				alumno [i] = sc.next();
				System.out.println("Ingrese nota del alumno");
				nota[i] = sc.nextFloat();
				System.out.println("Ingrese telefono del alumno");
				telefono[i] = sc.nextLong();
			}
			/*for(int j=0;j<10; j++) {
				if ((nota[j]>=5.5) && (nota [j]<=7.0)) {
					System.out.println("Aprueba Excelente");
				}
				if ((nota[j]>=4.0) && (nota [j]<=5.4)) {	
						System.out.println("Aprueba por poco");
				}
				if ((nota[j]>1.0) && (nota [j]<=3.9)) {	
					System.out.println("Reprueba");
				}
			}*/
			for(int z=0; z<na; z++) {
				if ((nota[z]>1.0) && (nota [z]<=3.9)) {	
					System.out.println(alumno[z]+"\nReprueba, llamar al numero "+telefono[z]);
				}
				else if ((nota[z]>=5.5) && (nota [z]<=7.0)) {
					System.out.println(alumno[z]+"\nAprueba Excelente, felicitaciones.");
				}
				else { System.out.println(alumno[z]+"Aprueba por poco pongale más gueno");
				}
			}
			cont = 0;
			for(int p=0; p<na; p++) {
				if ((nota[p]>=5.5) && (nota [p]<=7.0)) {
					cont2++;	
					notaexc[cont]=nota[p];
					alumnoexc [cont]=alumno[p];
					
				}
			}
			for(int ne=0; ne<cont2; ne++) {
				for(int ne2=0; ne2<cont; ne2++) {
					cont3++;
					c=cont3;
					if (notaexc[cont3]>notaexc[ne2]) {
						
						 while(cont>cont3) {
							 notaexc[cont2]=notaexc[cont2-1];
						    	cont--;
						    }
						    
						 notaexc[cont3]=notaexc[ne];
						
					}
				}
			}
			for(int m=0; m<cont; m++) {
				System.out.println(alumno[m]+"\nAprueba Excelente con nota: "+notaexc[m]);
			}
			
		}
	}

