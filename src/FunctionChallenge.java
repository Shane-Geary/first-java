public class FunctionChallenge {

    public static double salaryCalculator(double hoursPerWeek, double amountPerHour) {
        double weeklyPaycheck = hoursPerWeek * amountPerHour;
        return weeklyPaycheck * 52;
    }
    public static void main(String[] args) {
        double salary = salaryCalculator(40, 25);
        System.out.println(salary);
    }
}
