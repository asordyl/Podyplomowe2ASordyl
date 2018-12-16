package Day4;

public class WashingMachine {
    private int temperature;
    private int spinning;

    private int getTemperature() {
        return temperature;
    }

    private int getSpinning() {
        return spinning;
    }

    void modeForSensitiveClothes() {
        temperature = 30;
        spinning = 800;
    }

    void modeForTowelsAndBedLinen() {
        temperature = 90;
        spinning = 1200;
    }

    void showSettings() {
        System.out.println("Temp: " + getTemperature() + "; Obroty: " + getSpinning());
    }

}
