import java.util.Scanner;
/**
 * Write a description of class UserInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UserInput
{

    public UserInput(Scanner input)
    {
        // initialise instance variables
        //Scanner input = new Scanner(System.in);

        String user;
        String pass;
        boolean loggedIn = false;
        do {
        System.out.println("Enter username: ");
        user = input.nextLine();
        
        System.out.println("Enter password: ");
        pass = input.nextLine();
        
        if  (user.equals("Hannah") && pass.equals("Hay"))
        {
            System.out.println("You are logged in");
        }
        else
        {
            System.out.println("Incorect, try again");

        }
    } while (loggedIn);
}
}