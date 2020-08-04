import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Accessory {
    private int id;
    private String type;
    private String name;
    private String category;
    private ArrayList<String> incompatibilities;
    private ArrayList<String> needToImplement;

    public Accessory(int id, String type, String name, String category, ArrayList<String> incompatibilities, ArrayList<String> needToImplement) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.category = category;
        this.incompatibilities = incompatibilities;
        this.needToImplement = needToImplement;
    }
}
