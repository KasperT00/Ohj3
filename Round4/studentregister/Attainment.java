/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author kaspe
 */
public class Attainment {
    private String coursecode = null; 
    private String studentNro = null;
    private int Grade; 
    Attainment(String courseCode, String studentNumber, int grade){
        this.coursecode = courseCode;
        this.studentNro = studentNumber;
        this.Grade = grade;
    }
    public String getCourseCode(){
        return this.coursecode;
    }
    public String getStudentNumber(){
        return this.studentNro;
    } 
    public int getGrade(){
        return this.Grade;
    }
}
