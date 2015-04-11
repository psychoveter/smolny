public class BubbleSort {
	public static void main(String[] args){

		int[] s = {1,2,5,7,4,3,8};
		bubble(s);

		String arrString = arrToString(s);
    System.out.println(arrString);

    }

    public static String arrToString(int[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length; i++)
            str += arr[i] + ",";
        str += "]";
        return str;
    }

    public static int[] bubble(int[] arr){
    	int len = arr.length;
    	while(len > 1){
    		for(int i = 0; i < arr.length-1; i++){
       			int j = i + 1;
         		if(arr[i] > arr[j]){
         			
         			int t = arr[i];
    			arr[i] = arr[j];
    			arr[j] = t;
    		
      		}
      		}
      		len -= 1; 
   		}
   		return arr;
    }
}
