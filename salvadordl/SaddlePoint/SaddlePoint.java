public class SaddlePoint {

    public static void main(String[] args) {
        int min, max, i, j, k, l;
        int[][] a = new int[][] {
        		{1, 2, 3},
        		{4, 5, 6},
        		{7, 8, 9}
        };
        
        for(i = 0; i < 3; i++) { 
            for(j = 0; j < 3; j++) {
                max = min = a[i][j];
                   for(k = 0; k < 3; k++) {
                	   if(max < a[k][j]) {
                		   min = a[k][j];
                	   }
                    }
                
                    for(l = 0; l < 3; l++) {
                    	if(min > a[i][l]) {
                    		max = a[i][l];
                    	}
                    }
                
                if(max==min) {
                	System.out.print("Saddle Point: "+max+", index: ("+(i+1)+" , "+(j+1)+")");
                }
            }  
        }
        System.out.println();  
    }
}
