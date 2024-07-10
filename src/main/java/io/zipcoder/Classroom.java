package io.zipcoder;

import java.util.ArrayList;

public class Classroom {

    private Student[] students;


    public Classroom(int maxNumberOfStudents){

    }

    public Classroom(Student[] students){

    }

    public Classroom() {
        this.students = new Student[30];
    }

    public int getStudents(){
        return students.length;
    }

    public double getAverageExamScore (){
        double sum = 0;
        for (Student x : students){
            sum += x.getAverageExamScore();
        }
        return sum / students.length;
    }

    public void addStudent (Student student){
        ArrayList<Student> studentsList = new ArrayList<>();
        studentsList.add(student);
        studentsList.toArray(students);
    }

    //testing
//
//    public void removeStudent (String firstName, String lastName){
//        ArrayList<Student> studentsList = new ArrayList<>();
//
//        studentsList.toArray(students);
//    }


}
