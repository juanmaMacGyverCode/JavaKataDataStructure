import lombok.Getter;

import java.util.LinkedHashMap;
import java.util.Map;

public class Pruebas {
    public int Suma(int n1, int n2) {
        return n1 + n2;
    }
}


/*@Getter
class Interior {
    private LinkedHashMap<Integer, Interior> componentes;

    public void addComponent(Interior componenteInterior) {
        // Buscar el componente y comparar que no hay otro igual en propiedad

        for (Map.Entry<Integer, Interior> componente : componenteInterior.getComponentes().entrySet()) {
            if (componente.getValue() == co) {

            }
        }

        //
    }
}



@Getter
class TelaMarinera extends Interior {
    private String tipo = "Tela";
}

@Getter
class TelaMarronera extends Interior {
    private String tipo = "Tela";
}






class Configurador {
    private enum version {CITY, SPORT, LUXURY}
    private Interior interior;
}

class Catalogo {
    private LinkedHashMap<Integer, Interior> catalogoComponentes;

    public Catalogo() {
        catalogoComponentes.put(0, new TelaMarinera());
        catalogoComponentes.put(1, new TelaMarronera());
    }

    public Interior getComponenteCatalogo(int indice) {
        return catalogoComponentes.get(indice);
    }
}*/
