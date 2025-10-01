// SettingsManager.java
// Singleton class to manage game settings
public class SettingsManager {
    // Static variable to hold the single instance of SettingsManager
    private static SettingsManager instance;
    // Game settings fields
    private int volume;               // Volume level (0-100)
    private String difficulty;        // Game difficulty (Easy, Normal, Hard)
    private String screenResolution;  // Screen resolution (e.g., 1920x1080)
    // Private constructor to prevent external instantiation
    private SettingsManager() {
        // Default settings
        volume = 50;
        difficulty = "Normal";
        screenResolution = "1920x1080";
    }
    // Public method to provide global access to the single instance
    public static synchronized SettingsManager getInstance() {
        if (instance == null) {
            // If instance does not exist, create it
            instance = new SettingsManager();
        }
        return instance;  // Return the single instance
    }
    // Getter and Setter for volume
    public int getVolume() { return volume; }
    public void setVolume(int volume) { this.volume = volume; }
    // Getter and Setter for difficulty
    public String getDifficulty() { return difficulty; }
    public void setDifficulty(String difficulty) { this.difficulty = difficulty; }
    // Getter and Setter for screen resolution
    public String getScreenResolution() { return screenResolution; }
    public void setScreenResolution(String screenResolution) { this.screenResolution = screenResolution; }
    // Method to display current game settings
    public void showSettings() {
        System.out.println("\nCurrent Game Settings:");
        System.out.println("Volume: " + volume);
        System.out.println("Difficulty: " + difficulty);
        System.out.println("Screen Resolution: " + screenResolution);
    }
}


