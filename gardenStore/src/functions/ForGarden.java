package functions;

public class ForGarden extends Function {

    private String reability;

    public ForGarden(String reability) {
        super("garden", "for garden");
        this.reability = reability;
    }

    public String getReability() {
        return reability;
    }

    public void setReability(String reability) {
        this.reability = reability;
    }
}
