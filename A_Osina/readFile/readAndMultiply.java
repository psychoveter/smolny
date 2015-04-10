import java.io.BufferedReader;
import java.io.FileReader;

public class readAndMultiply{
	public static void main(String[] args){

	 	String aFile ="/home/grib/Desktop/a.txt";
		String bFile ="/home/grib/Desktop/b.txt";

		int[][] one = readMatrix(aFile);
		int[][] two = readMatrix(bFile);
		int[][] three = multiply(one, two);		

		//String result = arrsToString(one);
		//System.out.println(result);
		//String wresult = arrsToString(two);
		//System.out.println(wresult);
		String resultF = arrsToString(three);
		System.out.println(resultF);
	}

	public static int[][] readMatrix(String h){

		int r = 0;
		int c = 0;
		int[][] readingResult = new int[r][c];


		try (BufferedReader br = new BufferedReader(new FileReader(h))){

	 		 String a = null;
	 		 String[] dim = new String[1];
	 		 
	 		 while((a = br.readLine()) != null){
				dim = a.split(" ");
	 		    break; 
	 		 }
	 		 String dimResult = StringDimension(dim);
	 		 Integer dimension = Integer.parseInt(dimResult);
	 		 
	 		 int row = dimension % 10;
	 		 r += row;
	 		 int col = (dimension - row) / 10;
	 		 c += col;
	 		
	 		 int[][] matrixOne = new int[row][col];
	 		 
	 		 String b = null;

	 		 int[] matrixRows = new int[row];
	 		 int counter = 0;
	 		 
	 		 while((b = br.readLine()) != null){
	 		 	
	 		 	String[] matrixElems = b.split(" ");
	 		 	String xxx = StringMatrix(matrixElems);
	 		 	int x = Integer.parseInt(xxx);
			 		matrixRows[counter] = x;
			 		counter++;
		   }
	 	
	 		 int[] matrixColumns = new int[col];
	 		 int[][] matrix =  new int[row][col];
	 		
	 		 int counti = 0;
	 		 int countj = col-1;
	 		 
			 for(int k = 0; k < matrixRows.length; k++){
	 		 			
	 			for(int l = col-1; l >= 0; l--){
	 					
	 				matrixColumns[l] = matrixRows[k] % 10;
	 				matrixRows[k] /= 10;

			 			matrix[counti][countj] = matrixColumns[l];
			 			
			 			if(countj == 0){
			 				countj = col-1;
			 			} else {
			 				countj--;
			 			}
	 			}
	 			
	 			if(counti == row-1){
	 				counti = 0;
	 			} else {
	 				counti++;
	 			}
	 		 }
	 		 readingResult = matrix;
	 		 
	 	} catch (Exception e){
	 			System.out.println(e);
	 	}
	 	return readingResult;
	}

	public static int[][] multiply(int[][] A, int[][] B){
			
		try {
			if(A[0].length == B.length){
			int[][] C = new int[A.length][B[0].length];
			for(int i = 0; i < C.length; i++){
				for(int j = 0; j < C[0].length; j++){
					for(int x = 0; x < A[0].length; x++){
						C[i][j] += (A[i][x] * B[x][j]);
					}
				}
			}
			return C;
			}

		} catch (NumberFormatException ex){
		  System.out.println(ex);
		}
    		return null;
	}

	public static String StringDimension(String[] arr) {
                String str = "";
                for (int i = 0; i < 2; i++)
                    str += arr[i];
                    return str;
    	}

  	public static String StringMatrix(String[] arr) {
              String str = "";
              for (int i = 0; i < arr.length; i++){
              	str += arr[i];
              }
	      return str;                    
  	}

  	public static String arrToString(int[][] arr) {
  		String str = "[";
  		for (int i = 0; i < arr.length; i++){
  			for(int j = 0; j < arr[i].length; j++)
  				
  				str += arr[i][j] + ",";
  				str += "]" + "\n" + "[";
  				continue;
  			}
  			return str;
	}

	public static String arrToStringInt(int[] arr) {
		String str = "[";
		for (int i = 0; i < arr.length; i++)
			str += arr[i] + ",";
			str += "]";
			return str; 
	}

	public static String arrsToString(int[][] arr) {
		String str = "[";
		for (int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++)
				str += arr[i][j] + ",";
				str += "]" + "\n" + "[";
				
			}
		return str;
	}
}
