
package parcialuno;

public class Producto {
    private int codigo;
    private String descripcion;
    private double precio;
    private int cantidad;
    
    public Producto() {
        this.codigo = 0;
        this.descripcion = "";
        this.precio = 0.0;
        this.cantidad = 0;
    }

    public Producto(int codigo, String descripcion, double precio, int cantidad) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
}
