
// Concrete Command for making salad
public class MakeSaladCommand implements Command {
    private KitchenStaff kitchen;

    public MakeSaladCommand(KitchenStaff kitchen) {
        this.kitchen = kitchen;
    }

    @Override
    public void execute() throws Exception {
        kitchen.prepareSalad();
    }

    @Override
    public void undo() throws Exception {
        System.out.println("Undo salad order.");
    }
}
