package common;

import java.util.ArrayList;
import java.util.Arrays;

public class Knight extends PieceData {
	//constructor
	public Knight(PieceColor color, int x, int y) {
		super(color, x, y, "Knight");
	}
	//getting available moves
	@Override
	public AvailableMoves getAvailableMoves(Board board) {
		ArrayList<PositionData> toReturn = new ArrayList<>();
		int x = this.position.x;
		int y = this.position.y;

		ArrayList<PositionData> positions = new ArrayList<>(Arrays.asList(new PositionData[] {
						new PositionData(x + 1, y - 2),
						new PositionData(x + 2, y - 1),
						new PositionData(x + 2, y + 1),
						new PositionData(x + 1, y + 2),
						new PositionData(x - 1, y + 2),
						new PositionData(x - 2, y + 1),
						new PositionData(x - 2, y - 1),
						new PositionData(x - 1, y - 2) }));

		for (PositionData pos : positions) {
			if (!pos.inbounds()) {
				continue;
			}

			PieceData piece = board.getPiece(pos);
			
			if (piece == null || !this.onSameTeam(piece)) {
				toReturn.add(pos);
			}
		}

		return new AvailableMoves(toReturn);
	}
}