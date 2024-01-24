import java.util.Scanner;

public class OTS {
    private Scanner scanner;
    private Event event;
    private Consumer consumer;

    public OTS() {
        scanner = new Scanner(System.in);
        event = new Event();
    }

    public void choice() {
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Login();
                    break;
                case 2:
                    Seats();
                    break;
                case 3:
                    event.run();
                    break;
                case 4:
                    ProfileInfo();
                    break;
                case 0:
                    System.out.println("Quit");
                    return;
                default:
                    System.out.println("Invalid choice, please enter choice 1-exit");
            }
        }
    }

    private void displayMenu() {
        System.out.println("1. Login");
        System.out.println("2. See Seats");
        System.out.println("3. View Events");
        System.out.println("4. Profile Info");
        System.out.println("0. Exit");
        System.out.print("Enter your choice (0 to exit): ");
    }

    private void Login() {
        UserInput userInput = new UserInput(scanner);
    }

    private void Seats() {
        Seats seats = new Seats(48);
        seats.displayAvailableSeats();
    }

    private void ProfileInfo() {
        consumer = new Consumer();
    }

    public static void main(String[] args) {
        OTS ots = new OTS();
        ots.choice();
    }
}