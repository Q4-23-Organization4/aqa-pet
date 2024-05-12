package dev.aleksandrtesliuk.GameLogger.IO;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class IO {
    private final Scanner scanner;

    private final PrintStream output;

    public IO(InputStream input, OutputStream output) {
        this.scanner = new Scanner(input);
        this.output = new PrintStream(output);
    }

    public String read() {
        return scanner.nextLine();
    }

    public void write(String message) {
        output.println(message);
    }
}

