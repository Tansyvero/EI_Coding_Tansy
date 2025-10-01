
// Receiver class - actual kitchen staff performing tasks
public class KitchenStaff {
    public void cookPizza() throws Exception {
        System.out.println("Cooking pizza...");
        if(Math.random() < 0.05) throw new Exception("Oven malfunction!");
    }

    public void prepareSalad() throws Exception {
        System.out.println("Preparing salad...");
        if(Math.random() < 0.05) throw new Exception("Salad ingredients missing!");
    }

    public void brewCoffee() throws Exception {
        System.out.println("Brewing coffee...");
        if(Math.random() < 0.05) throw new Exception("Coffee machine error!");
    }

    public void serveDish(String dish) {
        System.out.println("Serving " + dish + " to customer.");
    }
}
