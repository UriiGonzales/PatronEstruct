package facade;

public class TiendaFacade {
    private Carrito carrito;
    private Pago pago;
    private Envio envio;

    public TiendaFacade() {
        carrito = new Carrito();
        pago = new Pago();
        envio = new Envio();
    }
    //Metodo que simplifica
    public void comprar(String producto, double monto) {
        carrito.agregarProducto(producto);
        pago.procesarPago(monto);
        envio.coordinarEnvio(producto);
        System.out.println("Compra completada con éxito!\n");
    }
}
