public class InsertSort{
	public static void main (String [] args){
   


    int a [] = {3,5,1,56,4};
    for (int i = 0; i < a.length; i++)
	
	{
		int temp = a[i];
		int j = i - 1;
		while (j >= 0 && a[j] > temp)

			{ 
				a[j+1]=a[j];
				j--;
			}
		a[j+1]=temp;
	}

  String arrString = arrToString(a);
  System.out.println(arrString);
}

public static String arrToString(int[] arr){
	String str = "[";
	for (int i = 0; i<arr.length; i++)
            str = str + arr[i]+ ",";
	str += "]";
	return str;
}

}
