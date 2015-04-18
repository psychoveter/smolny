import java.io.*;
import java.util.*;
public class Main {
    
	public static void main(String[] args) {
		String aFile = "/Users/777/Desktop/task/aa.txt";
		String bFile = "/Users/777/Desktop/task/b.txt";
		String [] [] num1 = null;
		String [] [] num = null;
		try (BufferedReader br1 = new BufferedReader(new FileReader(new File(bFile)))){
			String line = br1.readLine();
			String [] a = line.split(" ");
			int M = Integer.parseInt(a[0]);
			int N = Integer.parseInt(a[1]);
			num1 = new String [N][M];
			int i = 0;
			int j = 0;
			int k = 0;
			while ((line = br1.readLine()) != null){
				a = line.split(" ");
				for (i = 0,j = 0; i < a.length; i++,j++)
					num1[k][j] = a[i];
				if (k == N -1)
					break;
				k++;
			}

		
		}
		catch (Exception e){};
		System.out.println();
		System.out.println();
	
	
		try (BufferedReader br = new BufferedReader(new FileReader(new File(aFile)))){
		
			
			
			
			String line = br.readLine();
			String [] a = line.split(" ");
			int M = Integer.parseInt(a[0]);
			int N = Integer.parseInt(a[1]);
		    num = new String [N][M];
			int i = 0;
			int j = 0;
			int k = 0;
			while ((line = br.readLine()) != null){
				a = line.split(" ");
				for (i = 0,j = 0; i < a.length; i++,j++)
					num[k][j] = a[i];
				if (k == N - 1)
					break;
				k++;
			}
		}
				
        catch (Exception e){System.out.println(e);}
		
		
		double [][] test =  MatrixMult.toDouble(num);
		double [][] test1 =  MatrixMult.toDouble(num1);
		long start = System.currentTimeMillis( );
        MatrixMult.printMatrix(MatrixMult.mult(test, test1));
        long end = System.currentTimeMillis( );
        long diff = end - start;
        System.out.println("Difference is : " + diff);
		}
	
}
