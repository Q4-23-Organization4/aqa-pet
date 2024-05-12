package dev.aleksandrtesliuk.FirstAndSecondTasks;

class Book implements Printable {
    private final String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void print() {
        System.out.println("Book Title: " + title);
    }

    public static void printBooks(Printable[] printables) {
        for (Printable p : printables) {
            if (p instanceof Book) {
                // Using a Method Reference
                p.print();
            }
        }
    }
}
