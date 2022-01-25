import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        double weight;
        double height;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        weight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        height = input.nextDouble();
        BMI newBMI = new BMI(weight, height);
        System.out.format("BMI is %.10f\n", newBMI.getBMI());
        System.out.format("%s\n", newBMI.getBMIRating());
    }
}
