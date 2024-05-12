package dev.aleksandrtesliuk.Game;

public enum Moves {
    ROCK, PAPER, SCISSORS;

    // Метод для определения победителя
    public static Moves getWinner(Moves player1, Moves player2) {
        if (player1 == player2) return null;
        return switch (player1) {
            case ROCK -> (player2 == SCISSORS) ? player1 : player2;
            case PAPER -> (player2 == ROCK) ? player1 : player2;
            case SCISSORS -> (player2 == PAPER) ? player1 : player2;
        };
    }
}
