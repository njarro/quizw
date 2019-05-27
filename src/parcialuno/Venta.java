
package parcialuno;

import java.util.ArrayList;

public class Venta {
    private int formaPago;
    private Factura factura;
    private Vendedor vendedor;
    private Cliente cliente;
    private Fecha fecha;
    private ArrayList<Producto> productos;
    
   

    public Venta(int formaPago) {
        this.formaPago = formaPago;
        productos = new ArrayList<Producto>();
    }
    
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    
    public void generarDescuento() {
        cliente.setTieneDescuento(true);
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Factura getFactura() {
        return factura;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
    
    
}
