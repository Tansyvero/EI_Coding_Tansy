
// Concrete Command for making coffee
public class MakeCoffeeCommand implements Command {
    private KitchenStaff kitchen;

    public MakeCoffeeCommand(KitchenStaff kitchen) {
        this.kitchen = kitchen;
    }

    @Override
    public void execute() throws Exception {
        kitchen.brewCoffee();
    }

    @Override
    public void undo() throws Exception {
        System.out.println("Undo coffee order.");
    }
}
