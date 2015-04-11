// Turns a number from decimal numeral system into binary
public class ToBinary {

	public static void main(String[] args) {
	
		int i = 9;
		String binary = "";
		
		while (i != 1) {
			binary = Integer.toString(i%2) + binary;
			i = i/2;
	  }
	  
		String result = "1" + binary; 	
		System.out.println(result); 
	}
}
