
public class Vector {
	
		public static int[] mult(int[] A, int x){
	
				for(int i = 0; i < A.length; i++){
					A[i] *= x;
				}
				return A;
			}
		public static int[] add(int[] A, int[] B){
			
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

		public static String arrToString(int[] arr) {
			String str = "[";
			for (int i = 0; i < arr.length; i++)
				str += arr[i] + ",";
				str += "]";
				return str; 
		}
		
		public static void main(String[] args){

			int[] vector1 = {1,4,3,2};
			int[] vector2 = {1,7,1,6};
			
			
			int scalar = 4;

				

			int[] vector4 = Vector.mult(vector1, scalar);
			String resultMultA = arrToString(vector4);
			System.out.println(resultMultA);

			int[] vector3 = Vector.add(vector1, vector2);
			String resultSum = arrToString(vector3);
			System.out.println(resultSum);
		}
	}