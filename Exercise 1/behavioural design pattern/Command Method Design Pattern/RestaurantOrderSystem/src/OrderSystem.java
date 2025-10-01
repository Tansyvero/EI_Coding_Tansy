
import java.util.Stack;

// Invoker class - manages order execution and undo
public class OrderSystem {
    private Stack<Command> orderHistory = new Stack<>();

    public void placeOrder(Command command) {
        try {
            command.execute();
            orderHistory.push(command); // store executed order for undo
        } catch (Exception e) {
            System.out.println("Error while executing order: " + e.getMessage());
        }
    }

    public void cancelLastOrder() {
        if (!orderHistory.isEmpty()) {
            try {
                Command lastOrder = orderHistory.pop();
                lastOrder.undo();
            } catch (Exception e) {
                System.out.println("Error while undoing order: " + e.getMessage());
            }
        } else {
            System.out.println("No orders to cancel.");
        }
    }
}
