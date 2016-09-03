package nyc.c4q.leighdouglas;

import java.util.Scanner;

public class Choices {

        public static void startGame() {
            Scanner scanner = new Scanner (System.in);
            String choice = "";
            boolean startOver = false;

            Prompts.startOfGame();

            choice = scanner.next();

            do {
                if (choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y")) {
                    throat();
                    startOver = false;
                    break;
                } else if (choice.equalsIgnoreCase("no") || choice.equalsIgnoreCase("n")) {
                    Prompts.stillInMouth();
                    choice = scanner.next();
                    startOver = true;
                } else {
                    startOver = true;
                    AdventureGame.promptPlayer("Please enter the correct input.");
                    choice = scanner.next();
                }
            } while (startOver == true);
        }


        public static void throat() {

            Scanner scanner = new Scanner (System.in);
            String choice = "";
            boolean startOver = false;

            Prompts.throat();
            choice = scanner.next();

            do {
                if (choice.equalsIgnoreCase("Right") || choice.equalsIgnoreCase("r")) {
                    lungs();
                    startOver = false;
                    break;
                } else if (choice.equalsIgnoreCase("Left") || choice.equalsIgnoreCase("l")) {
                    stomach();
                    startOver = false;
                    break;
                } else {
                    startOver = true;
                    AdventureGame.promptPlayer("Please enter the correct input.");
                    choice = scanner.next();
                }
            } while (startOver == true) ;
        }

        public static void lungs() {
            Scanner scanner = new Scanner (System.in);
            String choice = "";
            boolean startOver = false;

            Prompts.lungs();
            choice = scanner.nextLine();

            do {
                if (choice.equalsIgnoreCase("Stay") || choice.equalsIgnoreCase("s")) {
                    coughEnding();
                    startOver = false;
                    break;
                } else if (choice.equalsIgnoreCase("Touch orb")) {
                    Prompts.absorbedFromLungs();
                    Prompts.absorbed();
                    absorbed();
                    startOver = false;
                    break;
                } else {
                    startOver = true;
                    AdventureGame.promptPlayer("Please enter the correct input.");
                    choice = scanner.nextLine();
                }
            } while (startOver == true) ;


        }

        public static void stomach() {

            Scanner scanner = new Scanner (System.in);
            String choice = "";
            boolean startOver = false;

            Prompts.stomach();
            choice = scanner.nextLine();

            do {
                if (choice.equalsIgnoreCase("Stay")) {
                    burpEnding();
                    startOver = false;
                    break;
                } else if (choice.equalsIgnoreCase("Swim to Wall")) {

                    Prompts.absorbedFromStomach();
                    Prompts.absorbed();
                    absorbed();
                    startOver = false;
                    break;
                } else {
                    startOver = true;
                    AdventureGame.promptPlayer("Please enter the correct input.");
                    choice = scanner.nextLine();
                }
            } while (startOver == true) ;

        }

        public static void absorbed(){
            Scanner scanner = new Scanner (System.in);
            String choice = "";
            boolean startOver = false;

            choice = scanner.next();

            do {
                if (choice.equalsIgnoreCase("Right") || choice.equalsIgnoreCase("r")) {
                    heart();
                    startOver = false;
                    break;
                } else if (choice.equalsIgnoreCase("Left") || choice.equalsIgnoreCase("l")) {
                    brainEnding();
                    startOver = false;
                    break;
                } else {
                    startOver = true;
                    AdventureGame.promptPlayer("Please enter the correct input.");
                    choice = scanner.next();
                }
            } while (startOver == true);


        }

        public static void coughEnding(){
            Prompts.coughEnding();
            EndOfGame.endOfGameChoice();
        }

        public static void burpEnding(){
            Prompts.burpEnding();
            EndOfGame.endOfGameChoice();
        }

        public static void heart(){
            Scanner scanner = new Scanner (System.in);
            String choice = "";
            boolean startOver = false;

            Prompts.heart();
            choice = scanner.next();

            do {
                if (choice.equalsIgnoreCase("stay") || choice.equalsIgnoreCase("s")) {
                    heartEnding();
                    startOver = false;
                    break;
                } else if (choice.equalsIgnoreCase("leave") || choice.equalsIgnoreCase("l")) {
                    brainEnding();
                    startOver = false;
                    break;
                } else {
                    startOver = true;
                    AdventureGame.promptPlayer("Please enter the correct input.");
                    choice = scanner.next();
                }
            } while (startOver == true) ;

        }

        public static void heartEnding() {

            Prompts.heartEnding();
            EndOfGame.endOfGameChoice();
        }

        public static void brainEnding(){

            Prompts.brainEnding();
            EndOfGame.endOfGameChoice();
        }

}
