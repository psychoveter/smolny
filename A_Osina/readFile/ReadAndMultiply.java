// I hope I haven't crashed anything while I've been commenting.
import java.io.BufferedReader;
import java.io.FileReader;

public class ReadAndMultiply{
	public static void main(String[] args){
		String aFile ="/home/grim/Desktop/a.txt"; //need to be changed to the address of your file;
		String bFile ="/home/grim/Desktop/b.txt"; //need to be changed to the address of your file;

		int[][] one = readMatrix(aFile);
		int[][] two = readMatrix(bFile);
		int[][] three = multiply(one, two);		

		String result = arrsToString(three);
		System.out.println(result);
	}

	public static int[][] readMatrix(String h){

		int r = 0;
		int c = 0;
		int[][] readingResult = new int[r][c];

		try (BufferedReader br = new BufferedReader(new FileReader(h))){
			//Firstly, I need to read the first line to know (and build it) the matrix dimention
	 		 String a = null;
	 		 String[] dim = new String[1];
	 		 
	 		 while((a = br.readLine()) != null){
				dim = a.split(" ");
	 		    break; 
	 		 }
	 		 //StringDimention method converts only the first line from the file into String without spaces
	 		 String dimResult = StringDimension(dim);
	 		 
	 		 //In next line I get dimention (number of rows & columns) of matrix but it is unit (Ex. 23 will mean 2 columns and 3 rows)  
	 		 Integer dimension = Integer.parseInt(dimResult);
	 		 
	 		 //Then I separate dimResult into rows and columns through mod(str.37) and sth else(39).
	 		 int row = dimension % 10;
	 		 
	 		 //I need r & c (I init it earlier(str.19-20)) because I want to return int[][] as a result of this...and I have not found better idea
	 		 r += row;
	 		 int col = (dimension - row) / 10;
	 		 c += col;

			 	 		 
	 		 String b = null;
	 		 // Firstly, I create an array int[] and write down the rows of the matrix (but it is also unit and I will separate it later)
	 		 int[] matrixRows = new int[row];
	 		 int counter = 0;
	 		 
	 		 while((b = br.readLine()) != null){
	 		 	
	 		 	String[] matrixElems = b.split(" ");
	 		 	String xxx = StringMatrix(matrixElems);
	 		 	int x = Integer.parseInt(xxx);
			 		matrixRows[counter] = x;
			 		counter++;
		   }
	 		 // Create new array int[] for columns
	 		 int[] matrixColumns = new int[col];
	 		 
	 		 // The final matrix:
	 		 int[][] matrix =  new int[row][col];
	 		
	 		 // From the next line to the line 92 I separate elems from matrixRows (which are united rows) and write it down to the final matrix
	 		 // and I start to write final elems (to the final matrix) from the right up coner =) because here I also use mod to get digits from matrixRows elems =)
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
