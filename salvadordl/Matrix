public class Matrix {
	public static void main(String[] args) {
		int[][] matrixA;
		matrixA = new int[2][3];
		matrixA[0][0] = 1;
		matrixA[0][1] = 2;
		matrixA[0][2] = 3;
		matrixA[1][0] = 4;
		matrixA[1][1] = 5;
		matrixA[1][2] = 6;
		for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 3; j++) {
            	        System.out.print(matrixA[i][j] + "\t");
                    }
                    System.out.println();
		}
	}


	public void matrixAdd(int [][] matrixA, int [][] matrixB){
		for (int i=0;i<matrixA.length;i++){
			for (int j=0;j<matrixA[0].length;j++)
				matrixA[i][j]=matrixA[i][j]+matrixB[i][j]; 
		}
		return;
	}
	public void matrixSub(int [][] matrixA, int [][] matrixB){
		for (int i=0;i<matrixA.length;i++){
			for (int j=0;j<matrixA[0].length;j++)
				matrixA[i][j]=matrixA[i][j]-matrixB[i][j]; 
		}
		return;
	}
	public void matrixMult(int [][] matrixA, int [][] matrixB){
		for (int i=0;i<matrixA.length;i++){
			for (int j=0;j<matrixA[0].length;j++)
				matrixA[i][j]=matrixA[i][j]*matrixB[i][j]; 
		}
		return;
	}
	public void matrixMultVec(int [][] matrixA, int [] vectorB){
		for (int i=0;i<matrixA.length;i++){
			for (int j=0;j<matrixA[0].length;j++)
				matrixA[i][j]=matrixA[i][j]*vectorB[j]; 
		}
		return;
	}
}
