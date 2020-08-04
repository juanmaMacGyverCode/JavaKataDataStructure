import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.LinkedList;

@Getter
@Setter
public class Color {
    private int id;
    private String typeColor;
    private String colorName;
    private ArrayList<Integer> incompatibilities;

    public Color(int id, String typeColor, String colorName, ArrayList<Integer> incompatibilities) {
        this.id = id;
        this.typeColor = typeColor;
        this.colorName = colorName;
        this.incompatibilities = incompatibilities;
    }
}
