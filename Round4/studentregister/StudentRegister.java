/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author kaspe
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map;


public class StudentRegister {
    private ArrayList<Course> kurssit;
    private HashMap<String, Student> opiskelijat;
    private HashMap<Student, ArrayList<Attainment>> rekisteri;
    private HashMap<String, Course> kurssikoodi;
    StudentRegister(){
        this.kurssit = new ArrayList<>();
        this.opiskelijat = new HashMap<String, Student>();
        this.rekisteri = new HashMap<Student, ArrayList<Attainment>>();
        this.kurssikoodi = new HashMap<String, Course>();
    }
    
    public ArrayList<Student> getStudents(){
        ArrayList<Student> oppilaat = new ArrayList<>(this.rekisteri.keySet());
        Collections.sort(oppilaat, (a,b)->{
            return a.getName().compareTo(b.getName());
        });
        return oppilaat;
    }
    
    public ArrayList<Course> getCourses(){
        Collections.sort(this.kurssit, (a, b)->{
            return a.getName().compareTo(b.getName());
        });
        return this.kurssit;
    }
    
    public void addStudent(Student student){
        ArrayList<Attainment> uusi = new ArrayList<>();
        this.opiskelijat.put(student.getStudentNumber(), student);
        this.rekisteri.put(student, uusi);
    }
    
    public void addCourse(Course course){
        this.kurssit.add(course);
        String koodi = course.getCode();
        this.kurssikoodi.put(koodi, course);
    }
    
    public void addAttainment(Attainment att){
        String studentnro = att.getStudentNumber();
        Student s = this.opiskelijat.get(studentnro);
        rekisteri.get(s).add(att);
    }
    
    
    public void printStudentAttainments(String studentNumber, String order){
        Student stud = this.opiskelijat.get(studentNumber);
        if(stud != null){
            System.out.format("%s (%s):%n", stud.getName(), studentNumber);
            
            ArrayList<Attainment> suoritukset = this.rekisteri.get(stud);
            TreeMap<String, Attainment> temp = new TreeMap<>();
            for(var suoritus : suoritukset){
                Course koodi = this.kurssikoodi.get(suoritus.getCourseCode());
                temp.put(koodi.getName(), suoritus);
            }
            ArrayList<Attainment> k = new ArrayList<>(temp.values());
            
            TreeMap<String, Attainment> temp2 = new TreeMap<>();
            for(var suoritus : suoritukset){
                
                temp2.put(suoritus.getCourseCode(), suoritus);
            }
            ArrayList<Attainment> l = new ArrayList<>(temp2.values());

            if("by code".equals(order)){
                suoritukset = l;
            }
            else if("by name".equals(order)){
                suoritukset = k;
            }
            for(var suoritus : suoritukset){
                String nimi = this.kurssikoodi.get(suoritus.getCourseCode()).getName();
                System.out.format("  %s %s: %d%n", suoritus.getCourseCode(), nimi, suoritus.getGrade());
            }
        }
        else{
            System.out.println("Unknown student number: " + studentNumber);
        }  
    }
    
    public void printStudentAttainments(String studentNumber){
        printStudentAttainments(studentNumber, null);
    }
    
}
