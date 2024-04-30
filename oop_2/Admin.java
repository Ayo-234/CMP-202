package oop_2;

public class Admin extends User {

    String StaffNo = "12345678";
    
    void uploadResult(String course, float score){

        System.out.println(course + " " + score);
    }
    
}
