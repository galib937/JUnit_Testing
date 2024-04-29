package net.therapconnect.testing;

public class Grader {
    public char determineLetterGrade(int marksNumber) {
//        if(marks_number == 0){
//            throw new IllegalArgumentException("Why did you not study?");
//        }
        if(marksNumber < 0){
            throw new IllegalArgumentException("Number cannot be negative");
        }
        if (marksNumber < 60) {
            return 'F';
        }
        if (marksNumber < 90) {
            return 'B';
        }
        else return 'A';
    }
}
