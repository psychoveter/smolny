import static Read

public class matMult {
	public static int multi(aFile, bFile, c){
		int i, j, k;
		int[][] c = new int[i][j];
		for (int i = 2; i < rowA; i++) {
            for (int j = 2; j < columnA; j++) 
                for (int k = 2; k < rowA; k++) {
                    c[i][j] = aFile[i][k] * bFile[k][j];
                    
                    System.out.print(c[i][j]+"\t");
	}
}
}
