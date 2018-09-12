package programmersSelfstudy.arrays;

import static programmersSelfstudy.arrays.Exercise4.ChessFigures.*;

public class Exercise4 {

    public enum ChessFigures {
        EMPTY, B_PAWN, B_KING, B_QUEEN, B_ROOK, B_KNIGHT, B_BISHOP,
        W_PAWN, W_KING, W_QUEEN, W_ROOK, W_KNIGHT, W_BISHOP;
    }

    private int[][] chessBoard = new int[8][8];

    public static ChessFigures[][] boardState() {
        return new ChessFigures[][]{
                new ChessFigures[]{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                new ChessFigures[]{B_PAWN, B_PAWN, EMPTY, EMPTY, EMPTY, EMPTY, W_PAWN, EMPTY},
                new ChessFigures[]{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                new ChessFigures[]{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                new ChessFigures[]{EMPTY, B_QUEEN, B_PAWN, EMPTY, EMPTY, W_KNIGHT, EMPTY, EMPTY},
                new ChessFigures[]{},
                new ChessFigures[]{},
                new ChessFigures[]{},
        };
    }
}