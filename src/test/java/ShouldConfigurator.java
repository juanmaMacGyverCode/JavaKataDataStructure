import org.junit.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class ShouldConfigurator {

    @Test
    public void to_create_a_menu_accessories() {
        MenuComponents menuComponents = new MenuComponents();
        //Car car = new Car("Nissan", "Leaf", "City", new Configuration(null, null, null));

        assertThat(menuComponents.getAccessories()).isNotNull();
        assertThat(menuComponents.getColors()).isNotNull();
        assertThat(menuComponents.getEngines()).isNotNull();
    }

    @Test
    public void to_create_a_basic_car() {
        MenuComponents menuComponents = new MenuComponents();
        Car car = new Car("Nissan", "Leaf", "City", new Configuration(null, null, null));

        assertThat(car.getConfiguration().getAccessories()).isNull();
        assertThat(car.getConfiguration().getColor()).isNull();
        assertThat(car.getConfiguration().getEngine()).isNull();
    }

    @Test
    public void to_create_a_car_with_custom_color() {
        MenuComponents menuComponents = new MenuComponents();
        Color color = menuComponents.getColors().get(0);
        Configuration configuration = new Configuration(color, null, null);

        Car car = new Car("Nissan", "Leaf", "City", configuration);

        assertThat(car.getConfiguration().getAccessories()).isNull();
        assertThat(car.getConfiguration().getColor()).isNotNull();
        assertThat(car.getConfiguration().getEngine()).isNull();
    }

    @Test
    public void to_create_a_car_with_custom_engine() {
        MenuComponents menuComponents = new MenuComponents();
        Engine engine = menuComponents.getEngines().get(0);
        Configuration configuration = new Configuration(null, engine, null);

        Car car = new Car("Nissan", "Leaf", "City", configuration);

        assertThat(car.getConfiguration().getAccessories()).isNull();
        assertThat(car.getConfiguration().getColor()).isNull();
        assertThat(car.getConfiguration().getEngine()).isNotNull();
    }

    @Test
    public void to_create_a_car_with_custom_accessorie() {
        MenuComponents menuComponents = new MenuComponents();
        //Accessory accessory = menuComponents.getAccessories().get(1);
        ArrayList<Accessory> accessories = new ArrayList<>();
        accessories.add(menuComponents.getAccessories().get(0));
        Configuration configuration = new Configuration(null, null, accessories);

        Car car = new Car("Nissan", "Leaf", "City", configuration);

        assertThat(car.getConfiguration().getAccessories()).isNotNull();
        assertThat(car.getConfiguration().getColor()).isNull();
        assertThat(car.getConfiguration().getEngine()).isNull();
    }
}
