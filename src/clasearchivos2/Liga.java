
package clasearchivos2;
import java.util.ArrayList;

public class Liga {
    private String nombre;
    private ArrayList<Equipo> equipos;
    
    public Liga(String nombre){
        this.nombre = nombre;
        this.equipos = new ArrayList<Equipo>();
    }
    
    public boolean addEquipo(String nombre) {
        Equipo equipo = new Equipo(nombre);
        return this.equipos.add(equipo);
    } 
    
    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }
}
