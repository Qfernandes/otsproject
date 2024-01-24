import java.util.HashMap;
import java.util.Scanner;

public class Seats {
    private HashMap<Integer, Boolean> seatStatus;
    private int totalSeats;

    public Seats(int totalSeats) {
        this.totalSeats = totalSeats;
        initializeSeatStatus();
    }

    private void initializeSeatStatus() {
        seatStatus = new HashMap<>();
        for (int i = 1; i <= totalSeats; i++) {
            seatStatus.put(i, true);
        }
    }

    public void displayAvailableSeats() {
        System.out.println("Available Seats:");
        for (int seatNumber : seatStatus.keySet()) {
            if (seatStatus.get(seatNumber)) {
                System.out.print(seatNumber + " ");
            }
        }
        System.out.println();
    }
    
    public void bookSeats(int numSeats) {
        int bookedCount = 0;
        for (int seatNumber : seatStatus.keySet()) {
            if (seatStatus.get(seatNumber)) {
                seatStatus.put(seatNumber, false);
                bookedCount++;
            }
            if (bookedCount == numSeats) {
                break;
            }
        }

        if (bookedCount == numSeats) {
            System.out.println("Seats booked successfully!");
        } else {
            System.out.println("Not enough available seats to book.");
        }
    }
    

    public void main(Scanner scanner) {
        int choice;
        do {
            System.out.println("1. Display Available Seats");
            System.out.println("2. Book Seats");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayAvailableSeats();
                    break;
                case 2:
                    System.out.print("Enter the number of seats to book: ");
                    int numSeatsToBook = scanner.nextInt();
                    bookSeats(numSeatsToBook);
                    break;
                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total number of seats in the theater: ");
        int totalSeats = scanner.nextInt();

        Seats seat = new Seats(totalSeats);
        seat.main(scanner);
    }
}
