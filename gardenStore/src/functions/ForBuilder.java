package functions;

public class ForBuilder extends Function {

    private double workLoad;

    public ForBuilder(double workLoad) {
        super("builder", "for builder");
        this.workLoad = workLoad;
    }

    public double getWorkLoad() {
        return workLoad;
    }

    public void setWorkLoad(double workLoad) {
        this.workLoad = workLoad;
    }
}
