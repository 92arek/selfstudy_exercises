package programmersSelfstudy.arrays;

import static programmersSelfstudy.arrays.Exercise4.ChessFigures.*;

public class Exercise4 {

    public enum ChessFigures {
        EMPTY, B_PAWN, B_QUEEN, B_ROOK, B_KNIGHT,
        W_PAWN, W_KING, W_ROOK, W_KNIGHT
    }

    private ChessFigures[][] chessBoard = new ChessFigures[8][8];

    public static ChessFigures[][] boardState() {
        return new ChessFigures[][]{
                new ChessFigures[]{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                new ChessFigures[]{B_PAWN, B_PAWN, EMPTY, EMPTY, EMPTY, EMPTY, W_PAWN, EMPTY},
                new ChessFigures[]{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                new ChessFigures[]{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                new ChessFigures[]{EMPTY, B_QUEEN, B_PAWN, EMPTY, EMPTY, W_KNIGHT, EMPTY, EMPTY},
                new ChessFigures[]{EMPTY, B_KNIGHT, EMPTY, EMPTY, W_ROOK, EMPTY, W_PAWN, EMPTY},
                new ChessFigures[]{EMPTY, EMPTY, EMPTY, B_ROOK, EMPTY, EMPTY, EMPTY, EMPTY},
                new ChessFigures[]{EMPTY, W_KING, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
        };
    }
}