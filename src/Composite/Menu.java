package Composite;

import java.util.ArrayList;
import java.util.List;

// Clase compuesta: Menú que contiene platos y otros menús
public class Menu implements ElementoMenu {
    private String nombre;
    private List<ElementoMenu> elementos = new ArrayList<>();

    public Menu(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(ElementoMenu elemento) {
        elementos.add(elemento);
    }

    @Override
    public void mostrar() {
        System.out.println("+ Menú: " + nombre);
        for (ElementoMenu elemento : elementos) {
            elemento.mostrar(); // se delega a los hijos
        }
    }
}
