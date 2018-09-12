package programmersSelfstudy.arrays;

public enum ChessFigures {
  EMPTY(0), B_PAWN(1), B_KING(2), B_QUEEN(3), B_ROOK(4), B_KNIGHT(5), B_BISHOP(6),
  W_PAWN(7), W_KING(8), W_QUEEN(9), W_ROOK(10), W_KNIGHT(11), W_BISHOP(12);

  private int value;

  ChessFigures(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }
}
