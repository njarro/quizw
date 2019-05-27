
package parcialuno;

public class Factura {
    private double montoTotal;
    private Venta venta;

    public Factura() {
        this.montoTotal = 0.0;
    }
    
    public void establecerMontoTotal() {
        for (Producto p : venta.getProductos()) {
            montoTotal += (p.getPrecio() * p.getCantidad());
        }
    }

    public double getMontoTotal() {
        return montoTotal;
    }
    
    

    public void setVenta(Venta venta) {
        this.venta = venta;
    }
    
}
