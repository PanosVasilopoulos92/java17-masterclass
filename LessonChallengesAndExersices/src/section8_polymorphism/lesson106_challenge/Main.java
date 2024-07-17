package section8_polymorphism.lesson106_challenge;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(20, 20, true);
        System.out.println(printer);

        printer.addToner(80);

        printer.printPages(100);
        int amountOfTotalPagesPrinted = printer.printPages(200);

        amountOfTotalPagesPrinted += printer.printPages(2000);
        System.out.println(amountOfTotalPagesPrinted);

    }
}
