// Devices.java
// Light device interface
interface Light {
    void turnOn();
}
// Temperature device interface
interface TemperatureControl {
    void setTemperature(int temp);
}
// Living Room devices implementation
class LivingRoomLED implements Light {
    public void turnOn() {
        System.out.println("Living Room LED light turned on.");
    }
}
class LivingRoomAC implements TemperatureControl {
    public void setTemperature(int temp) {
        System.out.println("Living Room AC set to " + temp + "°C.");
    }
}
// Bedroom devices implementation
class BedroomAmbientLight implements Light {
    public void turnOn() {
        System.out.println("Bedroom Ambient light turned on.");
    }
}
class BedroomHeater implements TemperatureControl {
    public void setTemperature(int temp) {
        System.out.println("Bedroom Heater set to " + temp + "°C.");
    }
}
