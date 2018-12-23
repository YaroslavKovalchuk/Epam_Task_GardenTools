import functions.Function;
import kinds.Kind;

import java.util.ArrayList;
import java.util.List;

public class Tool {

    private int id;
    private String name;
    private String company;
    private double price;
    private String keyWords;
    private List<Function> function = new ArrayList<>();
    private Kind kind;

    public Tool(int id, String name, String company, double price) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public Tool setKeyWords(String keyWords) {
        this.keyWords = keyWords;
        return this;
    }

    public List<Function> getFunction() {
        return function;
    }

    public Tool setFunction(Function function) {
        this.function.add(function);
        return this;
    }

    public Kind getKind() {
        return kind;
    }

    public Tool setKind(Kind kind) {
        this.kind = kind;
        return this;
    }

    @Override
    public String toString() {
        return "Tool:" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price +
                ", keyWords='" + keyWords + '\'' +
                ", function=" + function +
                ", kind=" + kind +
                '\n';
    }
}
