package edu.cnm.deepdive.cards;

public class Test {

  public static void main(String[] args) {
    Deck deck = new Deck();
    deck.shuffle();
    System.out.println(deck);
    deck.sort();
    System.out.println(deck);
  }

}
