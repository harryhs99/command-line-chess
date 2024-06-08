package game.chess.application;

import game.chess.board.Board;

import java.util.Arrays;
import java.util.Scanner;

/**
 * PlayGame - main class to start the game
 *
 * @author Harry Hainsworth-Staples
 */
public class PlayGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean quit = false;

        while(!quit)
        {
            mainMenu();

            String[] validInput = {"p", "s", "r", "q"};
            String input = sc.nextLine();


            switch(input)
            {
                case "q":
                    System.out.println("Thanks for playing 😊");
                    quit = true;
                    break;
                case "p":
                    boolean checkMate = false;
                    int turn = 1;
                    Board b = new Board(8, 8);
                    b.initialiseBoard();

                    while (!checkMate) {
                        b.displayBoard();
                        if(turn%2 != 0)
                            System.out.println("Black turn please enter your move:");
                        else
                            System.out.println("White turn please enter your move:");
                        String move = sc.nextLine();
                        turn++;


                        if(turn == 10)
                            checkMate = true;
                    }
                    System.out.println("Good Game!");
                    break;
                case "s":
                    // display settings
                    System.out.println("Under works....");
                    break;
                case "r":
                    // display rules of chess
                    System.out.println("Under works....");
                    break;
                default:
                    if(!Arrays.asList(validInput).contains(input))
                        System.out.println("please enter a valid option...");
                    break;
            }

        }

    }

    private static void lineBreak()
    {
        System.out.println("-----------------------------------------------------------------------");
    }

    private static void mainMenu()
    {
        lineBreak();
        System.out.println("Choose from an option below ⬇️ input the letter in [] and press enter: ");
        lineBreak();
        System.out.println("[p]lay game");
        System.out.println("[s]ettings");
        System.out.println("[r]ules");
        System.out.println("[q]uit");
        lineBreak();
    }


}
