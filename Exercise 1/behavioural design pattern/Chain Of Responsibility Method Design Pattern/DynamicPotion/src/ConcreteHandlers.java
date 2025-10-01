// ConcreteHandlers.java
class HealingHandler extends PotionHandler {
    public void handle(String ingredient) {
        if (ingredient.equalsIgnoreCase("Herb of Life")) {
            System.out.println("Healing effect added to the potion!");
        } else if (nextHandler != null) {
            nextHandler.handle(ingredient);
        }
    }
}

class InvisibilityHandler extends PotionHandler {
    public void handle(String ingredient) {
        if (ingredient.equalsIgnoreCase("Shadow Dust")) {
            System.out.println("Invisibility effect added to the potion!");
        } else if (nextHandler != null) {
            nextHandler.handle(ingredient);
        }
    }
}

class StrengthHandler extends PotionHandler {
    public void handle(String ingredient) {
        if (ingredient.equalsIgnoreCase("Dragon Scale")) {
            System.out.println("Super strength effect added to the potion!");
        } else if (nextHandler != null) {
            nextHandler.handle(ingredient);
        }
    }
}
