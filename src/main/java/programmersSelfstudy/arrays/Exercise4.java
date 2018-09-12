package programmersSelfstudy.arrays;

import static programmersSelfstudy.arrays.ChessFigures.B_PAWN;
import static programmersSelfstudy.arrays.ChessFigures.EMPTY;

public class Exercise4 {
    private int[][] chessBoard = new int[8][8];

    public static int[][] boardState() {
        return new int[][]{
                new int[]{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                new int[]{B_PAWN, B_PAWN, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                new int[]{},
                new int[]{},
                new int[]{},
                new int[]{},
                new int[]{},
                new int[]{},
        };
    }
}
