// Main.java - Dynamic Magical Potion Brewing Demo
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Setup the chain: Healing -> Invisibility -> Strength
        PotionHandler healing = new HealingHandler();
        PotionHandler invisibility = new InvisibilityHandler();
        PotionHandler strength = new StrengthHandler();

        healing.setNextHandler(invisibility);
        invisibility.setNextHandler(strength);

        System.out.println("Welcome to the Dynamic Magical Potion Brewing System!");
        System.out.println("Type 'exit' to quit.");


        // List of available ingredients for user guidance
        String[] availableIngredients = {"Herb of Life", "Shadow Dust", "Dragon Scale"};
        System.out.println("Available ingredients: Herb of Life, Shadow Dust, Dragon Scale");

        while (true) {
            System.out.print("Add an ingredient to the potion: ");
            String ingredient = scanner.nextLine().trim();

            if (ingredient.equalsIgnoreCase("exit")) {
                System.out.println("Exiting Potion Brewing System. Goodbye!");
                break;
            }

            try {
                if (ingredient.isEmpty()) {
                    throw new IllegalArgumentException("Ingredient cannot be empty!");
                }

                boolean validIngredient = false;
                for (String valid : availableIngredients) {
                    if (ingredient.equalsIgnoreCase(valid)) {
                        validIngredient = true;
                        break;
                    }
                }

                if (!validIngredient) {
                    System.out.println("No magical effect found for '" + ingredient + "'. Please try a valid ingredient.");
                    continue;
                }

                // Pass ingredient through the chain
                healing.handle(ingredient);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
