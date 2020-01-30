package boletin5;
import java.util.Scanner;
public class ejercicio2 {

	private static Scanner sc;
	public static void main(String[]arg){
		sc = new Scanner(System.in);
			
			int [][] fmc = new int[4][4];
			int suma=0,i=0,j=0;
			
			for(i=0;i<4;i++) {
				for(j=0;j<4;j++) {
					System.out.print("Ingrese un valor para la casilla ("+i+","+j+")");
					fmc[i][j]=sc.nextInt();
				}
				
			}
			
			for(i=0;i<4;i++) {
				for(j=0;j<4;j++) {
					System.out.print(" "+fmc[i][j]+" | ");
				}
				System.out.print("\n--------------------\n");
			}
			
			for(i=0;i<4;i++) {
				for(j=0;j<4;j++) {
				if(fmc[i][j]==fmc[j][i]) {
					suma++;
				}
				}
			}
			if(suma==(i*j)) {
				System.out.print("\nLa matriz es simetrica.");
			}
			else {
				System.out.print("\nLa matriz no es simetrica.");
			}
}
}