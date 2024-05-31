Preview: Java Final Project Classic card game WAR

About the project:
  Automated version of the card game war.

Project Description:
  Card class with value and name fields and card describe method. 
  Deck class with cards field and shuffle and draw methods. 
  Player class with hand, score and name fields. Card describe, flip, draw and score methods.

  Main class instantiates a deck of cards and two players and calls the shuffle method on the deck of cards. 
  52 cards are iterated using the traditional for loop calling the draw methods.
  Using the traditional for loop and calling the flip method cards are iterated 26 times and  compared and score is kept. 
  After the loop, final scores are compared and winner is announced. 

Code Snippet: Comparing each players cards 

// Comparing each player's card. Player with higher card wins the round and their score increases by 1.
   // If both players have same cards, then its a tie, score is not increased for either player.
   // Result of each turn is displayed in the console after execution. 
   // Updated score after each turn is displayed in the console. 
   
   if(player1Card.getValue() > player2Card.getValue()) {    
       player1.incrementScore();
       System.out.println("\n" + player1.getName() + " wins this round.");
     } else if (player2Card.getValue() > player1Card.getValue()) {
       player2.incrementScore();
       System.out.println("\n" + player2.getName() + " wins this round.");
     } else {
       System.out.println("\nIt's a tie");
     } System.out.println("\n[Player1 score: " + player1.getScore() + "]" + " [Player2 score: " + player2.getScore() + "]");
  }    
   
Link: 
https://youtu.be/6JaUq5ReLwU



