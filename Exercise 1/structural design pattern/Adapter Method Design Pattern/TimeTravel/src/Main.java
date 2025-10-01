import java.util.Scanner;

// Client - Time Traveler using Adapter
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, Time Traveler!");
        System.out.println("Type an ancient date description (e.g., 'Year of the Dragon', 'Year of the Phoenix').");
        System.out.println("Or type 'exit' to close the time portal.\n");

        while (true) {
            System.out.print("Enter your scroll input: ");
            String userInput = scanner.nextLine().trim();

            // Exit condition
            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Closing time portal... Goodbye, adventurer!");
                break;
            }
            // Create AncientScrollDate with user input
            AncientScrollDate scroll = new AncientScrollDate(userInput);
            // Use adapter to convert and travel
            TimeMachine adapter = new TimeConverterAdapter(scroll);
            // Pass dummy year (ignored), adapter handles conversion
            adapter.travelToYear(0);
            System.out.println("Safe travels through the timeline, adventurer!\n");
        }

        scanner.close();
    }
}

