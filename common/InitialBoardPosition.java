package common;

import java.util.List;

//setting board initial positions
// TODO Deprecate
public class InitialBoardPosition {
	public static PieceData[][] getBoardStartingPosition() {
		PieceData[][] toReturn = new PieceData[8][8];
		toReturn[0][0] = new Rook(PieceColor.b, 0, 0);
		toReturn[1][0] = new Knight(PieceColor.b, 1, 0);
		toReturn[2][0] = new Bishop(PieceColor.b, 2, 0);
		toReturn[3][0] = new Queen(PieceColor.b, 3, 0);
		toReturn[4][0] = new King(PieceColor.b, 4, 0);
		toReturn[5][0] = new Bishop(PieceColor.b, 5, 0);
		toReturn[6][0] = new Knight(PieceColor.b, 6, 0);
		toReturn[7][0] = new Rook(PieceColor.b, 7, 0);
		for (int x = 0; x < 8; x++) {
			toReturn[x][1] = new Pawn(PieceColor.b, x, 1);
		}

		for (int x = 0; x < 8; x++) {
			toReturn[x][6] = new Pawn(PieceColor.w, x, 6);
		}
		toReturn[0][7] = new Rook(PieceColor.w, 0, 7);
		toReturn[1][7] = new Knight(PieceColor.w, 1, 7);
		toReturn[2][7] = new Bishop(PieceColor.w, 2, 7);
		toReturn[3][7] = new Queen(PieceColor.w, 3, 7);
		toReturn[4][7] = new King(PieceColor.w, 4, 7);
		toReturn[5][7] = new Bishop(PieceColor.w, 5, 7);
		toReturn[6][7] = new Knight(PieceColor.w, 6, 7);
		toReturn[7][7] = new Rook(PieceColor.w, 7, 7);

		return toReturn;
	}
}
