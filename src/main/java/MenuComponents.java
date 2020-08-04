import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.LinkedList;

@Getter
@Setter
public class MenuComponents {
    private ArrayList<Engine> engines = new ArrayList<>();
    private ArrayList<Color> colors = new ArrayList<>();
    private ArrayList<Accessory> accessories = new ArrayList<>();

    public MenuComponents() {
        ArrayList<String> incompatibilities = new ArrayList<>();
        incompatibilities.add("Sport");
        engines.add(new Engine(0, "TopePower", "Gasoline", 78, incompatibilities));
        incompatibilities = new ArrayList<>();
        incompatibilities.add("Luxury");
        engines.add(new Engine(1, "Furious", "Gasoline", 78, incompatibilities));
        incompatibilities = new ArrayList<>();
        incompatibilities.add("Luxury");
        incompatibilities.add("City");
        engines.add(new Engine(2, "Turbo", "Gasoline", 78, incompatibilities));

        colors.add(new Color(0, "Metallic", "Green", null));
        colors.add(new Color(1, "Satin", "Blue", null));
        colors.add(new Color(2, "Chrome", "Black", null));

        //System.out.println(colors.get(1).getColorName());

        incompatibilities = new ArrayList<>();
        incompatibilities.add("City");
        incompatibilities.add("Sport");
        incompatibilities.add("simple refrigeration");
        ArrayList<String> needToImplement = new ArrayList<>();
        needToImplement.add("master refrigeration");
        accessories.add(new Accessory(0, "inside", "volante aclimatado", "air-condition", incompatibilities, needToImplement));
        incompatibilities = new ArrayList<>();
        incompatibilities.add("City");
        incompatibilities.add("Sport");
        incompatibilities.add("simple refrigeration");
        accessories.add(new Accessory(1, "inside", "master refrigeration", "air-condition", incompatibilities, null));
        incompatibilities = new ArrayList<>();
        incompatibilities.add("master refrigeration");
        incompatibilities.add("volante aclimatado");
        accessories.add(new Accessory(2, "inside", "simple refrigeration", "air-condition", incompatibilities, needToImplement));
    }
}
