import functions.ForBuilder;
import functions.ForGarden;
import kinds.Hand;

public class Main {

    public static void main(String[] args) {

        Store storeOne = new Store("StoreOne");

        storeOne.addGoodOfTool(new Tool(1,"shovel","sony",205.99)
                                .setFunction(new ForGarden("low"))
                                .setFunction(new ForBuilder(1500.8))
                                .setKind(new Hand("wood","iron"))
                                .setKeyWords("Tree,dig"));

        storeOne.addGoodOfTool(new Tool(2,"pruner","CAT",305.99)
                                .setFunction(new ForGarden("high"))
                                .setKind(new Hand("plastic","iron"))
                                .setKeyWords("branch,cut,Tree"));

        System.out.println(storeOne.getTools().toString());
    }
}
