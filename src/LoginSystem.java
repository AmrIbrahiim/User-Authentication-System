import java.util.ArrayList;
import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<User> users = new ArrayList<>();
        users.add(new User("admin", "1234"));

        int attempts =3;
        boolean LoggedIn = false;

        while (attempts > 0 && !LoggedIn) {
            System.out.print("Enter your username: ");
            String username = input.nextLine();

            System.out.print("Enter your password: ");
            String password = input.nextLine();
            for (User user : users) {
                if(user.authenticate(username, password)) {
                    System.out.println("Logged in successfully");
                    LoggedIn = true;
                    break;
                }
            }
            if (!LoggedIn) {
                attempts--;
                System.out.println("Invalid credentials. Attempts left: " + attempts);
            }

        }
        if (!LoggedIn) {
            System.out.println("Attempt failed. Please try again.");
        }
        input.close();
    }
}
