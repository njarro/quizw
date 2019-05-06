
package ejercicioventavehiculos;

import java.util.HashMap;

public class Main {
    public static void main(String args[]) {
        Empresa empresa = new Empresa();
        Auto auto_lujo1 = new AutoLujo(4, "AHG-453", 4567, "Lamborghini", 2018, 870000000);
        Auto auto_lujo2 = new AutoLujo(4, "BJH-565", 5654, "Ferrari", 2018, 540000000);
        Auto auto_compacto1 = new AutoCompacto(3, "JGH-765", 3423, "Renault", 1997, 3400000);
        Auto auto_compacto2 = new AutoCompacto(2, "YUT-657", 7860, "Chevrolet", 1984, 1200000);
        
        empresa.registrarAuto(auto_lujo1);
        empresa.registrarAuto(auto_lujo2);
        empresa.registrarAuto(auto_compacto1);
        empresa.registrarAuto(auto_compacto2);
        
        HashMap<String, Auto> autos = empresa.listarAutos();
        
        for ( Auto auto : autos.values() ) {
            System.out.println(auto.getPlaca());
            System.out.println(auto.getN_serie());
            System.out.println(auto.getMarca());
            System.out.println(auto.getPrecio());
            System.out.println(auto.getAnio() + "\n");
        }
    }
}
