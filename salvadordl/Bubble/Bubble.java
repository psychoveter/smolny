public class Bubble {

	public static void bubble(int array[]) {
		int n = array.length;
		int k;
		for (int m = n; m >= 0; m--) {
			for (int i = 0; i < n - 1; i++) {
				k = i + 1;
				if (array[i] > array[k]) {
					swapValues(i, k, array);
				}
			}
			printValue(array);
		}
	}
  
	private static void swapValues(int i, int j, int[] array) {
    	
		int temp;
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
  
	private static void printValue(int[] test) {
          
		for (int i = 0; i < test.length; i++) {
			System.out.print(test[i] + ", ");
		}
		System.out.println("\n");
	}
  
	public static void main(String[] args) {
		int[] test = {10, 4, 3, 8, 16, 58, 11};
		bubble(test);
	}
}
