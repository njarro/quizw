
package parcialuno;

public class Cliente {
    private String nombre;
    private String apellido;
    private Boolean tieneDescuento;

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tieneDescuento = false;
    }
    
    public void setTieneDescuento(boolean tieneDescuento) {
        this.tieneDescuento = tieneDescuento;
    }
}
