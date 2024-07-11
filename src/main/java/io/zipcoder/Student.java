package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student implements Comparable<Student> {

    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;
    private int numberOfExamsTaken;


    public Student (String first, String last, Double[] testScores){
        this.firstName = first;
        this.lastName = last;
        this.examScores = new ArrayList<>(Arrays.asList(testScores));
    }

    public void setFirstName (String first){
        this.firstName = first;
    }

    public String getFirstName (){
        return firstName;
    }

    public void setLastName (String last){
        lastName = last;
    }

    public String getLastName (){
        return lastName;
    }

    public ArrayList<Double> getExamScores() {
        return examScores;
    }

    public int getNumbersOfExamsTaken(){
        return numberOfExamsTaken;
    }

   public void addExamScore(double examScore){
        examScores.add(examScore);
   }

   public void setExamScore (int exam, double score){
        examScores.set(exam,score);
   }

   public double getAverageExamScore(){
        double sum = 0;
        if (examScores.isEmpty()){
            return 0.0;
        }
        for (double x : examScores){
            sum += x;
        }
        return sum / examScores.size();
   }

   public String toString(){
        return (firstName + "\n" + lastName + "\n" + getAverageExamScore() + "\n" + examScores);
   }


    @Override
    public int compareTo(Student otherStudent) {
        int averageScore;
        if (this.getAverageExamScore() < otherStudent.getAverageExamScore()){
            averageScore = (int)otherStudent.getAverageExamScore();
        } else {
            averageScore = (int)this.getAverageExamScore();
        }
        return averageScore;
    }
}
