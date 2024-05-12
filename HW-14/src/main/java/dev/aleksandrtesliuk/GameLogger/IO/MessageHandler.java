package dev.aleksandrtesliuk.GameLogger.IO;

public class MessageHandler {
    private final IO io;

    public MessageHandler(IO io) {
        this.io = io;
    }

    public void displayMessage(String message) {
        io.write(message);
    }

    public String readInput(String prompt) {
        io.write(prompt);
        return io.read();
    }
}