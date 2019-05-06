
package ejercicioventavehiculos;

public class Auto {
    protected String placa;
    protected int n_serie;
    protected String marca;
    protected int anio;
    protected double precio;

    public Auto(String placa, int n_serie, String marca, int anio, double precio) {
        this.placa = placa;
        this.n_serie = n_serie;
        this.marca = marca;
        this.anio = anio;
        this.precio = precio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getN_serie() {
        return n_serie;
    }

    public void setN_serie(int n_serie) {
        this.n_serie = n_serie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
