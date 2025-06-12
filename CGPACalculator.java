import java.util.Scanner;

public class CGPACalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("🎓 CGPA Calculator");

        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();

        double[] grades = new double[numSubjects];
        int[] credits = new int[numSubjects];

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter grade point for subject " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();

            System.out.print("Enter credit for subject " + (i + 1) + ": ");
            credits[i] = scanner.nextInt();
        }

        double totalGradePoints = 0;
        int totalCredits = 0;

        for (int i = 0; i < numSubjects; i++) {
            totalGradePoints += grades[i] * credits[i];
            totalCredits += credits[i];
        }

        double cgpa = (totalCredits == 0) ? 0 : totalGradePoints / totalCredits;
        System.out.printf("Your CGPA is: %.2f\n", cgpa);

        scanner.close();
    }
}
