package boletin5;

public class ejercicio5 {

	
	public static void main(String[]arg){

			
			int [][] A = new int[7][7];
			

			int i=0,j=0;
			
			for(i=0;i<7;i++) {
				for(j=0;j<7;j++) {
					if(i==j) {
					A[i][j]=1;	
					}
					else {
					A[i][j]=0;	
					}
				}
				
			}
			
			System.out.print("\nMatriz 1:\n");
			for(i=0;i<7;i++) {
				for(j=0;j<7;j++) {
					System.out.print(" "+A[i][j]+" | ");
				}
				System.out.print("\n----------------------------------\n");
			}
			}
}