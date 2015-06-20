import java.io.BufferedReader;
import java.io.InputStreamReader;
 
 
public class Player {
	private String name;
	private char avatar;
 
	public Player(String name, char avatar) {
		this.name = name;
		this.avatar = avatar;
	}
 
	public Move play() {
		try {
			System.out.println(this.name + " enter your move (row column).");
	        InputStreamReader reader = new InputStreamReader(System.in);
	        BufferedReader br = new BufferedReader(reader);
	        String input = br.readLine();
 
	        int indexOfSpace = input.indexOf(" ");
	        String row = input.substring(0, indexOfSpace);
	        String col = input.substring(indexOfSpace + 1);
 
	        int irow = Integer.valueOf(row).intValue();
	        int icol = Integer.valueOf(col).intValue();
 
	        return new Move(irow, icol);
		} catch (Exception e) {
			System.out.println("Error Reading Player Input");
			System.exit(1);
		}
		return null;
	}
 
	public char getAvatar() {
		return this.avatar;
	}
 
	public String getName() {
		return this.name;
	}
}
