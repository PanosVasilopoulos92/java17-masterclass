package section6_controlflow;

/*
* Practicing traditional switch statement
*/
public class Lesson58Challenge {

    public static void main(String[] args) {
        System.out.println(convertToNATOAlphabet('A'));
    }

    public static String convertToNATOAlphabet(char character) {
        String word;

        switch (character) {
            case 'A':
                word = "Able";
                break;
            case 'B':
                word = "Baker";
                break;
            case 'C':
                word = "Charlie";
                break;
            case 'D':
                word = "Dog";
                break;
            case 'E':
                word = "Easy";
                break;
            case 'Z':
            case 'O':
            case 'L':
                word = "testing multiple cases";
                break;
            default:
                return "invalid character";
        }

        return word;
    }
}
