package edu.cnm.deepdive.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Deck {

  private List<Card> cards;
  private Random rng = new Random();

  public Deck() {
    cards = new ArrayList<>();
    for (Suit suit : Suit.values()) {
      for (Rank rank : Rank.values()) {
        Card card = new Card(suit, rank);
        cards.add(card);
      }
    }
  }

  @Override
  public String toString() {
    return cards.toString();
  }

  public Card[] toArray() {
    return cards.toArray(new Card[0]);
  }

  public void shuffle() {
    Collections.shuffle(cards);
  }

  public void sort() {
    //sort(0, cards.size());
    Collections.sort(cards);
  }
  public void sort(Comparator<Card> comp) {
    Collections.sort(cards, comp);
  }
  private void sort(int start, int end) {
    if(end <= start +1) {
      return;
    }
    int pivotSource = start + rng.nextInt( end - start);
    Card pivotCard = cards.get(pivotSource);
    cards.set(pivotSource, cards.get(start));
    cards.set(start, pivotCard);
    int i = start;
    int j = end;
    while (j >= i) {
      try {
      while (++i < end && cards.get(i).compareTo(pivotCard) < 0) {
        //Do nothing
      }
      while (cards.get(--j).compareTo(pivotCard) > 0) {
        //Do nothing
        }
      } catch (Exception e) {
        throw e;
      }
      if (j > i) {
        Card temp = cards.get(i);
        cards.set(i, cards.get(j));
        cards.set(j, temp);
      } else if (j < i) {
        Card temp = cards.get(j);
        cards.set(j, pivotCard);
        cards.set(start, temp);
        break;
      }
    }
    sort(start, j);
    sort(j +1, end);
  }
}
