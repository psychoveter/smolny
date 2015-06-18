package arrayUtils;

public class Array {
	
	
	public static int maximum(int[] arr) {

		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) max = arr[i];
		}
		return max;
	}

		public static int minimum(int[] arr) {
		
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(min > arr[i]) min = arr[i];
		}
		return min;
	}

	
	public static int medium(int[] arr) {
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		int md = sum/arr.length;
		return md;	
	}

	
	public static int summ(int[] arr) {

		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;	
	}

	
	public static int[] swap(int[] arr, int i, int j) {

		int a = arr[i];
		arr[i] = arr[j];
		arr[j] = a;

		return arr;
	}

	
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
	
	public static void main(String[] args){

		int[] arr = {23,34,12,56,34};
		
		
		String arrString = arrToString(arr);
		System.out.println(arrString);

		int arr1 = Array.maximum(arr);
		System.out.println(arr1);
		
		int arr3 = Array.medium(arr);
		System.out.println(arr3);

		int arr2 = Array.minimum(arr);
		System.out.println(arr2);

		int arr4 = Array.summ(arr);
		System.out.println(arr4);

		int[] arr6 = Array.reverse(arr);
		String arr6String = arrToString(arr6);
		System.out.println(arr6String);
		
		int[] arr5 = Array.swap(arr, 1, 3);
		String arr5String = arrToString(arr5);
		System.out.println(arr5String);
		
		int[] carr = {13,23,34,56,67};
		boolean arr8 = Array.compare(arr, carr);
		System.out.println(arr8);
		
		int[] arr7 = copy(arr);
		String arr7String = arrToString(arr7);
		System.out.println(arr7String);
	}

}

