import adapter.Impresora;
import adapter.ImpresoraPDF;
import adapter.ImpresoraTexto;
import adapter.ImpresoraTextoAdapter;
import builder.*;
import composite.ElementoMenu;
import composite.Menu;
import composite.Plato;
import decorator.DescargasOffline;
import decorator.HD;
import decorator.Plan;
import decorator.PlanBasico;

public class Main {
    public static void main(String[] args) {

        //Ejercicio 1

        System.out.println("Ejercicio 1");

        Impresora impresoraPDF = new ImpresoraPDF();
        ImpresoraTexto impresoraTexto = new ImpresoraTexto();
        Impresora impresoraTextoAdapter = new ImpresoraTextoAdapter(impresoraTexto);

        impresoraPDF.imprimir("Documento1.pdf");
        impresoraTextoAdapter.imprimir("Documento2.txt");

        //Ejercicio 2

        System.out.println("Ejercicio 2");

        CanalEnvio email = new Email();
        CanalEnvio sms = new SMS();

        Notificacion alertaEmail = new Alerta(email);
        Notificacion recordatorioSMS = new Recordatorio(sms);

        alertaEmail.enviar("Incendio en el edificio");
        recordatorioSMS.enviar("Reunión a las 15:00");

        //Ejercicio 3

        System.out.println("Ejercicio 3");

        Plan plan1 = new PlanBasico();
        plan1 = new HD(plan1);
        plan1 = new DescargasOffline(plan1);

        System.out.println("Costo total: $" + plan1.getCosto());
        //Ejercicio 4

        //Ejercicio 7

        System.out.println("Ejercicio 7");
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

        // Mostrar
        menuPrincipal.mostrar();

    }
}