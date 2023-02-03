package exercise1;

import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Pankaj Pankaj
 * @author Pankaj Pankaj Feb 2, 2023
 */
public class CardTrick {
    
    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        
        Card[] hand = new Card[7];
        
        // Fill the hand with random cards
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(13) + 1);
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            hand[i] = card;
        }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
         // Ask the user for a card
        System.out.println("Pick a card: enter the value (1-13) and the suit (1-4)");
        System.out.print("Value: ");
        int value = sc.nextInt();
        System.out.print("Suit: ");
        int suit = sc.nextInt();
        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(Card.SUITS[suit - 1]);
        
        // If the guess is successful, print System.out.println("Congratulations, you guessed right!");.
         // Search for the user's card in the hand
        boolean found = false;
        for (int i = 0; i < hand.length; i++) {
            if (hand[i].getValue() == userCard.getValue() && hand[i].getSuit().equals(userCard.getSuit())) {
                found = true;
                break;
            }
        }
         // Print the result
        if (found) {
            System.out.println("Congratulations, you guessed right!");
        } else {
            System.out.println("Sorry, that card is not in the hand.");
        }
        
        sc.close();
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Pankaj Pankaj Feb 2023
     */
    // I'm Done
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Pankaj, but you can call me meet");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Learn more about cloud computing");
        System.out.println("-- Have a semester full of fun and knowledge");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Playing Badminton");
        System.out.println("-- Gym");
        System.out.println("-- Watching anime");
        System.out.println("-- Loves Cars");

        System.out.println();
        
    
    }

}
