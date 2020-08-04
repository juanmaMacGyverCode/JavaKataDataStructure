import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


/*

TODO:

1º. Implementar una clase que pueda llevar todos los componentes (clase configuración).
2º. Definir varias clases de familias de componentes (versión (City, Sport, Luxury...), motor, exteriores del coche, interior, color y pintura) (propiedad de Configuración y clase al mismo tiempo)
3º. Probar los packs por defecto :
        - Volante aclimatado solo Luxury (y el como no)
        - Turbo solo para Sport (y el como no)
        - Kit de supervivencia marronero para City. (y el como no)
        - ventanilla del techo (solo para Luxury y Sport)
        - cenicero (solo para City y luxury)

 */


public class pruebasTest {

    @Test
    public void test_suma() {
        Pruebas prueba = new Pruebas();
        assertThat(prueba.Suma(1,2)).isEqualTo(3);
    }

    /*@Test(expected = Exception.class)
    public void test_incompatibilidad_entre_componentes() {
        Catalogo catalogo = new Catalogo();
        Interior interior = new Interior();

        interior.addComponent(catalogo.getComponenteCatalogo(0));
        interior.addComponent(catalogo.getComponenteCatalogo(1));
    }*/

}