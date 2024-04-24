package net.therapconnect.testing;

public class Grader {
    public char determineLetterGrade(int marks_number) {
//        if(marks_number == 0){
//            throw new IllegalArgumentException("Why did you not study?");
//        }
        if(marks_number < 0){
            throw new IllegalArgumentException("Number cannot be negative");
        }
        if (marks_number < 60) {
            return 'F';
        }
        if (marks_number < 90) {
            return 'B';
        }
        else return 'A';
    }
}
