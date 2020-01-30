package boletin5;

public class ejercicio3 {

	
	public static void main(String[]arg){

			
			int [][] A = new int[3][3];
			int [][] B = new int[3][3];
			int [][] C = new int[3][3];
			int i=0,j=0;
			
			for(i=0;i<3;i++) {
				for(j=0;j<3;j++) {
					
					A[i][j]=(int)(Math.random()*10);
					B[i][j]=(int)(Math.random()*10);
				}
				
			}
			
			System.out.print("\nMatriz 1:\n");
			for(i=0;i<3;i++) {
				for(j=0;j<3;j++) {
					System.out.print(" "+A[i][j]+" | ");
				}
				System.out.print("\n--------------------\n");
			}
			System.out.print("\nMatriz 2:\n");
			for(i=0;i<3;i++) {
				for(j=0;j<3;j++) {
					System.out.print(" "+B[i][j]+" | ");
				}
				System.out.print("\n--------------------\n");
			}
			
			for(i=0;i<3;i++) {
				for(j=0;j<3;j++) {
				C[i][j]=A[i][j]+B[i][j];
				}
				}
			
			System.out.print("\nLa suma de ambas matrices es :\n");
			
			for(i=0;i<3;i++) {
				for(j=0;j<3;j++) {
					System.out.print(" "+C[i][j]+" | ");
				}
				System.out.print("\n--------------------\n");
			}
			
	}
}