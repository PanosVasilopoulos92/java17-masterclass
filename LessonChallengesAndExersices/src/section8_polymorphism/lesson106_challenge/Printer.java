package section8_polymorphism.lesson106_challenge;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplexPrinter;

    public Printer(int tonerLevel, int pagesPrinted, boolean isDuplexPrinter) {
        if (tonerLevel < 0) {
            this.tonerLevel = 0;
        } else if (tonerLevel > 100) {
            this.tonerLevel = 100;
        } else {
            this.tonerLevel = tonerLevel;
        }

        this.pagesPrinted = pagesPrinted;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public int addToner(int tonerAmount) {
        if ((tonerAmount < 0) || ((tonerAmount + tonerLevel) > 100)) {
            System.out.println("Invalid input of toner amount.");
            return -1;
        } else {
            System.out.printf("Toner is now at %d%%\n", tonerLevel + tonerAmount);
            return tonerLevel + tonerAmount;
        }
    }

    public int printPages(int pagesToBePrinted) {
        if (isDuplexPrinter) {
            System.out.println("Printer is duplex.");
        }

        if (pagesToBePrinted <= 0) {
            System.out.println("Invalid input in number of pages to be printed.");
            return -1;
        } else {
            System.out.printf("%d pages will be printing soon...\n", pagesToBePrinted);
            return pagesPrinted + pagesToBePrinted; // returns the total amount of pages that were ever printed by this printer.
        }
    }

    @Override
    public String toString() {
        return "Printer{" +
                "tonerLevel=" + tonerLevel +
                ", pagesPrinted=" + pagesPrinted +
                ", isDuplexPrinter=" + isDuplexPrinter +
                '}';
    }
}
