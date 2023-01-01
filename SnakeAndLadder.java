package com.ProgrammingConstruct;

import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("...Welcome To Snake And Ladder Game...");
        Random Random = new Random();

        //UC1 Game start with single player at zero position
        int player = 0;
        System.out.println("Player position => " + player);

        //UC2 Player rolls the dice to get a number between 1 and 6
        int dice = Random.nextInt(6) + 1;
        System.out.println("Player get the number " + dice);
        //UC3 Player check for the option
        //1) No play case
        //2) Ladder case
        //3)Snake case

        int game = Random.nextInt(3) + 1;
        System.out.println("Player get the option "+game);
        // No Play case
        switch (game) {
            case 1 -> {
                player += 0;
                System.out.println("New Score of Player is => " + player);
            }
            // Ladder Case
            case 2 -> {
                player = player + dice;
                System.out.println("New Score of Player is => " + player);
            }
            // Snake Case
            case 3 -> {
                player = player - dice;
                System.out.println("New Score of Player is => " + player);
            }
        }
    }
}
