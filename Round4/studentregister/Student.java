/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author kaspe
 */
public class Student {
    private String name = null;
    private String studentNro;
    Student(String name, String studentNumber){
        this.name = name;
        this.studentNro = studentNumber;
    }
    public String getName(){
        return this.name;
    }
    public String getStudentNumber(){
        return this.studentNro;
    }
}
