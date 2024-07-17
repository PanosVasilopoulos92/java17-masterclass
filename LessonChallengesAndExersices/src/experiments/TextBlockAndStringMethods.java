package experiments;

public class TextBlockAndStringMethods {

    public static void main(String[] args) {
        String textBlock = """
                This is a test
                    in creating a \n
                        textBlock.""";

        System.out.println(textBlock);
        System.out.println();

        int age = 32;
        String formattedString = String.format("My age is currently %d", age);
        System.out.println(formattedString);

        String testingStringMethods = "    Hello world!!     ";
        System.out.println(testingStringMethods.contains("q"));
        System.out.println(testingStringMethods.repeat(2));
        System.out.println(testingStringMethods.substring(0, 5));
        System.out.println(testingStringMethods.length());
        System.out.println(testingStringMethods.toUpperCase());
        System.out.println(testingStringMethods.charAt(0));
        System.out.println(testingStringMethods.concat(" I am Panos"));
        System.out.println(testingStringMethods.compareTo("hi!"));
        System.out.println(testingStringMethods.replace("o", "0"));

        testingStringMethods = testingStringMethods.replace("o", "0");
        System.out.println(testingStringMethods.endsWith("!"));
        System.out.println(testingStringMethods.equals("Hello world!!"));
        System.out.println(testingStringMethods.contentEquals("Hell0 w0rld!!"));
        System.out.println(testingStringMethods.lastIndexOf("!"));

        System.out.println(testingStringMethods.stripTrailing());
        System.out.println(testingStringMethods.stripLeading());
        System.out.println(testingStringMethods.strip());

        String date = String.join("/", "01", "05", "2024");
        System.out.println(date);

    }
}
