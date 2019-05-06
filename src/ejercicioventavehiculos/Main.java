
package ejercicioventavehiculos;

import java.util.HashMap;

public class Main {
    public static void main(String args[]) {
        Empresa empresa = new Empresa();
        Auto auto_lujo = new AutoLujo(4, "AHG-453", 4567, "Lamborghinni", 2018, 870000000);
        Auto auto_compacto = new AutoCompacto(3, "JGH-765", 3423, "Renault", 1997, 3400000);
        
        empresa.registrarAuto(auto_lujo);
        empresa.registrarAuto(auto_compacto);
        
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
