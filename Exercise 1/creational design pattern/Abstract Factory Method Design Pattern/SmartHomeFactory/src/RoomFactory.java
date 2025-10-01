// RoomFactory.java
// Abstract Factory interface
interface RoomFactory {
    Light createLight();
    TemperatureControl createTemperatureControl();
}
// Concrete Factories
class LivingRoomFactory implements RoomFactory {
    public Light createLight() {
        return new LivingRoomLED();
    }
    public TemperatureControl createTemperatureControl() {
        return new LivingRoomAC();
    }
}
class BedroomFactory implements RoomFactory {
    public Light createLight() {
        return new BedroomAmbientLight();
    }
    public TemperatureControl createTemperatureControl() {
        return new BedroomHeater();
    }
}
