package dev.aleksandrtesliuk.FirstTask;

interface Mobile {
    void makeCall(String number);
    void sendMessage(String number, String message);
    String getOperatingSystem();
}
