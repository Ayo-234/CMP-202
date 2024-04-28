
public class Main {
    public static void main(String[] args) {

        User user = new User();
        String loginResult = user.login();
        System.out.println(loginResult);
    }

    static class User { // method
        String username = "johndoe"; // String data type
        String password = "password";

        String login() {
            if (username.equals("johndoe") && password.equals("password")) {
                return "Login successful";
            } else {
                return "Invalid username or password. please try again";
            }
        }
    }
}
