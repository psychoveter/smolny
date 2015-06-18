import java.util.Scanner;


public class saddlePoint {

    public static void main(String[] args) {
        int min;
        int max;
        int i;
        int j;
        int k;
        int l;
        Scanner in = new Scanner(System.in);
        int a[][] = new int[3][3];
        System.out.print("Let's find saddle point!\n");
        for(i=0;i<3;i++){
              for(j=0;j<3;j++){
                  System.out.print("Enter a number for Row "+(i+1)+" Col "+(j+1)+" = ");
                    a[i][j]=in.nextInt();
              }
        }
        for(i=0;i<3;i++){
          for(j=0;j<3;j++){
               max=min=a[i][j];
                  for( k=0;k<3;k++){
                   if(max<a[k][j]){
                      min=a[k][j];
                   }
                  }

                   for(l=0;l<3;l++){
                     if(min>a[i][l]){
                        max=a[i][l];
                      }
                    }

              if(max==min){
                  System.out.print("Saddle point is "+max+" at ("+(i+1)+" , "+(j+1)+")");
              }
              /* {
                System.out.println("No saddle point");
              }*/
          }

      }

      System.out.println();

  }

}
