// Если элемент содержится в массиве -- возвращает индекс этого элемента, иначе возвращает -(индекс+1)-1
public class BinaryALotLikeSort {
	
	public static void main(String[] args)	{

		int[] s = {1,3,6,9,15,19,27};
		int result = biSearch(s, 10, 0, 6);
		System.out.println(result);
	}

	public static int biSearch(int[] arr, int key, int first, int last){

		for(int i = 0; i < arr.length; i++){
			if(key == arr[i]){
				while(last >= first) {
					int middle = (first + last) / 2; 
					if(arr[middle] == key){
						return middle;
					} else if(arr[middle] < key) {
						first = middle + 1;
					} else {
						last = middle - 1;
					}
				}
			} else {
				for(i = 0; i < arr.length-1; i++){
					if(key > arr[i] && key < arr[i+1]){
						return -(i+1)-1;	
					}
				}
			}
		}
		
		return 0;
	}
}
