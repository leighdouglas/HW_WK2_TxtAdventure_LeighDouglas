package nyc.c4q.leighdouglas;

import java.util.Scanner;


public class EndOfGame {

    public static void endOfGameChoice(){
    Scanner scanner = new Scanner (System.in);
    String choice = "";
    boolean startOver = false;

    AdventureGame.promptPlayer("Would you like to play again?");
    choice = scanner.next();

        do {
        if (choice.equalsIgnoreCase("Yes") || choice.equalsIgnoreCase("y")) {
            Choices.startGame();
            startOver = false;
            break;
        } else if (choice.equalsIgnoreCase("No") || choice.equalsIgnoreCase("n")) {
            System.out.println("thank you for playing!");
            break;
        } else {
            startOver = true;
            AdventureGame.promptPlayer("Please enter the correct input.");
            choice = scanner.next();
        }
    } while (startOver == true) ;

}
}
