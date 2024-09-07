package chess;

import boardgame.Board;
import boardgame.Piece;

public abstract class ChessPiece extends Piece {
	
	private Color color;

	
	//CONSTRUCTORS
	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}
	
	
	//GETS & SETS

	public Color getColor() {
		return color;
	}




	
	

}
