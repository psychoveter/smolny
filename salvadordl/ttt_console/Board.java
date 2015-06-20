public class Board {
	int numRows;
	int numCols;
 
	Player [] squares;
 
	public Board(int numRows, int numCols) {
		this.numRows = numRows;
		this.numCols = numCols;
 
		this.squares = new Player[this.numRows * this.numCols];
	}
 
	public Player getPlayerForSquare(int row, int col) {
		int idx = getBoardIdxForCoordinates(row, col);
		return this.squares[idx];
	}
 
	public boolean setSquare(Player p, int row, int col) {
		if ( getPlayerForSquare(row, col) != null ) {
			return false;
		}
 
		if ( ( row >= this.numRows) || ( col >= this.numCols ) ) {
			return false;
		}
 
		int idx = getBoardIdxForCoordinates(row, col);
		this.squares[idx] = p;
		return true;
	}
 
	public Player hasWinner() {
		for ( int i=0; i < this.numRows; i++ ) {
			Player p = hasWinnerInRow(i);
			if ( p != null ) {
				return p;
			}
		}
 
		for ( int i=0; i < this.numCols; i++ ) {
			Player p = hasWinnerInCol(i);
			if ( p != null ) {
				return p;
			}
		}
 
		return null;
	}
 
	public void printBoard() {
		for ( int i=0; i < this.numRows; i++ ) {
			for ( int j=0; j < this.numCols; j++ ) {
				Player p = getPlayerForSquare(i, j);
				if ( p == null ) {
					System.out.print("0 ");
				} else {
					System.out.print(p.getAvatar() + " ");
				}
			}
			System.out.println();
		}
	}
 
	private Player hasWinnerInRow(int row) {
		Player p = getPlayerForSquare(row, 0);
 
		if ( p != null ) {
			for ( int i=0; i < this.numCols; i++ ) {
				Player q = getPlayerForSquare(row, i);
				if ( q != p ) {
					p = null;
					break;
				}
			}
		}
 
		return p;
	}
 
	private Player hasWinnerInCol(int col) {
		Player p = getPlayerForSquare(0, col);
 
		if ( p != null ) {
			for ( int i=0; i < this.numRows; i++ ) {
				Player q = getPlayerForSquare(i, col);
 
				if ( q != p ) {
					p = null;
					break;
				}
			}
		}
 
		return p;
	}
 
	private int getBoardIdxForCoordinates(int row, int col) {
		int idx = row * this.numRows + col;
		return idx;
	}
 
 
}
