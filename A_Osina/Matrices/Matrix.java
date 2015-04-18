public class Matrix {
	public static void main(String[] args){

		int[][] A = {{1,2},{4,5}};
		int[][] B = {{1,2},{3,4}};
		String a = arrsToString(A);
		System.out.println("This is matrix #1:" + "\n" + a);
		String b = arrsToString(B);
		System.out.println("This is matrix #2:" + "\n" + b);

		int[][] C = Matrix.matricesSum(A, B);
		String resultSum = arrsToString(C);
		System.out.println("This is matrices sum:" + "\n" + resultSum);	

		int[][] D = Matrix.matricesMultiplication(A, B);
		String resultMultiply = arrsToString(D);
		System.out.println("This is matrices multiplication:" + "\n" + resultMultiply);

		int[] Vec = {2,3};
		String resultVec = arrToString(Vec);
		System.out.println("This is vector:" + "\n" + resultVec);

		int[][] MnV = Matrix.matrixVecMultiply(A, Vec);
		String resultMnV = arrsToString(MnV);
		System.out.println("This is matrix-n-vector multiplication" + "\n" + resultMnV); 

	}

	public static int[][] matricesSum(int[][] A, int[][] B){

		int[][] result = new int[A.length][A[0].length];

		if(A.length == B.length && A[0].length == B[0].length){
				int[][] C = new int[A.length][A[0].length];
				for(int i = 0; i < A.length; i++){
					for(int j = 0; j < A[0].length; j++){
						C[i][j] = A[i][j] + B[i][j];
					}
				} 
				result = C;			
			} else {
				result = null;
			}
			return result;
	}

	public static int[][] matricesMultiplication(int[][] A, int[][] B){

		int[][] result = new int[A.length][B[0].length];

		if(A[0].length == B.length){
			int[][] C = new int[A.length][B[0].length];
			for(int i = 0; i < C.length; i++){
				for(int j = 0; j < C[0].length; j++){
					for(int x = 0; x < A[0].length; x++){
						C[i][j] += (A[i][x] * B[x][j]);
					}
				}
			}
			result = C;

		} else {
			result = null;
		}
		return result;
	}

	public static int[][] matrixVecMultiply(int[][] A, int[] V){

		// for row vector
		if(A.length == V.length){
			int[][] Vone = new int[1][V.length];
			for(int i = 0; i < Vone.length; i++){
				for(int j = 0; j < Vone[0].length; j++){
					Vone[i][j] = V[j];
				}
		}
	
		int[][] C = new int[Vone.length][A[0].length];
		for(int i = 0; i < C.length; i++){
			for(int j = 0; j < C[0].length; j++){
				for(int x = 0; x < Vone[0].length; x++){
					C[i][j] += (Vone[i][x] * A[x][j]);
				}
			}
		}

		return C;
		
		}
		// for column vector
		else if(A[0].length == V.length){
			int[][] Vtwo = new int[V.length][1];
			for(int i = 0; i < Vtwo.length; i++){
				for(int j = 0; j < Vtwo[0].length; j++){
					Vtwo[i][j] = V[i];
				}
			}
			
			int[][] D = new int[A.length][Vtwo[0].length];
			for(int i = 0; i < D.length; i++){
				for(int j = 0; j < D[0].length; j++){
					for(int x = 0; x < A[0].length; x++){
						D[i][j] += (A[i][x] * Vtwo[x][j]);
					}
				}
			}

		return D;
	
		} else { 
			//When wrong matrices dimensions appear
			return null;
		}
	}	

	public static String arrsToString(int[][] arr) {
	String str = "[";
		for (int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++)
				str += arr[i][j] + ",";
				str += "]" + "\n" + "[";
				continue;
			}
		return str;
	}

	public static String arrToString(int[] arr) {
	String str = "[";
	for (int i = 0; i < arr.length; i++)
		str += arr[i] + ",";
		str += "]";
		return str; 
	}
}
