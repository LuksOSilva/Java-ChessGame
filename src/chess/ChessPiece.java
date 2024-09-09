package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

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

	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}
	
	//METHODS
	
	protected boolean isthereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		return p != null && p.getColor() != color;
		
	}


	
	

}
