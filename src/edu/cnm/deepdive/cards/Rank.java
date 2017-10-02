package edu.cnm.deepdive.cards;

public enum Rank {
  ACE(1, 15),
  TWO(2, 5),
  THREE(3, 5),
  FOUR(4, 5),
  FIVE(5, 5),
  SIX(6, 5),
  SEVEN(7, 5),
  EIGHT(8, 5),
  NINE(9, 5),
  TEN(10, 10),
  JACK(11, 10),
  QUEEN(12, 10),
  KING(13, 10);

  public final int pips;
  public final int value;

  Rank(int pips, int value) {
    this.pips = pips;
    this.value = value;
  }


  @Override
  public String toString() {
    if (pips > 1 && pips <11) {
      return Integer.toString(pips);
      //return "" +pips;
      //return String.format("%d", pips);
    } else {
      return super.toString().substring(0, 1);
    }
  }
}
