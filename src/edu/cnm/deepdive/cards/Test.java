package edu.cnm.deepdive.cards;

import java.util.Comparator;

public class Test {

//  public static void main(String[] args){
//  //Local class
//  class AlternateSorter implements Comparator<Card> { //only the class Test class can see
//    // the alternate sorter because its private
//
//    @Override
//    public int compare(Card card1,
//        Card card2) {        // if the card1 is less than card2 than return a negative integer
//      if (card1.rank != card2.rank) {                  // if card1 equal to card2 return a 0.
//        return card1.rank.compareTo(
//            card2.rank);      // if card1 is greater than card2 return a positive integer.
//      }
//      return card1.suit.compareTo(card2.suit);
//    }


  public static void main(String[] args) {
    Deck deck = new Deck();
    deck.shuffle();
    System.out.println(deck);
    deck.sort();
    System.out.println(deck);
    deck.sort(new Comparator<Card>() {                  // create a comparator object using our overloading constructor
                @Override
                public int compare(Card card1,
                    Card card2) {                          // if the card1 is less than card2 than return a negative integer
                  if (card1.rank != card2.rank) {           // if card1 equal to card2 return a 0.
                    return card1.rank.compareTo(
                        card2.rank);                        // if card1 is greater than card2 return a positive integer.
                  }
                  return card1.suit.compareTo(card2.suit);
                }
              });
    // lambda expression, with explicit body and return
    //deck.sort((card1, card2) -> {
    //    if (card1.rank != card2.rank) {
    //      return card1.rank.compareTo(card2.rank);
    //      }
    //     return card1.suit.compareTo(card2.suit);
    // });
    //     Lambda expression, with implicit body and return
    //deck.sort((card,card2) -> (card1.rank != card2.rank)
    //     ? card1.rank.compareTo(card2.rank)
    //     : card1.suit.compareTo(card2.suit));
      System.out.println(deck);
  }
}
//  //Nested class
//  private static class AlternateSorter implements Comparator<Card> { //only the class Test class can see
//                                                                    // the alternate sorter because its private
//
//    @Override
//    public int compare(Card card1, Card card2) {        // if the card1 is less than card2 than return a negative integer
//      if (card1.rank != card2.rank) {                  // if card1 equal to card2 return a 0.
//        return card1.rank.compareTo(card2.rank);      // if card1 is greater than card2 return a positive integer.
//      }
//      return card1.suit.compareTo(card2.suit);
//    }
//
//  }
//}
    //top level (non public) class
//  private static class AlternateSorter implements Comparator<Card> {
//
//
//    @Override
//    public int compare(Card card1, Card card2) {
//      if (card1.rank != card2.rank) {
//        return card1.rank.compareTo(card2.rank);
//      }
//      return card1.suit.compareTo(card2.suit);


