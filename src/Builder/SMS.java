package Builder;

public class SMS implements CanalEnvio {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando por SMS: " + mensaje);
    }
}