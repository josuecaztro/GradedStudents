package io.zipcoder;

import java.util.ArrayList;

public class Student {

    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;
    private int numberOfExamsTaken;


    public Student (String firstName, String lastName, Double[] testScores){

    }

    public void setFirstName (String firstName){
        this.firstName = firstName;
    }

    public String getFirstName (){
        return firstName;
    }

    public void setLastName (String lastName){
        this.lastName = lastName;
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
        for (double x : examScores){
            sum += x;
        }
        return sum / examScores.size();
   }

   public String toString(){
        return (firstName + "\n" + lastName + "\n" + getAverageExamScore() + "\n" + examScores);
   }






}
