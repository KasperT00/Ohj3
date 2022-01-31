/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author kaspe
 */
public class Course {
    private String code = null;
    private String name = null;
    private int credits;
    Course(String code, String name, int credits){
        this.code = code;
        this.name = name; 
        this.credits = credits;
    }
    public String getCode(){
        return this.code;
    }
    public String getName(){
        return this.name;
    }
    public int getCredits(){
        return this.credits;
    }
}
