import java.util.Arrays;

public class QS
{
	public static void main (String [] args)
	{

	int s[] = {8,5,7,1};
	int l = 0;
	int r = s.length - 1;

        QSort(s, l, r);


	String arrString = arrToString(s);
        System.out.println(arrString);

	}

	public static int Partition (int[] arr,int l,int r)
	 {

		int j = l;
		for (int i=l; i<arr.length; i++)

			if (arr[i]<=arr[r])
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}

			else
			{
			int temp = arr[j];
			arr[j] = arr[r];
			arr[r] = temp;
			}
		return j;


	}

	public static void QSort (int [] arr, int l,int r)
	{
		if (l < r)
		{
			int j = Partition(arr,l,r);
			QSort(arr,l,j - 1);
			QSort(arr, j + 1, r);
		}

	}

	public static String arrToString(int[] arr)
	{
		String str = "[";
		for (int i = 0; i<arr.length; i++)
		    str = str + arr[i]+ ", ";
		str += "]";
		return str;
	}

}
