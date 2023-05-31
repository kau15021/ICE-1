/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;


 import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
import java.util.Scanner;
//Name - Harleen Kaur , Student ID - 991709976
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) 
        {
            Card c = new Card();
            c.setValue(generateRandomNumber());
           
            
//Generate a random value between 1 and 13

            c.setSuit(Card.SUITS[( Card.SUITS.length - 4)]);

            magicHand[i] = c;
        }

        // asking user to input a value
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter card value (1-13): ");
        int value = scanner.nextInt();
        System.out.print("Enter card suit (0-3): ");
        int suit = scanner.nextInt();

        // Create the user's card
        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(Card.SUITS[suit]);

        // Search for the user's card in magicHand
        boolean found = false;
        for (Card card : magicHand) {
            if (card.equals(userCard)) {
                found = true;
                break;
            }
        }

        // Report the result
        if (found) {
            System.out.println("Congratulations! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
        Card luckyCard = new Card();
        luckyCard.setValue(7);  // Set the card number
        luckyCard.setSuit(Card.SUITS[1]);  // Set the card suit
        magicHand[3] = luckyCard;
    }

    // Generate a random number between 1 and 13 (inclusive)
    private static int generateRandomNumber() {
        return (int) (Math.random() * 13) + 1;
    }

    
    

    
}
