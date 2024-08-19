package section5;

public class Lesson48Challenge {

    public static void main(String[] args) {
        int panosPosition = calculateHighScorePosition(300);
        int angelikiPosition = calculateHighScorePosition(3000);

        displayHighScorePosition("Panos", panosPosition);
        displayHighScorePosition("Angeliki", angelikiPosition);

        int position = calculateHighScorePosition(500);
        displayHighScorePosition("Efraim", position);

        position = calculateHighScorePosition(1200);
        displayHighScorePosition("Maria", position);

        position = calculateHighScorePosition(30);
        displayHighScorePosition("Unknown", position);

    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to reach position number " + position);
    }

    public static int calculateHighScorePosition(int score) {
        int position;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        } else {
            position = 4;
        }

        return position;
    }
}