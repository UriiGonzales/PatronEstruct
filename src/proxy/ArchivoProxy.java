package proxy;

public class ArchivoProxy implements Archivo{
    private ArchivoReal archivoReal;
    private String nombre;
    private String usuario;
    private boolean tienePermiso;

    public ArchivoProxy(String nombre, String usuario, boolean tienePermiso) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.tienePermiso = tienePermiso;
    }

    @Override
    public void abrir() {
        if (tienePermiso) {
            if (archivoReal == null) {
                archivoReal = new ArchivoReal(nombre);
            }
            archivoReal.abrir();
        } else {
            System.out.println(" Acceso denegado para el usuario: " + usuario);
        }
    }
}
