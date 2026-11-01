import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String studentName;
        double score1, score2, score3;

        System.out.print("Enter student name: ");
        studentName = input.nextLine();

        System.out.print("Enter first score: ");
        score1 = input.nextDouble();

        System.out.print("Enter second score: ");
        score2 = input.nextDouble();

        System.out.print("Enter third score: ");
        score3 = input.nextDouble();

        double total = score1 + score2 + score3;
        double average = total / 3.0;

        System.out.println("Student Name: " + studentName);
        System.out.println("Total Score: " + total);
        System.out.println("Average Score: " + average);

        input.close();
    }
}