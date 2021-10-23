import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        String question = "What data type is 'String' in Java?";
        String answerOne = "Primitive Type";
        String answerTwo = "Class Type";
        String answerThree = "Reference Type";

        String correctAnswer = answerThree;

        System.out.println(question);
        System.out.println("Input the number of your chosen answer:");
        System.out.println("1. " + answerOne);
        System.out.println("2. " + answerTwo);
        System.out.println("3. " + answerThree);

        Scanner scanner = new Scanner(System.in);

        int inputtedNum = scanner.nextInt();

        if(inputtedNum == 3) {
            System.out.println("That is Correct!");
        } else {
            System.out.println("That is Incorrect. The Correct Answer is " + correctAnswer);
        }
    }
}
