class Binary{
	
  public void convertBinary(int num) {
     int binary[] = new int[40];
     int index = 0;
     while(num > 0){
       binary[index++] = num%2;
       num = num/2;
     }
     for(int i = index - 1; i >= 0; i--) {
       System.out.print(binary[i]);
     }
  }
 
  public static void main(String a[]) {
     Binary binary = new Binary();
     System.out.println("\nBinary of 1984: ");
     binary.convertBinary(1984);
     System.out.println("\nBinary of 451: ");
     binary.convertBinary(451);
  }
}
