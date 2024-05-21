package oop_3;

// hiding sensitive data
public class Person {
    private String name;
    private String password;
    private String matricNo;

    String getName(){
        return name;
    }
    
    void setName(String name) {
        this.name = name;
    }
    void setPassword(String password) {
        this.password = password;
    }

    Person(String name, String password, String matricNo){
        this.name = name;
        this.matricNo = matricNo;
        this.password = password;
    }

    // public static void main(String[] args) {
    //     Person person = new person();
    //     person.name = "John";
    //     person.password = "123456789";
    // }
}
