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
import facade.TiendaFacade;
import flyweight.Arbol;
import flyweight.FabricaDeArboles;
import proxy.ArchivoProxy;
import proxy.Archivo;

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
        System.out.println("Ejercicio 4");
        TiendaFacade tienda = new TiendaFacade();
        tienda.comprar("Notebook", 250000);
        tienda.comprar("Auriculares", 35000);
        //Ejercicio 5
        System.out.println("Ejercicio 5");
        for (int i = 0; i < 5; i++) {
            Arbol pino = FabricaDeArboles.getArbol("Pino", "Verde");
            pino.dibujar(i, i * 2);
        }
        for (int i = 0; i < 5; i++) {
            Arbol roble = FabricaDeArboles.getArbol("Roble", "Marrón");
            roble.dibujar(i * 3, i * 4);
        }
        //Ejercicio 6
        System.out.println("Ejercicio 6");
        Archivo archivo1 = new ArchivoProxy("secretos.txt", "admin", true);
        archivo1.abrir();
        Archivo archivo2 = new ArchivoProxy("secretos.txt", "invitado", false);
        archivo2.abrir();
        //Ejercicio 7
        System.out.println("Ejercicio 7");
        ElementoMenu plato1 = new Plato("Milanesa con papas", 2500);
        ElementoMenu plato2 = new Plato("Ensalada César", 1800);
        ElementoMenu plato3 = new Plato("Pizza Margarita", 2200);
        ElementoMenu plato4 = new Plato("Helado de vainilla", 900);
        Menu postres = new Menu("Postres");
        postres.agregar(plato4);
        Menu menuPrincipal = new Menu("Menú del Día");
        menuPrincipal.agregar(plato1);
        menuPrincipal.agregar(plato2);
        menuPrincipal.agregar(plato3);
        menuPrincipal.agregar(postres);
        menuPrincipal.mostrar();

    }
}