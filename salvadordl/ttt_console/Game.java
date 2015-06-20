public class Game {
	private Board board;
	private Player first;
	private Player second;
 
	private Player current;
 
	public Game(Board board, Player p1, Player p2) {
		this.board = board;
		this.first = p1;
		this.second = p2;
 
		this.current = second;
	}
 
	public void start() {
		while ( this.board.hasWinner() == null ) {
			this.current = (this.current == this.first) ? this.second : this.first;
			this.board.printBoard();
 
			boolean ok = false;
			while ( ! ok ) {
				Move next = this.current.play();
				ok = this.board.setSquare(this.current, next.getRow(), next.getCol());							
			}						
		}
		System.out.println("Congratulations! " + this.current.getName() + " won!");
	}
 
	public static void main(String [] args) {
		Player p1 = new Player("PlayerA", 'A');
		Player p2 = new Player("PlayerB", 'B');
		Board b = new Board(3, 3);
 
		Game g = new Game(b, p1, p2);
 
		g.start();
	}
}
