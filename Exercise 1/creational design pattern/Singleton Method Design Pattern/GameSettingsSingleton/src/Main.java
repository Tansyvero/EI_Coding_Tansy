// Main.java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        // Get the single instance of SettingsManager (Singleton)
        SettingsManager settings = SettingsManager.getInstance();
        // -----------------------------
        // Volume input with validation
        // -----------------------------
        while (true) {
            try {
                System.out.print("Enter game volume (0-100): ");
                int volume = Integer.parseInt(scanner.nextLine()); // Read user input and convert to integer
                if (volume < 0 || volume > 100) { // Validate the volume range
                    throw new IllegalArgumentException("Volume must be between 0 and 100.");
                }
                settings.setVolume(volume); // Set volume in SettingsManager
                break; // Exit loop if input is valid
            } catch (NumberFormatException e) {
                // Handle non-integer input
                System.out.println("Invalid input! Please enter an integer.");
            } catch (IllegalArgumentException e) {
                // Handle out-of-range input
                System.out.println(e.getMessage());
            }
        }
        // -----------------------------
        // Difficulty input with validation
        // -----------------------------
        while (true) {
            System.out.print("Enter game difficulty (Easy, Normal, Hard): ");
            String difficulty = scanner.nextLine().trim(); // Read and trim input
            // Validate difficulty input (case-insensitive)
            if (difficulty.equalsIgnoreCase("Easy") || 
                difficulty.equalsIgnoreCase("Normal") || 
                difficulty.equalsIgnoreCase("Hard")) {
                settings.setDifficulty(difficulty); // Set difficulty in SettingsManager
                break; // Exit loop if input is valid
            } else {
                System.out.println("Invalid difficulty! Please enter Easy, Normal, or Hard.");
            }
        }
        // -----------------------------
        // Screen resolution input with validation
        // -----------------------------
        while (true) {
            System.out.print("Enter screen resolution (e.g., 1920x1080): ");
            String resolution = scanner.nextLine().trim(); // Read input and trim spaces
            // Validate resolution format using regex
            if (resolution.matches("\\d{3,5}x\\d{3,5}")) {
                settings.setScreenResolution(resolution); // Set resolution in SettingsManager
                break; // Exit loop if input is valid
            } else {
                System.out.println("Invalid resolution format! Example: 1920x1080");
            }
        }
        // -----------------------------
        // Display final game settings
        // -----------------------------
        settings.showSettings();
        // Close scanner to prevent resource leak
        scanner.close();
    }
}

