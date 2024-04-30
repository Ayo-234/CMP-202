
public class Hello {
        // Data types
        int age; // primitive data type
        float height; // primitive data type
        String name; // object
        String password;

        void printUserData() { // method
            age = 23;
            height = 170;
            name = "James";
            int nameLength = name.length();

            password = "123456";
            if (password.contains("123456") || password.contains("abcdef")) {
                System.out.println("Your password is too easy");
            }
        }

}