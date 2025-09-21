import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors{
    public static void main(String[] args) {
        int playerGuess;
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("**********Rock Paper Scissors**********");

        //Player & computer selects their option
        System.out.print("Select 1.Rock 2.Paper 3.Scissors: ");
        playerGuess = myObj.nextInt();
        int computerGuess = 1 + (int)(Math.random() * 3);

        //Game mechanics
        if(playerGuess == 1 && computerGuess == 3){
                System.out.println("Player selected Rock and computer selected Scissors.Player WINS");
            }else if(computerGuess == 1 && playerGuess == 3){
                System.out.println("Computer selected Rock and player selected Scissors.Computer WINS");
        }
        if(playerGuess == 2 && computerGuess == 1){
                System.out.println("Player selected Paper and computer selected Rock.Player WINS");
            }else if(computerGuess == 2 && playerGuess == 1){
                System.out.println("Computer selected Paper and player selected Rock.Computer WINS");
        }
        if(playerGuess == 3 && computerGuess == 2){
                System.out.println("Player selected Scissors and computer selected Paper.Player WINS");
            }else if(computerGuess == 2 && playerGuess == 3){
                System.out.println("Computer selected Scissors and player selected Paper.Computer WINS");
        }
    }
}