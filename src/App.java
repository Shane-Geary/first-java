import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String pupName = "Gracie";
        int pupAge = 2;
        double pupFluff = 8.2;
        boolean pupIsGoof = true;
        char pupFirstInitial = pupName.charAt(0);

        System.out.println("Pup's Name- " + pupName);
        System.out.println("Pup's Initial- " + pupFirstInitial);
        System.out.println("Pup's Age- " + pupAge);
        System.out.println("Pup's Fluff- " + pupFluff);
        System.out.println("Pup is Goof?- " + pupIsGoof);

        Scanner input = new Scanner(System.in);
    }
}
