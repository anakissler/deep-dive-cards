package edu.cnm.deepdive.cards;

public class Card
  implements Comparable<Card> {

  public final Suit suit;
  public final Rank rank;

  public Card(Suit suit, Rank rank) {
    this.suit = suit;
    this.rank = rank;
  }

  @Override
  public String toString() {
    return rank.toString() + suit.toString();
  }

  @Override
  public int compareTo(Card other) {
    if (suit != other.suit) {
      return suit.compareTo(other.suit);
    }
    return rank.compareTo(other.rank);
  }
}

