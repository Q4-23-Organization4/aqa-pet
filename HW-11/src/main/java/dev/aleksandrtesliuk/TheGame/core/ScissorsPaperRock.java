package dev.aleksandrtesliuk.TheGame.core;

import dev.aleksandrtesliuk.TheGame.IO.IO;
import dev.aleksandrtesliuk.TheGame.IO.MessageHandler;
import dev.aleksandrtesliuk.TheGame.commands.Moves;

import java.util.Random;

public class ScissorsPaperRock {
    private static final Random RANDOM = new Random();
    private static final IO IO_HANDLER = new IO(System.in, System.out);
    private static final MessageHandler MESSAGE_HANDLER = new MessageHandler(IO_HANDLER);

    public static void main(String[] args) {
        boolean playAgain = true;
        while (playAgain) {
            try {
                playRound();
            } catch (IllegalArgumentException e) {
                MESSAGE_HANDLER.displayMessage(e.getMessage());
            }
            playAgain = askToPlayAgain();
        }
    }

    private static void playRound() {
        String playerMoveStr = MESSAGE_HANDLER.readInput("Enter your move (ROCK, PAPER, SCISSORS): ").toUpperCase();
        Moves playerMove;
        try {
            playerMove = Moves.valueOf(playerMoveStr);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid move! Please enter ROCK, PAPER, or SCISSORS.");
        }

        Moves computerMove = getRandomMove();
        MESSAGE_HANDLER.displayMessage("Computer move: " + computerMove);

        Moves winner = Moves.getWinner(playerMove, computerMove);
        if (winner == null) {
            MESSAGE_HANDLER.displayMessage("It's a tie!");
        } else if (winner == playerMove) {
            MESSAGE_HANDLER.displayMessage("You win!");
        } else {
            MESSAGE_HANDLER.displayMessage("Computer wins!");
        }
    }

    private static Moves getRandomMove() {
        int pick = RANDOM.nextInt(Moves.values().length);
        return Moves.values()[pick];
    }

    private static boolean askToPlayAgain() {
        String response = MESSAGE_HANDLER.readInput("Do you want to play again? (yes/no): ").toLowerCase();
        return response.startsWith("y");
    }
}
