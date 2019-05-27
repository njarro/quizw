
package parcialuno;

public class Main {
    public static void main (String[] args) {
        Hora hora1 = new Hora(9, 30);
        Hora hora2 = new Hora(12, 45);
        
        Fecha fecha1 = new Fecha (1, 2, 2019);
        Fecha fecha2 = new Fecha (2, 2, 2019);
        
        Local local = new Local("Tienda Y");
        
        Producto escoba = new Producto(1, "escoba", 8000.0, 10) ;
        Producto leche = new Producto(2, "leche", 1200.0, 20);
        Producto arroz = new Producto(3, "arroz", 2000.0, 15);
        
        Vendedor vendedor = new Vendedor(1, "Scarlett", "Johanson");
        
        Cliente cliente1 = new Cliente("Jonathan", "Lopez");
        Cliente cliente2 = new Cliente("Victor", "Barragan");
        
        Venta venta1 = new Venta(1);
        Venta venta2 = new Venta(2);
        Factura factura1 = new Factura();
        Factura factura2 = new Factura();
        
        local.agregarVendedor(vendedor);
        local.agregarProducto(escoba);
        local.agregarProducto(leche);
        local.agregarProducto(arroz);
        
        fecha1.setHora(hora1);
        fecha2.setHora(hora2);
        
        venta1.setFecha(fecha1);
        venta2.setFecha(fecha2);
        
        venta1.setCliente(cliente1);
        venta2.setCliente(cliente2);
        
        venta1.setVendedor(vendedor);
        venta2.setVendedor(vendedor);
        
        local.agregarVenta(venta1, factura1);
        local.agregarVenta(venta2, factura2);
        
        local.agregarProductoVenta(1, 2, venta1);
        local.agregarProductoVenta(2, 3, venta1);
        
        local.agregarProductoVenta(1, 1, venta2);
        local.agregarProductoVenta(2, 6, venta2);
        local.agregarProductoVenta(3, 2, venta2);
        
        venta1.getFactura().establecerMontoTotal();
        venta2.getFactura().establecerMontoTotal();
        
        System.out.println("Venta1 : "+ venta1.getFactura().getMontoTotal());
        System.out.println("Venta2 : "+ venta2.getFactura().getMontoTotal());
        
    }
}
