package flyweight;
import java.util.HashMap;
import java.util.Map;
public class Arbol {
    private final String tipo;   // Intrínseco
    private final String color;  // Intrínseco
    private final String textura; // Intrínseco

    public Arbol(String tipo, String color, String textura) {
        this.tipo = tipo;
        this.color = color;
        this.textura = textura;
    }

    // Estado extrínseco → posición
    public void mostrar(int x, int y) {
        System.out.println("Árbol tipo " + tipo + " de color " + color +
                " en posición (" + x + "," + y + ")");
    }
}
