/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrick;

import java.util.Scanner;

/** step 1: generate 7 random cards and store in array 
 * 52 deck size: 
 * 2 spades
 * 5 hearts
 * 1 clubs
 * ... 7 cards
 *
 * @author Chakshita Gupta
 * Student Id 991653663
 * 
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
          
          c.setNumbers((int)Math.floor(1 + Math.random()*53));//random generation for number/use method
          c.setSuit(Card.SUITS[(int)Math.floor(  Math.random()*3)]);
          magicHand[i]=c; // stores the card object  in array
        
    }
       
      //step 2: take input guess the card 2 spades find in array - print your card is found
            Scanner scan = new Scanner(System.in);
            System.out.println("Choose a card number");
             int a = scan.nextInt();
             scan.nextLine();
             System.out.println("choose a suit");
             String b = scan.nextLine();
             
            
                 for (Card ca : magicHand){
                      if(ca.getNumbers() == a &&  ca.getSuit().equals(b)) 
                 {
                     System.out.println("card found");   
                 }
                 }
                 
          
                        }
    // step 3 do change in remote repository. hard coded card details card number =2,hearts to find in array
     public static void main(String args[]) { 
   Card luckyCard = new Card(); //creating an object
         luckyCard.setSuits("clubs");
         luckyCard.setNumber(3);
    System.out.println(luckyCard.getNumber().getSuits);
    
    }
    


