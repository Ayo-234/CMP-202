package oop_2;

public class User {
    String name;
    
    String password;

    String login() {
        return "logged In";
    }

    String Register() {
        if (name.equals("") || password.equals("")) {
            return "Can't be empty";
        }
        else{ 
            return "Success";
        }
    }
    
}
