import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
    private String brand;
    private String model;
    private String version;
    private Configuration configuration;

    public Car(String brand, String model, String version, Configuration configuration) {
        this.brand = brand;
        this.model = model;
        this.version = version;
        this.configuration = configuration;
    }
}
