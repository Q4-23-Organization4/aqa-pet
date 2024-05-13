package dev.aleksandrtesliuk.GameLogger.commands;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public enum Moves {
    ROCK, PAPER, SCISSORS;

    private static final Logger logger = LogManager.getLogger(Moves.class);

    public static Moves getWinner(Moves player1, Moves player2) {
        logger.debug("Evaluating winner between " + player1 + " and " + player2);
        if (player1 == player2) {
            logger.info("It's a tie.");
            return null;
        }

        Moves winner = null;

        switch (player1) {
            case ROCK -> winner = (player2 == SCISSORS) ? player1 : player2;
            case PAPER -> winner = (player2 == ROCK) ? player1 : player2;
            case SCISSORS -> winner = (player2 == PAPER) ? player1 : player2;
            default -> logger.error("Unexpected move: " + player1);
        }
        logger.info("Winner: " + winner);
        return winner;
    }
}
