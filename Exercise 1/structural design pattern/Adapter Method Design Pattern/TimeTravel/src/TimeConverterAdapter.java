// Adapter - Converts ancient date into modern year
public class TimeConverterAdapter implements TimeMachine {
    private AncientScrollDate scroll;

    public TimeConverterAdapter(AncientScrollDate scroll) {
        this.scroll = scroll;
    }

    @Override
    public void travelToYear(int ignored) {
        String date = scroll.getAncientDate().trim();
        int year;

        // Convert input to lowercase for case-insensitive matching
        String lowerDate = date.toLowerCase();

        // Check if input is a numeric year
        try {
            year = Integer.parseInt(date);
            System.out.println("Detected direct numeric year...");
        } catch (NumberFormatException e) {
            // Not a number, check mystical phrases (case-insensitive)
            if (lowerDate.contains("year of the dragon")) year = 1988;
            else if (lowerDate.contains("year of the phoenix")) year = 2025;
            else if (lowerDate.contains("year of the tiger")) year = 1962;
            else if (lowerDate.contains("year of the unicorn")) year = 3021;
            else if (lowerDate.contains("year of the wolf")) year = 1420;
            else {
                year = 1500; // fallback for unknown years
                System.out.println("Unknown scroll... defaulting to medieval times!");
            }
        }

        System.out.println("Activating time vortex...");
        System.out.println("Traveling to year: " + year);
    } // End of travelToYear
} // End of TimeConverterAdapter class
