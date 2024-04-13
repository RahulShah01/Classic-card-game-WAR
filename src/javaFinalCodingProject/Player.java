/*
 * 1c. Player Class
 * 
 * Player class is created below with Fields hand, score and name.
 * 
 */
package javaFinalCodingProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
  
  List<Card> hand = new ArrayList<Card>();
  int score;
  String name;
  
 public Player(String name) {
   this.name = name;
   this.score = 0;
 }

  public List<Card> getHand() {
    return hand;
  }
  public void setHand(List<Card> hand) {
    this.hand = hand;
  }
  public int getScore() {
    return score;
  }
  public void setScore(int score) {
    this.score = score;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  
  /* 
   * Describe method here prints all the cards each players have.
   * For this assignment, the describe method will output 26 cards for each players, Player1 and Player2.
   * 
   */
  public void describe() {
    for(Card card : hand) {
    card.describe();
     }
 }
  
 /**
  * The flip method below removes the top card of the hand.
  * @return returns the removed top card from the hand. 
  * 
  */
  public Card flip() {
    Card drawnCard = hand.get(0);
    hand.remove(0);
    return drawnCard;
  }
  
  /**
   * The draw method below takes a Deck as an argument and calls the draw methods on the deck.
   * @param deck uses deck as a parameter. 
   * The returned card is added to the hand field
   * 
   */
  
  public void draw(Deck deck) {
    Card card = deck.draw();
    hand.add(card);
   }
  
  // The incrementScore method adds 1 to the player's score field. 
  public void incrementScore() {
    this.score++;
   }
  
}
