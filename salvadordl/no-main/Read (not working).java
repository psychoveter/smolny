import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.File;

public class Read {
    
    public static void main(String[] args) {
        String aFile = "C:\\Java\\matrix\\a.txt";
        String bFile = "C:\\Java\\matrix\\b.txt";
        String aContent = readingFile(aFile);

    }
 
    public static double[][] readingFile(String filename){ 
        //String aFile = "C:\\Java\\matrix\\a.txt"; 
//Example file        
/*
*3 2   
*3 4 5
*2 3 4
*
*/ 
        try (BufferedReader br = new BufferedReader (new FileReader(new File (filename)))){ 
            String line = br.readLine();
            String[] dim = line.split(" ");
             int rowsNum = dim[0];
             int colsNum = dim[1];

            double[][] result = new double[colsNum][rowsNum];
            int colCounter = 0; 
            while((line = br.readLine()) != null) { 
                String[] aString = line.split(" ");                
 
                for(int rowCounter = 0; rowCounter < aString.length; i++)  {
                    double value = Double.parseDouble(aString[rowCounter]); 
                    result[colCounter][rowCounter];
                }
                colCounter++; 
            }

            return null;
 
        } catch (Exception e) { 
            System.out.println(e); 
            return line; 
        } 
    }
 
} 
