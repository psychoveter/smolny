public class Array{

	public static void main(String[] args){

		int[] arr = {1,2,3,4,5,6};
		String arrString = arrToString(arr);
		System.out.println("Array #1: " + arrString);

		int a = Array.maximum(arr);
		System.out.println("Maximum: " + a);

		int b = Array.minimum(arr);
		System.out.println("Minimum: " + b);

		int c = Array.medium(arr);
		System.out.println("Medium: " + c);

		int e = Array.summarize(arr);
		System.out.println("Sum of elems: " + e);

		int[] f = Array.swap(arr, 1, 3);
		String arrStringF = arrToString(f);
		System.out.println("Swapping: " + arrStringF);

		int[] d = Array.reverse(arr);
		String arrStringD = arrToString(d);
		System.out.println("Reversed array: " + arrStringD);

		int[] g = copy(arr);
		String arrStringG = arrToString(g);
		System.out.println("A new copy of Array #1: " + arrStringG);

		String arrStringA = arrToString(arr);
		System.out.println("Array #1 once again: " + arrStringA);

		int[] carr = {6,5,4,3,2,1};
		String carrString = arrToString(carr);
		System.out.println("Array #2: " + carrString);

		boolean h = Array.compare(arr, carr);
		System.out.println("Is equal? " + h);

	}

	// Return the biggest elem from the array
	public static int maximum(int[] arr) {

		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) max = arr[i];
		}
		return max;
	}

	// Return the smallest elem from the array
	public static int minimum(int[] arr) {
		
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(min > arr[i]) min = arr[i];
		}
		return min;
	}

	// Return medium ...
	public static int medium(int[] arr) {
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		int md = sum/arr.length;
		return md;	
	}

	// Return the sum of elems
	public static int summarize(int[] arr) {

		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;	
	}

	// Swap two elems
	public static int[] swap(int[] arr, int i, int j) {

		int a = arr[i];
		arr[i] = arr[j];
		arr[j] = a;

		return arr;
	}

	// Return reversed array
	public static int[] reverse(int[] arr) {

		for(int i = 0; i < arr.length/2; i++){
					
			int j = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i -1] = j;
		}
		return arr;
	}

	public static int[] copy(int[] arr){

	        int[] copyArr = new int[arr.length];
	        for(int i = 0; i < arr.length; i++) {
	            copyArr[i] = arr[i];
	        }
	        return copyArr;
    	}

    	public static boolean compare(int[] arr, int[] arr2){
		
		boolean result = true;

		if(arr.length == arr2.length){
			for(int i = 0; i < arr.length; i++){
				if(arr[i] == arr2[i]){
					result = true;
				} else {
					result = false;
				}
			}
		} else {
			result = false;
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
}
