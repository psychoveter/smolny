import java.util.*;
public class MatrixMult {
 
	static double [][] mult(double [][] arr, double [][] arr1){
	 double	C [][] = new double [arr.length][arr[0].length]; 
	
		for (int i = 0; i < arr.length; i ++){
			for (int j = 0; j < arr[0].length; j ++){
				for (int k = 0; k < arr[0].length; k ++){
					C [i][j] += arr[i][k] * arr1 [k][j]; 
				}
			}
			
		}
		return C;
	}
	static double [][] toDouble(String [][] arr){
		
		
	
		double [][] arr1 = new double [arr.length][arr[0].length];
		
		for (int i = 0; i < arr.length; i ++){
			
			for (int j = 0; j < arr[0].length; j ++){
				
			arr1[i][j] = Double.parseDouble(arr[i][j]);
			}
	}
		
		return arr1;
}
	static void printMatrix(double [][]arr){
		for (int i = 0; i < arr.length; i ++){
			for (int j = 0; j < arr[j].length; j ++){
				System.out.print(arr[i][j] + " ");
				
			}
			System.out.println();
		}
	}
		static void printMatr(String [][]arr){
			for (int i = 0; i < arr.length; i ++){
				for (int j = 0; j < arr[j].length; j ++){
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
}
}
}
