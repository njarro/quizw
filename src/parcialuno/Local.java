
package parcialuno;

import java.util.ArrayList;

public class Local {
    
    private String nombre;
    private ArrayList<Venta> ventas;
    private ArrayList<Producto> productos;
    private ArrayList<Vendedor> vendedores;

    public Local(String nombre) {
        this.nombre = nombre;
        productos = new ArrayList<Producto>();
        ventas = new ArrayList<Venta>();
        vendedores = new ArrayList<Vendedor>();
    }
    
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    
    public void agregarVenta(Venta venta, Factura factura) {
        factura.setVenta(venta);
        venta.setFactura(factura);
        venta.generarDescuento();
        ventas.add(venta);
    }
    
    public void agregarProductoVenta(int codigo, int cantidad, Venta venta){
        Producto producto = new Producto();
        for (Producto p : productos) {
            if (codigo == p.getCodigo() && p.getCantidad() >= cantidad){
                p.setCantidad(p.getCantidad() - cantidad);
                producto.setCodigo(codigo);
                producto.setDescripcion(p.getDescripcion());
                producto.setPrecio(p.getPrecio());
                producto.setCantidad(cantidad);
            }
        }
        
        for (Venta v : ventas) {
            if (v.equals(venta)) v.agregarProducto(producto);
            
        }
    }

    public void agregarVendedor(Vendedor vendedor) {
        this.vendedores.add(vendedor);
    }
    
    
    
}
