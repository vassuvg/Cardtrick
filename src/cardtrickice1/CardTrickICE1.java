/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;

import static cardtrickice1.Card.SUITS;
import java.util.Scanner;

/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found'
 *
 * @author Vassu Gagneja 2ndJune 991668719
 */
public class CardTrickICE1 {

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Card [] magicHand = new Card[7];
        for (int i=0;i<magicHand.length;i++){
        Card c1 = new Card();
            c1.setValue((int)(Math.random()*13)+1);//use a method to generate random *13
            c1.setSuits(SUITS[(int)(Math.random()*4)]);//random method suit
            magicHand[i]=c1;
            System.out.println(c1.getValue()+" "+c1.getSuits());
        }
        //step 2:take one card input from user
        //use scanner 
        //int var
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your choice of number(1 to 13) : ");
        int num = input.nextInt();
        Scanner obj = new Scanner(System.in);
        System.out.print("select suit :");
        String suit = obj.nextLine();
       
      /** Card luckyCard = new Card(); //hard coded
       luckyCard.setValue(7);
       luckyCard.setSuits("clubs");*/
        
        
        

         
        
        //step 3: match with array 
        boolean key= false;
        for (Card magicHand1 : magicHand) {
            if (suit.equalsIgnoreCase(magicHand1.getSuits()) && num == magicHand1.getValue()) {
                System.out.println("Card  found");
                key=true;
            }
        }
            if(!key) {
            System.out.println("Card not found");
        }
    }
}
