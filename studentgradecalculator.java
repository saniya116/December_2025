public class StudentGradeCalculator {
    public static void main(String[] args) {
        int marks = 86;
        char grade = calculateGrade(marks);
        displayResult(marks, grade);
    }
    private static char calculateGrade(int marks) {
        if (marks >= 90) return 'A';
        if (marks >= 80) return 'B';
        if (marks >= 70) return 'C';
        if (marks >= 60) return 'D';
        return 'F';
    }
   private static void displayResult(int marks, char grade) {
        System.out.println("Marks : " + marks);
        System.out.println("Grade : " + grade);
    }
}
