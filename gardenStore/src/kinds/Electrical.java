package kinds;

public class Electrical extends Kind {

    private double power;
    private boolean isBattery;

    public Electrical(double power, boolean isBattery) {
        super("electrical");
        this.power = power;
        this.isBattery = isBattery;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public boolean isBattery() {
        return isBattery;
    }

    public void setBattery(boolean battery) {
        isBattery = battery;
    }
}
