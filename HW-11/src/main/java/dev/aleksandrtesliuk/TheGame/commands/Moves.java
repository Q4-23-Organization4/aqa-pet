package dev.aleksandrtesliuk.TheGame.commands;

public enum Moves {
    ROCK, PAPER, SCISSORS;

    public static Moves getWinner(Moves player1, Moves player2) {
        if (player1 == player2) return null;
        switch (player1) {
            case ROCK:
                return (player2 == SCISSORS) ? player1 : player2;
            case PAPER:
                return (player2 == ROCK) ? player1 : player2;
            case SCISSORS:
                return (player2 == PAPER) ? player1 : player2;
        }
        return null;
    }
}
