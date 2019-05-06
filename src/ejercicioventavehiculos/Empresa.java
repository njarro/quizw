
package ejercicioventavehiculos;

import java.util.*;

public class Empresa {
    private HashMap<String, Auto> autos;

    public Empresa() {
        this.autos = new HashMap<>();
    }
    
    public void registrarAuto ( Auto auto ) {
        this.autos.put(auto.getPlaca(), auto);
    }
    
    public HashMap listarAutos() {
        return autos;
    }
}
