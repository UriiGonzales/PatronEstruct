package flyweight;
import java.util.HashMap;
import java.util.Map;
public class FabricaDeArboles {
    private static Map<String, Arbol> arboles = new HashMap<>();

    public static Arbol getArbol(String tipo, String color) {
        String clave = tipo + "-" + color;
        if (!arboles.containsKey(clave)) {
            arboles.put(clave, new Arbol(tipo, color));
            System.out.println("Creado nuevo Arbol: " + clave);
        }
        return arboles.get(clave);
    }
}
