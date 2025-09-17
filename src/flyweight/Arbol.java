package flyweight;

public class Arbol {
    public class Arbol {
        private final String tipo;   // Intrínseco
        private final String color;  // Intrínseco

        public Arbol(String tipo, String color) {
            this.tipo = tipo;
            this.color = color;
        }

        public void dibujar(int x, int y) {
            System.out.println("Árbol tipo " + tipo + " de color " + color +
                    " en posición (" + x + "," + y + ")");
        }
    }
}
