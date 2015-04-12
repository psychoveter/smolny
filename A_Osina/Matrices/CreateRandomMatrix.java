public class CreateRandomMatrix {
	
	public static void main(String[] args) {

		int[][] A = new int[5][5];
		for(int i = 0; i < A.length; i++) {
			for(int j = 0; j < A[i].length; j++) {
				A[i][j] = (int) (Math.random()*21)-10;
			}
		}
		
		String result = arrToString(A);
		System.out.print(result);
	}

	public static String arrToString(int[][] arr) {
	String str = "[";
		for (int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++)
				
				str += arr[i][j] + ",";
				str += "]" + "\n" + "[";
				continue;
			}
		return str;
	}
}
