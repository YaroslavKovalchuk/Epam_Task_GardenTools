import java.util.ArrayList;
import java.util.List;

public class Store {

    private String name;

    private List<Tool> tools = new ArrayList<>();

    public Store(String name) {
        this.name = name;
    }

    public void addGoodOfTool(Tool tool){
        tools.add(tool);
    }

    public List<Tool> getTools() {
        return tools;
    }

}
