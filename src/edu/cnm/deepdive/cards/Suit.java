package edu.cnm.deepdive.cards;

public enum Suit {
  CLUBS, DIAMONDS, HEARTS, SPADES;

  @Override
  public String toString() {
    switch (this) {
      case CLUBS:
        return "\u2663";
      case DIAMONDS:
        return "\u2666";
      case HEARTS:
        return "\u2665";
      case SPADES:
        return "\u2660";
      default:
        return "";
    }
  }
}
