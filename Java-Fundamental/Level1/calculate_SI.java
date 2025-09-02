import java.util.Scanner;

public interface calculate_SI {
    double simpleInterest(double principal, double rate, double time);
}

class SimpleInterestCalculator implements calculate_SI {
    @Override
    public double simpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time: ");
        double time = sc.nextDouble();

        SimpleInterestCalculator calc = new SimpleInterestCalculator();
        double si = calc.simpleInterest(principal, rate, time);

        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f and Time %.2f%n", si, principal, rate, time);

        sc.close();
    }
}
