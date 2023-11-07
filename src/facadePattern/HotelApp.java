package facadePattern;

import java.util.Scanner;

public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Hotel Management System");
            System.out.println("[1] Check-in\n[2] Check-out");
            System.out.print("Check-in or Check-out? ");
            int choice = scanner.nextInt();

            if (choice == 1 || choice == 2) {
                String action = (choice == 1) ? "Check-in" : "Check-out";
                System.out.print("Enter the plate number for valet service during " + action + ": ");
                String plateNumber = scanner.next();
                System.out.print("Enter the room number for housekeeping service during " + action + ": ");
                int roomNumber = scanner.nextInt();
                System.out.print("Enter the number of carts for cart service during " + action + ": ");
                int numberOfCarts = scanner.nextInt();

                HotelService valetService = new Valet(plateNumber);
                HotelService houseKeepingService = new HouseKeeping(roomNumber);
                HotelService cartService = new Cart(numberOfCarts);

                frontDesk.requestService(valetService);
                frontDesk.requestService(houseKeepingService);
                frontDesk.requestService(cartService);
            } else {
                System.out.println("Invalid choice. Please enter [1] for Check-in or [2] for Check-out.");
            }

            System.out.println(); // Add a newline for separation

            System.out.print("Do you want to continue (Yes/No)? ");
            String continueChoice = scanner.next();
            if (!continueChoice.equalsIgnoreCase("Yes")) {
                break; // Exit the loop if the user chooses not to continue
            }
        }

        scanner.close();
    }
}
