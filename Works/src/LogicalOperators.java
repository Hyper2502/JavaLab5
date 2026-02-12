public class LogicalOperators {
    public static void main(String[] args) {
        boolean username = false;
        boolean password = true;

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Login allowed: " + (username && password));
        System.out.println("At least one field filled " + (username || password));
        System.out.println("No password: " + !username);
        System.out.println("No username: " + !password);
    }
}

/*
The Output is:
Username: false
Password: true
Login allowed: false
At least one field filled true
No password: true
No username: false
 */