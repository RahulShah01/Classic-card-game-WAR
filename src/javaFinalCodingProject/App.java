/*
 * 2. App Class.
 * App class contains the main method.
 * 
 */
package javaFinalCodingProject;

public class App {

  public static void main(String[] args) {
    
  /*
  *2a. Instantiate a Deck and two Players, call the shuffle method on the deck.
  *
  */
    
  // Deck is instantiated below. 
    
  Deck deck = new Deck();
  System.out.println("New deck of cards: \n");
  deck.describe();
    
  // Two Players are instantiated below. 
  // Player1 and Player2.
    
  Player player1 = new Player("");
  Player player2 = new Player("");
    
  player1.setName("Player1");
  player2.setName("Player2");
    
  // Shuffle method on the deck is called.
  
  System.out.println("---------------------------------------------------------------");
  
  deck.shuffle();
  System.out.println("\nShuffled deck of cards:\n");
  deck.describe();
    
   /*
    * 2b. Using traditional for loop to iterate 52 times calling the draw method,
    *  
    */
    
   // Dealing 52 cards between player 1 and player 2. Each player gets 26 cards.
     
   for(int i = 0; i < 52; i++) {
      if (i % 2 == 0) {
        player1.hand.add(deck.draw());
      } else {
        player2.hand.add(deck.draw());
      }
    }
   
   // Shown below is each players cards.  
   System.out.println("\n---------------------------------------------------------------"); 
   System.out.println(player1.getName() + " Cards:\n"); 
   player1.describe();
   
   System.out.println("\n----------------------------------------------------------------");
   System.out.println(player2.getName() + " Cards:\n");
   player2.describe();
   
   System.out.println("\n----------------------------------------------------------------");
   
   /*
    * 2c. Using traditional for loop, iterate 26 times and call the flip method for each user 
    * 
    */
   
   // Round counter is used to keep track of each hand played. Total 26 rounds. 
   // Cards flipped by each player in each round is displayed in the console using Card describe() method.
   
   int round = 1;
   for (int i = 0; i < 26; i++) {
     Card player1Card = player1.flip();
     Card player2Card = player2.flip(); 
     
   System.out.println("\n");
   System.out.println("Round " + round + ":");
   round ++;
   
   System.out.print(player1.getName() + " card played: ");
   player1Card.describe();
   
   System.out.print(player2.getName() + " card played: ");
   player2Card.describe();
   
   /*
    * 2d. Compare the value of each card. Call the increment method for player with higher card value. 
    * 
    */
   
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
   
   System.out.println("\n----------------------------------------------------------------");
       
   /*
    * 2e. Compare the final score. 
    * 
    */
   
   // Comparing the final scores for player1 and player2 after 26 rounds. 
   
   int player1score = player1.getScore();
   int player2score = player2.getScore();
       
   System.out.println("Player1 Final Score: " + player1score);
   System.out.println("Player2 Final Score: " + player2score);
   
   /*
    * 2f. Final score and game results.
    * 
    */
       
     if(player1.getScore() > player2.getScore()) {
       System.out.println("\nGame Result: Player1 is the winner.");
     } else if (player2.getScore() > player1.getScore()) {
       System.out.println("\nGame Result: Player2 is the winner."); 
     } else {
       System.out.println("\nGame Result: Draw.");
     }
   }
}
