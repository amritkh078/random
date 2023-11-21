import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // grade constants
        final int A_GRADE = 90;
        final int B_GRADE = 80;
        final int C_GRADE = 60;
        final int D_GRADE = 40;

        int totalmarks = 0;
        int numofsubj ;
        double avg;

        // input the number of subjects
        System.out.print("Enter the number of subjects: ");
        numofsubj = sc.nextInt();

        for (int i=1; i<=numofsubj; i++){
            System.out.print("Enter marks obtained" + i + ": ");
            int marks = sc.nextInt();
            totalmarks +=marks;
        }

        avg = ((double)totalmarks /  numofsubj);

        // determine the grade based on percentage
        char grade;
        if(avg >=A_GRADE){
            grade = 'A';
        } else if (avg >= B_GRADE) {
            grade = 'B';
        }else if (avg >= C_GRADE) {
            grade = 'C';
        }else if (avg >= D_GRADE) {
            grade = 'D';
        }else{
            grade = 'F';
        }

        // display results
        System.out.println("\nResults:");
        System.out.println("Total Marks Obtained: " + totalmarks);
        System.out.println("Average Percentage: " + avg + "%");
        System.out.println("Grade: " + grade);

        sc.close();

    }
}