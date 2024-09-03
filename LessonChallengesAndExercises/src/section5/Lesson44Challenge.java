package section5;

public class Lesson44Challenge {

    public static void main(String[] args) {

        boolean isGameOver = true;
        int score = 10_000;
        int levelCompleted = 8;
        int bonus = 200;

        int finalScore = score;

        printGameBegins();
        System.out.println();

        String bonusInStringForm = displayBonus("Panos", levelCompleted);
        System.out.println(bonusInStringForm);

        if (isGameOver) {
            finalScore += (levelCompleted * bonus);
            displayFinalScore(finalScore);
        }

    }

    public static void printGameBegins() {
        System.out.println("Game begins!");
    }

    public static void displayFinalScore(int finalScore) {
        System.out.println("Your final score is " + finalScore);
    }

    public static String displayBonus(String name, int level) {
        if (level > 2 && level < 5) {
            return name + ", you got 100 bonus points.";
        } else if (level >= 5) {
            return name + ", you got 200 bonus points.";
        } else {
            return "You get no bonus " + name;
        }
    }
}
