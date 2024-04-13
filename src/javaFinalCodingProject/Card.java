/* 
 * 1a: Card Class
 * 
 * Card class is created below with Fields name, suit and value. 
 * Name field represents the face name of the cards (Two through Ace).
 * Suit field represents the suit of the cards (Clubs ♣ , Diamonds ♦, Hearts ♥, Spades ♠).
 * Value field represents values from 2 to 14 for comparing cards.
 * 
 */

package javaFinalCodingProject;

// Card class and field declaration for the card class.

public class Card {
  
  String name;
  String suit;
  int value;

  // Constructor for card class with three parameters passed in, String name, String suit and int value. 
  
  Card (String name, String suit, int value){
    
    this.name = name;
    this.suit = suit;
    this.value = value;
    
  }

  // Getters and setters.
  
  public String getSuit() {
    return suit;
  }

  public void setSuit(String suit) {
    this.suit = suit;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  // Describe method to print out information about the card. 
  
  public void describe() {
    System.out.println(this.name + " of " + this.suit );
  }

}


