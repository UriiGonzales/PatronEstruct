import Adapter.Impresora;
import Adapter.ImpresoraPDF;
import Adapter.ImpresoraTexto;
import Adapter.ImpresoraTextoAdapter;
import Builder.*;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 1
        Impresora impresoraPDF = new ImpresoraPDF();
        ImpresoraTexto impresoraTexto = new ImpresoraTexto();
        Impresora impresoraTextoAdapter = new ImpresoraTextoAdapter(impresoraTexto);

        impresoraPDF.imprimir("Documento1.pdf");
        impresoraTextoAdapter.imprimir("Documento2.txt");
        //Ejercicio 2
        CanalEnvio email = new Email();
        CanalEnvio sms = new SMS();

        Notificacion alertaEmail = new Alerta(email);
        Notificacion recordatorioSMS = new Recordatorio(sms);

        alertaEmail.enviar("Incendio en el edificio");
        recordatorioSMS.enviar("Reunión a las 15:00");
        //Ejercicio 3
    }
    }
}