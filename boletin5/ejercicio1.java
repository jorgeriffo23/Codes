package boletin5;

public class ejercicio1 {

	   
		public static void main(String[]arg){
		
			
			int [][] fmc = new int[5][5];
			
			for(int i=0;i<5;i++) {
				for(int j=0;j<5;j++) {
					fmc[i][j]=i+j;
				}
				
			}
			
			for(int i=0;i<5;i++) {
				for(int j=0;j<5;j++) {
					System.out.print(" "+fmc[i][j]+" | ");
				}
				System.out.print("\n------------------------\n");
			}
}
}