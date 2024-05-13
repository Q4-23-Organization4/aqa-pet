package dev.aleksandrtesliuk.GameLogger.core;

import dev.aleksandrtesliuk.GameLogger.IO.IO;
import dev.aleksandrtesliuk.GameLogger.IO.MessageHandler;
import dev.aleksandrtesliuk.GameLogger.commands.Moves;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.config.Configurator;

import java.util.Random;

public class ScissorsPaperRock {
    private static final Logger logger = LogManager.getLogger(ScissorsPaperRock.class);
    private static final Random RANDOM = new Random();
    private static final IO IO_HANDLER = new IO(System.in, System.out);
    private static final MessageHandler MESSAGE_HANDLER = new MessageHandler(IO_HANDLER);

    public static void main(String[] args) {
        Configurator.setLevel(logger.getName(), Level.TRACE);
        logger.trace("Starting game...");
        boolean playAgain = true;
        while (playAgain) {
            try {
                playRound();
            } catch (IllegalArgumentException e) {
                logger.warn("Exception caught: " + e.getMessage());
                MESSAGE_HANDLER.displayMessage(e.getMessage());
            }
            playAgain = askToPlayAgain();
            logger.debug("Play again? " + playAgain);
        }
        logger.trace("Game ended.");
    }

    private static void playRound() {
        logger.trace("Starting a new round.");
        String playerMoveStr = MESSAGE_HANDLER.readInput("Enter your move (ROCK, PAPER, SCISSORS): ").toUpperCase();
        logger.debug("Player move input: " + playerMoveStr);
        Moves playerMove;
        try {
            playerMove = Moves.valueOf(playerMoveStr);
            logger.info("Player move: " + playerMove);
        } catch (IllegalArgumentException e) {
            logger.error("Invalid move: " + playerMoveStr);
            throw new IllegalArgumentException("Invalid move! Please enter ROCK, PAPER, or SCISSORS.");
        }

        Moves computerMove = getRandomMove();
        logger.info("Computer move: " + computerMove);
        MESSAGE_HANDLER.displayMessage("Computer move: " + computerMove);

        Moves winner = Moves.getWinner(playerMove, computerMove);
        if (winner == null) {
            MESSAGE_HANDLER.displayMessage("It's a tie!");
            logger.info("Round result: tie");
        } else if (winner == playerMove) {
            MESSAGE_HANDLER.displayMessage("You win!");
            logger.info("Round result: player wins");
        } else {
            MESSAGE_HANDLER.displayMessage("Computer wins!");
            logger.info("Round result: computer wins");
        }
    }

    private static Moves getRandomMove() {
        int pick = RANDOM.nextInt(Moves.values().length);
        Moves move = Moves.values()[pick];
        logger.debug("Generated random move: " + move);
        return move;
    }

    private static boolean askToPlayAgain() {
        String response = MESSAGE_HANDLER.readInput("Do you want to play again? (yes/no): ").toLowerCase();
        boolean playAgain = response.startsWith("y");
        logger.debug("Play again response: " + response);
        return playAgain;
    }
}
