package ir.isc.training;

public class Matrix {

	public static void main(String[] args) {
		int n=7;
		int m=8;
		matrix1(n);   
		System.out.println("the second version for creating matrix");
		matrix2(m);  
	}
	public static void matrix1(int n) {
		for (int row = 0; row < n ; row++) {
			for (int colum = 0; colum < n ; colum++) {
				
				System.out.print((int)(Math.random() * 2));
				
			}
			System.out.println();
		}
	}
	public static void matrix2(int m) {
		int [][] matrix=new int[6][6];
		for (int row = 0; row < matrix.length; row++) {
			for (int coullumn = 0; coullumn < matrix.length; coullumn++) {
				matrix[row][coullumn]=(int)(Math.random() * 2);
			}
			
		}
		for (int[] row:matrix) {
			for(int num:row) {
				System.out.print(num);
			}
			System.out.println();
			
		}
	}
	
}