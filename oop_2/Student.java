package oop_2;

public class Student extends User {
    String matriNo = "BHU/22/04/05/0004";
    
    String addmissionNo = "234567887";

    String registerCourse(){
        if (matriNo.equals("") || addmissionNo.equals("")) {
            return "you can't register this course";
        }
        else{ 
            return "Success";
        }
    }

    public String checkResult(String password){
        if (matriNo.equals("") || password.equals("")) {
            return "Can't be empty";
        }
        else{ 
            return "You can check your result";
        }
    }

    
}
