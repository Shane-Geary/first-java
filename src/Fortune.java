import java.util.Scanner;

public class Fortune {
    public static void main(String[] args) {
        System.out.println("Pick a numberbetween 1 and 10");
        Scanner scanner = new Scanner(System.in);

        int inputtedNum = scanner.nextInt();

        if(inputtedNum <= 5) {
            System.out.println("Lots of coffee in your future");
        } else {
            System.out.println("Lots of guacamole in your future");
        }
    }
}
