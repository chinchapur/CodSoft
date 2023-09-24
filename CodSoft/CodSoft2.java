import java.util.Scanner;

public class CodSoft2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int numberogfSub = sc.nextInt();

        int marks[] = new int[numberogfSub];

        for (int i = 0; i < numberogfSub; i++) {
            System.out.print("Enter the marks obtained in subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            if(marks[i]>100 || marks[i]<0){
                System.out.print("Enter marks in range 0 - 100: ");
                marks[i] = sc.nextInt();
            }
        }


        // Calculate the total marks.
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        System.out.println("Total marks obtained: " + totalMarks);

        // Calculate the average percentage.
        float avg = (float) totalMarks / numberogfSub;
        System.out.println("Average percentage obtained: " + avg + "%");

        if (avg >= 90) {
            System.out.println("Grade A");
        }

        else if (avg >= 70 && avg < 90) {
            System.out.println("Grade B");
        }

        else if (avg >= 50 && avg < 70) {
            System.out.println("Grade C");
        }

        else {
            System.out.println("Grade D");
        }

    }
}
