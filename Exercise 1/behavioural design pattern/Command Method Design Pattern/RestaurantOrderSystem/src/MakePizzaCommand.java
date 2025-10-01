
// Concrete Command for making pizza
public class MakePizzaCommand implements Command {
    private KitchenStaff kitchen;

    public MakePizzaCommand(KitchenStaff kitchen) {
        this.kitchen = kitchen;
    }

    @Override
    public void execute() throws Exception {
        kitchen.cookPizza();
    }

    @Override
    public void undo() throws Exception {
        System.out.println("Undo pizza order.");
    }
}
