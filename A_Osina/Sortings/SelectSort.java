public class SelectSort {
	
	public static void main(String[] args){
		int[] s = {1,2,27,4,33,9,18};
		select(s);

		String arrString = arrToString(s);
		System.out.println(arrString);
	}

	public static void select(int[] arr){
		int max;

		for(int i = 0; i < arr.length; i++){
			max = i;

			for(int j = i + 1; j < arr.length; j++){
				if(arr[j] > arr[max]){
					max = j;
				}
			
			int t = arr[max];
			arr[max] = arr[j];
			arr[j] = t;	

			}
		}
	}

	public static String arrToString(int[] arr) {
	String str = "[";
	for (int i = 0; i < arr.length; i++)
		str += arr[i] + ",";
		str += "]";
		return str; 
	}
}
