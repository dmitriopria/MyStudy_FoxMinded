package ua.com.foxminded.studying;

import java.util.Scanner;
import java.util.Random;

class Game {
    public static void main(String[] args) {

        Game game = new Game();
        //Print menu
        game.printMenu();
        //Check human choice
        int humanChoice = game.receiveHumanChoice();
        //Check if human wants to play
        while (game.humanWantsToPlay(humanChoice)) {
            //Make my choice
            int myChoice = game.makeMyChoice();
            //Resolve winner
            game.resolveWinner(humanChoice, myChoice);

            game.printMenu();
            humanChoice = game.receiveHumanChoice();
        }
        //Say goodbye
        game.sayGoodBye();
    }

    private void printMenu() {
        System.out.println("If you want to play with, than choose your option: ");
        System.out.println("1. Rock");
        System.out.println("2. Scissors");
        System.out.println("3. Paper");
        System.out.println("0. Quit the game");
    }

    private int receiveHumanChoice() {
        Scanner consoleScanner = new Scanner(System.in);
        int choice = consoleScanner.nextInt();
        //Check if it corrects
        while(choice < 0 || choice > 3) {
            System.out.println("Sorry, I don't understand. Try again");
            choice = consoleScanner.nextInt();
        }
        return choice;
    }

    private boolean humanWantsToPlay(int humanChoice) {
        return humanChoice != 0;
    }

    private int makeMyChoice() {
        Random randomizer = new Random();
        int myChoice = 1 + randomizer.nextInt(3);
        System.out.println("I choose " + myChoice);
        return myChoice;
    }

    private void resolveWinner(int humanChoice, int myChoice) {
        //Check if nobody wins
        if (humanChoice == myChoice) {
            System.out.println("DRAW");
        }
        //Check if human wins
        else if (isHumanWins(humanChoice, myChoice)) {
            System.out.println("You WIN!");
        }
        //else we are the winner
        else {
            System.out.println("You LOOSE!");
        }
    }

    private boolean isHumanWins (int humanChoice, int myChoice) {
        return (humanChoice == 3 && myChoice ==1) ||
                (humanChoice == 2 && myChoice ==3) ||
                (humanChoice == 1 && myChoice ==2);
    }

    private void sayGoodBye() {
        System.out.println("Good Bye");
    }
}
