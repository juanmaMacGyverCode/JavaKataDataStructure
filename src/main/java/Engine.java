import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Engine {
    private int id;
    private String name;
    private String typeEngine;
    private int horsepower;
    private ArrayList<String> incompatibilities;

    public Engine(int id, String name, String typeEngine, int horsepower, ArrayList<String> incompatibilities) {
        this.id = id;
        this.name = name;
        this.typeEngine = typeEngine;
        this.horsepower = horsepower;
        this.incompatibilities = incompatibilities;
    }
}
