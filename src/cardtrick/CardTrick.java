/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrick;

/** step 1: generate 7 random cards and store in array 
 * 52 deck size: 
 * 2 spades
 * 5 hearts
 * 1 clubs
 * ... 7 cards
 *
 * @author sivagamasrinivasan
 */
public class CardTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        
      Card[] magicHand = new Card[7]; //Array of object 
      for (int i=0;i<magicHand.length;i++)
      {
        // step 1: generate 7 random cards and store in array
          Card c= new Card();
          
          c.setNumbers(2);//random generation for number/use method
          c.setSuit("suit by random suit generation");
          magicHand[i]=c; // stores the card object  in array
        
    }
      //step 2: take input guess the card 2 spades find in array - print your card is found
    
    // step 3 do change in remote repository. hard coded card details card number =2,hearts to find in array
    }
    
}
