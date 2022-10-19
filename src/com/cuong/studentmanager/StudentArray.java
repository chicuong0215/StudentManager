package com.cuong.studentmanager;

import java.util.ArrayList;

public class StudentArray {
    private ArrayList<Student> students= new ArrayList<>();
    public ArrayList<Student> getStudents(){
        return students;
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void removeStudent(int index){
        students.remove(index);
    }
}
