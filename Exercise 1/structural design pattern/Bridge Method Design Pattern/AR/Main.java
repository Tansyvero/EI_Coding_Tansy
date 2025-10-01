import abstraction.FaceFilter;
import implementor.ARCoreEngine;
import implementor.ARKitEngine;
import implementor.AREngine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Ask engine
            System.out.println("\nChoose AR Engine (1 = ARCore, 2 = ARKit, 0 = Exit): ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 0) {
                System.out.println("Exiting program...");
                break;
            }

            AREngine engine;
            if (choice == 1) {
                engine = new ARCoreEngine();
            } else if (choice == 2) {
                engine = new ARKitEngine();
            } else {
                System.out.println("Invalid choice. Try again.");
                continue;
            }

            // Ask filter name
            System.out.print("Enter filter name (or type 'exit' to stop): ");
            String filterName = sc.nextLine();

            if (filterName.equalsIgnoreCase("exit")) {
                System.out.println("Exiting program...");
                break;
            }

            // Apply filter
            FaceFilter filter = new FaceFilter(engine) {
                @Override
                public void apply() {
                    try {
                        engine.render(filterName);
                    } catch (Exception e) {
                        System.err.println("Error applying filter: " + e.getMessage());
                    }
                }
            };
            filter.apply();
        }

        sc.close();
    }
}
