/* Author: Ciara Morrissey
 * Program Purpose: The program generates 3 random cards from a pack of 52.
 * Aces are the lowest value 1, and Kings are the highest value 13. Jokers
 * are not included. If the sum of all three cards dealt is less than or
 * equal to 21, the player beats the house, however if the sum is greater
 * than 21 the house wins.
*/
import java.util.Random;
public class JFT13Ex5{
    public static void main(String[] args){
        Random random = new Random();
        int sum = 0;
        for(int i = 0; i < 3; i++){
            int card = random.nextInt(13) + 1; 
            String playingCard;
            int playingCards = random.nextInt(4);
            switch(playingCards){
                case 0:
                playingCard = "CLUBS";
                break;

                case 1:
                playingCard = "HEARTS";
                break;

                case 2:
                playingCard = "DIAMONDS";
                break;

                case 3:
                playingCard = "SPADES";
                break;

                default:
                playingCard = "Error";
            }

            switch(card){
                case 1:
                System.out.println("ACE of " + playingCard);
                sum += 1;
                break;

                case 2:
                System.out.println("TWO of " + playingCard);
                sum += 2;
                break;

                case 3:
                System.out.println("THREE of " + playingCard);
                sum += 3;
                break;

                case 4:
                System.out.println("FOUR of " + playingCard);
                sum += 4;
                break;

                case 5:
                System.out.println("FIVE of " + playingCard);
                sum += 5;
                break;

                case 6:
                System.out.println("SIX of " + playingCard);
                sum += 6;
                break;

                case 7:
                System.out.println("SEVEN of " + playingCard);
                sum += 7;
                break;

                case 8:
                System.out.println("EIGHT of " + playingCard);
                sum += 8;
                break;

                case 9:
                System.out.println("NINE of " + playingCard);
                sum += 9;
                break;

                case 10:
                System.out.println("TEN of " + playingCard);
                sum += 10;
                break;

                case 11:
                System.out.println("JACK of " + playingCard);
                sum += 11;
                break;

                case 12:
                System.out.println("QUEEN of " + playingCard);
                sum += 12;
                break;

                case 13:
                System.out.println("KING of " + playingCard);
                sum += 13;
                break;

                default:
                System.out.println("Error");
                
            }
        }
            System.out.println("Your score is: " + sum);
            if(sum <= 21){
                System.out.println("Result - Victory - You beat the house!");
            }else{
                System.out.println("Result - Defeat - house wins!");
            }
       
    }
}