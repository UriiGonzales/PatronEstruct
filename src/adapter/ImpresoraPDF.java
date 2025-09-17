package adapter;

public class ImpresoraPDF implements Impresora {
    @Override
    public void imprimir(String documento) {
        System.out.println("Imprimiendo PDF: " + documento);
    }
}