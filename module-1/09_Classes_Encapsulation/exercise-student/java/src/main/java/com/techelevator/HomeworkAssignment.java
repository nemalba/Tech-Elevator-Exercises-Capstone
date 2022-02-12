package com.techelevator;

public class HomeworkAssignment {
// Implement the HomeworkAssignment class

    private int earnedMarks; // The total number of correct marks submitter received on the assignment.
    private int possibleMarks; //The number of possible marks on the assignment.
    private String submitterName; //The submitter's name for the assignment.
    //private String letterGrade ; // The letter grade for the assignment.


    public HomeworkAssignment(int possibleMarks, String submitterName) {
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }

    public void setEarnedMarks(int earnedMarks){
        this.earnedMarks = earnedMarks;
    }

    public int getEarnedMarks(){
        return this.earnedMarks;
    }

    public int getPossibleMarks() {
        return possibleMarks;
    }

    public String getSubmitterName() {
        return submitterName;
    }

    public String getLetterGrade() {

        int percent = (int)(((double)earnedMarks / possibleMarks) * 100);

        if(percent >89){
           return "A";
        } else if(percent >79 && percent<90){
            return "B";
        } else if(percent >69 && percent<80){
            return "C";
        }else if(percent >59 && percent<70) {
            return "D";
        } else

        return "F";
    }
}
