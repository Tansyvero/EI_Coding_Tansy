// PotionHandler.java
abstract class PotionHandler {
    protected PotionHandler nextHandler;

    public void setNextHandler(PotionHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handle(String ingredient);
}
