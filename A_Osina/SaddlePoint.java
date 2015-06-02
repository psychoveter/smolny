public class SaddlePoint {
	
	public static void main(String[] args) {

		int[][] A = {{1, 3, -1},{5, 4, -2}};

		int[] rowResult = new int[A.length];
		int counterOne = 0;
		while(counterOne < A.length){
			int a = minimum(A[counterOne]);
			rowResult[counterOne] = a;
			counterOne++;			
		}

		int x = maximum(rowResult);

		int[][] transA = transpo(A);

		int[] columnResult = new int[transA.length];
		int counter = 0;
		while(counter < transA.length){
			int b = maximum(transA[counter]);
			columnResult[counter] = b;
			counter++;			
		}

		int y = minimum(columnResult);

		boolean sd = saddlePoint(x,y);
		if(sd){
			System.out.println("Saddle point: " + x);
		} else {
			System.out.println("Saddle point is not found");
		}
	}

	public static boolean saddlePoint(int a, int b){
		if(a == b){
			return true;
		} else {
			return false;
		}
	}
		
	public static String arrToString(int[] arr) {
		String str = "[";
		for (int i = 0; i < arr.length; i++)
			str += arr[i] + ",";
			str += "]";
			return str; 
	}

	public static int minimum(int[] arr) {
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(min > arr[i]) min = arr[i];
		}
		return min;
	}

	public static int maximum(int[] arr) {
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) max = arr[i];
		}
		return max;
	}

	public static int[][] transpo(int[][] arr) {
		int[][] temp = new int[arr[0].length][arr.length]; 
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[0].length; j++){
				temp[j][i] = arr[i][j];
			}
		}  
		return temp;
	}
}
