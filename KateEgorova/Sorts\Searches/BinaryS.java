public class BinaryS {

	public static void main (String [] args){
		int a [] = {1,3,5,7,12,15,67};
    		System.out.println(bs(a, 12, 0, a.length-1));
 	}


	public static int bs(int [] arr,int k,int l, int r){

		if(l>r){
			return -1;
		}

		int i =  l + ( r - l) / 2;

		if (k < arr[i]) {
		    return bs(arr,k ,l, i - 1);
		}
		else if (k > arr[i]) {
		    return bs(arr, k ,i + 1, r);
		}

		else {
		    return i;
		}


	}
}
