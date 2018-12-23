package kinds;

public class Hand extends Kind {

    private String handlesMaterial;
    private String toolMaterial;

    public Hand(String handlesMaterial, String toolMaterial) {
        super("hand tool");
        this.handlesMaterial = handlesMaterial;
        this.toolMaterial = toolMaterial;
    }

    public String getHandlesMaterial() {
        return handlesMaterial;
    }

    public void setHandlesMaterial(String handlesMaterial) {
        this.handlesMaterial = handlesMaterial;
    }

    public String getToolMaterial() {
        return toolMaterial;
    }

    public void setToolMaterial(String toolMaterial) {
        this.toolMaterial = toolMaterial;
    }
}
