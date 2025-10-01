
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        KitchenStaff kitchen = new KitchenStaff();
        OrderSystem orderSystem = new OrderSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Order Pizza\n2. Order Salad\n3. Order Coffee\n4. Combo Meal\n5. Cancel Last Order\n6. Exit");
            System.out.print("Choose option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> orderSystem.placeOrder(new MakePizzaCommand(kitchen));
                case 2 -> orderSystem.placeOrder(new MakeSaladCommand(kitchen));
                case 3 -> orderSystem.placeOrder(new MakeCoffeeCommand(kitchen));
                case 4 -> {
                    MacroCommand combo = new MacroCommand();
                    combo.addCommand(new MakePizzaCommand(kitchen));
                    combo.addCommand(new MakeSaladCommand(kitchen));
                    combo.addCommand(new MakeCoffeeCommand(kitchen));
                    orderSystem.placeOrder(combo);
                }
                case 5 -> orderSystem.cancelLastOrder();
                case 6 -> {
                    System.out.println("Exiting. Thank you!");
                    return;
                }
                default -> System.out.println("Invalid option!");
            }
        }
    }
}
