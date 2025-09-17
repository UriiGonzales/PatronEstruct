package composite;

// Clase main para probar el patrón Composite
public class MainComposite {
    public static void main(String[] args) {
        // Platos individuales
        ElementoMenu plato1 = new Plato("Milanesa con papas", 2500);
        ElementoMenu plato2 = new Plato("Ensalada César", 1800);
        ElementoMenu plato3 = new Plato("Pizza Margarita", 2200);
        ElementoMenu plato4 = new Plato("Helado de vainilla", 900);

        // Submenú de postres
        Menu postres = new Menu("Postres");
        postres.agregar(plato4);

        // Menú principal
        Menu menuPrincipal = new Menu("Menú del Día");
        menuPrincipal.agregar(plato1);
        menuPrincipal.agregar(plato2);
        menuPrincipal.agregar(plato3);
        menuPrincipal.agregar(postres); // un menú dentro de otro

        // Mostrar todo
        menuPrincipal.mostrar();
    }
}
