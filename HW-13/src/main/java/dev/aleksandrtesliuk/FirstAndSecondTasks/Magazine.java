package dev.aleksandrtesliuk.FirstAndSecondTasks;

class Magazine implements Printable {
    private final String title;

    public Magazine(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void print() {
        System.out.println("Magazine Title: " + title);
    }

    public static void printMagazines(Printable[] printables) {
        for (Printable p : printables) {
            if (p instanceof Magazine) {
                // Using a Method Reference
                p.print();
            }
        }
    }
}
