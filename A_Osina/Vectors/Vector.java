public class Vector{
	
	public static void main(String[] args){

		int[] A = {1,2,3,1};
		int[] B = {1,1,1,1};
		int sca = 10;

		int[] D = Vector.addition(A, B);
		String resultSum = arrToString(D);
		System.out.println("Addition(A,B): " + resultSum);	

		int[] E = Vector.substraction(A, B);
		String resultSub = arrToString(E);
		System.out.println("Substraction(A,B): " + resultSub);	

		int[] F = Vector.multiply(A, sca);
		String resultMultiplyA = arrToString(F);
		System.out.println("Multiplication(A, sca): " + resultMultiplyA);

		int[] H = Vector.multiply(B, sca);
		String resultMultiplyB = arrToString(H);
		System.out.println("Multiplication(B, sca): " + resultMultiplyB);

	}
	
	// Сложение двух векторов
	public static int[] addition(int[] A, int[] B){
		
		int[] result = new int[A.length];

		if(A.length == B.length){
			int[] C = new int[A.length];
			for(int i = 0; i < A.length; i++){
			C[i] = A[i] + B[i];
			}
	    result = C;
		} else {
			result = null;
		}	
		return result;
	} 

	// Вычитание для двух векторов
	public static int[] substraction(int[] A, int[] B){

		int[] result = new int[A.length];

		if(A.length == B.length){
			int[] C = new int[A.length];
			for(int i = 0; i < A.length; i++){
			C[i] = A[i] - B[i];
			}
	    result = C;
		} else {
			result = null;
		}	
		return result;
	}

	// Умножение вектора на скаляр
	public static int[] multiply(int[] A, int x){

		for(int i = 0; i < A.length; i++){
			A[i] *= x;
			}
			return A;
	}

	// Делает из массива строку
	public static String arrToString(int[] arr) {
	String str = "[";
	for (int i = 0; i < arr.length; i++)
		str += arr[i] + ",";
		str += "]";
		return str; 
	}
}
