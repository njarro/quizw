
package ejercicioventavehiculos;

public class Vagoneta extends Auto{
    private int n_pasajeros;

    public Vagoneta(int n_pasajeros, String placa, int n_serie, String marca, int anio, double precio) {
        super(placa, n_serie, marca, anio, precio);
        this.n_pasajeros = n_pasajeros;
    }

    public int getN_pasajeros() {
        return n_pasajeros;
    }

    public void setN_pasajeros(int n_pasajeros) {
        this.n_pasajeros = n_pasajeros;
    }
    
}
