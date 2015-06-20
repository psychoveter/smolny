class DecBin {
	 
public void convertBinary(int num) {
   int binary[] = new int[40];
   int index = 0;
   while(num > 0){
     binary[index++] = num%2;
     num = num/2;
   }
   for(int i = index-1;i >= 0;i--){
     System.out.print(binary[i]);
   }
}

public class integrating {
    double f(double x) {
        return Math.exp(- x * x / 2) / Math.sqrt(2 * Math.PI);
    }
    double integrate(double a, double b, int N) {
        double h = (b - a) / N;
        double sum = 0.5 * (f(a) + f(b));
        for (int i = 1; i < N; i++) {
            double x = a + h * i;
            sum = sum + f(x);
        }

        return sum * h;
    }
	public void main(String[] args) {
	    double a = Double.parseDouble(args[0]);
	    double b = Double.parseDouble(args[1]);
	    System.out.println(integrate(a, b, 1000));
	    }
	}


	public static void compare(int [] arr, int [] arr2) {
		if (arr.length != arr.length){
			System.out.println("These arrays are not equal.");
		}
		else {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == arr2[i]){
				System.out.println("These arrays are equal.");
				}
			}
		}
	}

	

	public static  void swap(int[] arr) {
		int s = arr.length;
		int p = arr[0];
		arr[0] = arr[s - 1];
		int N;
		arr[N - 1]= p;
		for (int i = 0; i < N; i ++) {
			System.out.print(arr[i]);
		}
	}
	
	public static int max(int [] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];	
		}
		return max;
	}
	
	public static int min (int [] arr) {
	   	int min = arr[0];
	   	for (int i = 0; i < arr.length; i++) {
	   		if (arr[i] < min){
	   			min = arr[i];
	   		}
	    		
	   	}
		return min;
	}
}
