package experiments;

public class TestStringBuilder {

    public static void main(String[] args) {
        String testText = "Hi!";
        StringBuilder stringBuilder = new StringBuilder("Hi!");
        System.out.println(stringBuilder.equals(testText));
//        System.out.println(testText == stringBuilder);

        System.out.println(stringBuilder.hashCode());
        System.out.println(testText.hashCode());

        stringBuilder.append(" My name is Panos.");
        stringBuilder.append(" It's nice to meet you unknown friend.");

        System.out.println(stringBuilder);
    }
}
