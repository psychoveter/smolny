public class Bubble {
	public static void main (String [] args){
   


    int a [] = {3,5,1,56,4,123,2,34};
    for (int i = 0; i < a.length; i++)
	{
        for (int j = a.length - 1; j > i; j--)
        {
            if (a[j] < a[j - 1])
            {
                int temp = a[j];
		a[j]= a[j-1];
		a[j-1] = temp;
            }
        }
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
