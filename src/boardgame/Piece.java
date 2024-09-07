package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	
	//CONSTRUCTORS
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	
	//GETS & SETS
	
	protected Board getBoard() {
		return board;
	}

	
	
	
	
}
