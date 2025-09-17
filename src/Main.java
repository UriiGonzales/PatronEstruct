import adapter.Impresora;
import adapter.ImpresoraPDF;
import adapter.ImpresoraTexto;
import adapter.ImpresoraTextoAdapter;
import builder.*;
import decorator.DescargasOffline;
import decorator.HD;
import decorator.Plan;
import decorator.PlanBasico;
import facade.Carrito;
import facade.TiendaFacade;
import facade.Envio;
import facade.Pago;
import flyweight.Arbol;
import flyweight.FabricaDeArboles;

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
        TiendaFacade tienda = new TiendaFacade();

        // Simulamos una compra
        tienda.comprar("Notebook", 250000);

        // Otra compra
        tienda.comprar("Auriculares", 35000);
        //Ejercicio 5
        for (int i = 0; i < 5; i++) {
            Arbol pino = FabricaDeArboles.getArbol("Pino", "Verde");
            pino.dibujar(i, i * 2);
        }

        for (int i = 0; i < 5; i++) {
            Arbol roble = FabricaDeArboles.getArbol("Roble", "Marrón");
            roble.dibujar(i * 3, i * 4);
        }


    }
}