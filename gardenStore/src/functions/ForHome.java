package functions;

public class ForHome extends Function {

    private String measureNoise;

    public ForHome(String measureNoise) {
        super("home", "for home");
        this.measureNoise = measureNoise;
    }

    public String getMeasureNoise() {
        return measureNoise;
    }

    public void setMeasureNoise(String measureNoise) {
        this.measureNoise = measureNoise;
    }
}
