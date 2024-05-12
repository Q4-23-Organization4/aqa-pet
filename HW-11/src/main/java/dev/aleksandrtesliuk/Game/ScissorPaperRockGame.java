package dev.aleksandrtesliuk.Game;

import java.util.Random;
import java.util.Scanner;

public class ScissorPaperRockGame {
    private static final Random RANDOM = new Random();
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        boolean playAgain = true;
        while (playAgain) {
            try {
                playRound();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            playAgain = askToPlayAgain();
        }
    }

    private static void playRound() {
        System.out.print("Enter your move (ROCK, PAPER, SCISSORS): ");
        String playerMoveStr = SCANNER.nextLine().toUpperCase();
        Moves playerMove;
        try {
            playerMove = Moves.valueOf(playerMoveStr);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid move! Please enter ROCK, PAPER, or SCISSORS.");
        }

        Moves computerMove = getRandomMove();
        System.out.println("Computer move: " + computerMove);

        Moves winner = Moves.getWinner(playerMove, computerMove);
        if (winner == null) {
            System.out.println("It's a tie!");
        } else if (winner == playerMove) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }

    private static Moves getRandomMove() {
        int pick = RANDOM.nextInt(Moves.values().length);
        return Moves.values()[pick];
    }

    private static boolean askToPlayAgain() {
        System.out.print("Do you want to play again? (yes/no): ");
        String response = SCANNER.nextLine().toLowerCase();
        return response.startsWith("y");
    }
}

