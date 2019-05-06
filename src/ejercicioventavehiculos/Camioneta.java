
package ejercicioventavehiculos;

public class Camioneta extends Auto{
    private double capacidad_carga;
    private int n_ejes;
    private int n_rodadas;

    public Camioneta(double capacidad_carga, int n_ejes, int n_rodadas,
            String placa, int n_serie, String marca, int anio, double precio) {
        super(placa, n_serie, marca, anio, precio);
        this.capacidad_carga = capacidad_carga;
        this.n_ejes = n_ejes;
        this.n_rodadas = n_rodadas;
    }

    public double getCapacidad_carga() {
        return capacidad_carga;
    }

    public void setCapacidad_carga(double capacidad_carga) {
        this.capacidad_carga = capacidad_carga;
    }

    public int getN_ejes() {
        return n_ejes;
    }

    public void setN_ejes(int n_ejes) {
        this.n_ejes = n_ejes;
    }

    public int getN_rodadas() {
        return n_rodadas;
    }

    public void setN_rodadas(int n_rodadas) {
        this.n_rodadas = n_rodadas;
    }
    
    
}
