import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Configuration {
    private Color color;
    private Engine engine;
    private ArrayList<Accessory> accessories;

    public Configuration(Color color, Engine engine, ArrayList<Accessory> accessories) {
        this.color = color;
        this.engine = engine;
        this.accessories = accessories;
    }
}
