import jdk.jfr.Percentage;

import java.util.Scanner;

public class Marksheet {
/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if
 * %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */
public static void main(String[] args) {
    // scanner declaration
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Student Name" );
    String name = scanner.next();
    System.out.println("Enter Student Roll no");
    int rollNum  = scanner.nextInt();
    System.out.println("Enter MArks of Subject Maths");
    int  mathsMarks  = scanner.nextInt();
    if (mathsMarks <0 || mathsMarks >100) {
        System.out.println(" Invalid input, Marks should be between 0 and 100.");
        System.out.println("Please enter correct Marks");
        mathsMarks = scanner.nextInt();
    }

    System.out.println("Enter Marks of Subject Science ");
    int scienceMarks = scanner.nextInt();
    if (mathsMarks <0 || mathsMarks >100) {
        System.out.println(" Invalid input, Marks should be between 0 and 100.");
        System.out.println("Please enter correct Marks");
        mathsMarks = scanner.nextInt();
        scienceMarks = scanner.nextInt();
    }
    System.out.println("Please Enter Marks of Subject English");
    int englishMarks = scanner.nextInt();
    if (englishMarks <0 || englishMarks >100) {
        System.out.println(" Invalid input, Marks should be between 0 and 100.");
        System.out.println("Please enter correct Marks");
        englishMarks = scanner.nextInt();
    }
    int total = sum(mathsMarks,englishMarks,scienceMarks);
    int percentage = (total *100) / 300;
    String result = calculateResult(mathsMarks, scienceMarks, englishMarks);
    String grade =  calculateGrade(percentage, result);
    printTheMarkSheet(name, rollNum, mathsMarks, scienceMarks, englishMarks, total, percentage, result, grade);
    //Closing the scanner object
    scanner.close();
}
// calculating the sum
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
    public static String calculateResult(int mathsMarks, int scienceMarks, int englsihMarks){
    if (mathsMarks<35 || scienceMarks<35 || englsihMarks<35 ) {
        return "Fail";
    }else{
            return "Pass";

        }
    }
// Calculating the grade on Percentage and Result
    public static String calculateGrade(int percentage, String result) {
        String grade = null;
        if (result.equalsIgnoreCase("Pass")) {
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage > 35) {
                grade = "C";
            } else {
                grade = "-";
            }}
            return grade;
        }

        // Printing the Marks sheet
        public static void printTheMarkSheet(String name, int rollNum, int mathsMarks, int scienceMarks,
        int englishMarks, double total, double percentage, String result,
                String grade) {
            System.out.println("-----------------------------");
            System.out.println("|                           |");
            System.out.println("| Mark Sheet                |");
            System.out.println("|___________________________|");
            System.out.println("| Name:" + name + "                  |");
            System.out.println("| Roll No:" + rollNum + "                |");
            System.out.println("|___________________________|");
            System.out.println("| Subjects: Marks           |");
            System.out.println("|___________________________|");
            System.out.println("| Math:" + mathsMarks + "                   |");
            System.out.println("| Science:" + scienceMarks + "                |");
            System.out.println("| English:" + englishMarks + "                |");
            System.out.println("|___________________________|");
            System.out.println("| Total:" + total + "             |");
            System.out.println("|___________________________|");
            System.out.println("| Percentage:" + percentage + "           |");
            System.out.println("| Result:" + result + "               |");
            System.out.println("| Grade:" + grade + "                  |");
            System.out.println("|___________________________|");
        }



}
