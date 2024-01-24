import java.util.Scanner;

public class Event {
    private Scanner scanner;

    public Event() {
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("1. View Shows");
        System.out.println("2. Book Tickets");
        System.out.println("0. Exit");
    }

    public void viewshowSchedule() {
        System.out.println("========Show Schedule=========");
        System.out.println("1. Avengers      ==== 11AM   ==== £25");
        System.out.println("2. Wonka         ==== 6PM    ==== £30");
        System.out.println("3. Full Circle   ==== 10AM   ==== £40");
        System.out.println("4. The Kitchen   ==== 11AM   ==== £50");
        System.out.println("5. Lift          ==== 2PM    ==== (40");
    }

    public void bookTickets() {
        
        viewshowSchedule();
        System.out.print("Enter your choice: ");
        int showChoice = scanner.nextInt();

        switch (showChoice) {
            case 1:
                System.out.println("Thank you, Tickets booked for Avenger show!");
                break;
            case 2:
                System.out.println("Thank you, Tickets booked for Wonka show!");
                break;
            case 3:
                System.out.println("Thank you, Tickets booked for Full Circle show!");
                break;
            case 4:
                System.out.println("Thank you, Tickets booked for The Kitchen show!");
                break;
            case 5:
                System.out.println("Thank you, Tickets booked for Avenger show! Lift show!");
                break;
            default:
                System.out.println("Invalid show choice.");
            
        }
    }

    public void run() {
        int choice;
        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    viewshowSchedule();
                    break;
                case 2:
                    bookTickets();
                    break;
                case 0:
                    System.out.println("Quit");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }

    public static void main(String[] args) {
        Event event = new Event();
        event.run();
    }
}