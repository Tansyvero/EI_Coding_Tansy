// Main.java - Smart Home Device Demo with Continuous Menu
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Smart Home Simulator!\n");
        boolean running = true;
        while (running) {
            RoomFactory factory = null;

            // Room selection menu
            while (true) {
                try {
                    System.out.println("\nChoose room to control:");
                    System.out.println("1. Living Room");
                    System.out.println("2. Bedroom");
                    System.out.println("3. Exit");
                    System.out.print("Enter choice: ");
                    String input = scanner.nextLine().trim();

                    int choice = Integer.parseInt(input);

                    if (choice == 1) {
                        factory = new LivingRoomFactory();
                    } else if (choice == 2) {
                        factory = new BedroomFactory();
                    } else if (choice == 3) {
                        System.out.println("Exiting Smart Home Simulator. Goodbye!");
                        running = false; // End outer loop
                        break;
                    } else {
                        System.out.println("Invalid choice! Please enter 1, 2, or 3.");
                        continue;
                    }
                    break; // Valid choice selected, exit inner loop
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a number (1-3).");
                }
            }
            // If user chose exit, skip device setup
            if (!running) break;

            Light light = factory.createLight();
            TemperatureControl tempControl = factory.createTemperatureControl();

            // Temperature input with validation
            while (true) {
                try {
                    System.out.print("Set desired temperature: ");
                    String tempInput = scanner.nextLine().trim();
                    int temperature = Integer.parseInt(tempInput);
                    tempControl.setTemperature(temperature);
                    break; // Valid input, exit loop
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter an integer.");
                }
            }
            System.out.println("\nActivating devices...");
            light.turnOn();

            // Fun message based on room type
            if (factory instanceof LivingRoomFactory) {
                System.out.println("Enjoy your cozy Living Room ambiance!");
            } else {
                System.out.println("Relax and sleep well in your Bedroom!");
            }
        }
        scanner.close();
    }
}



