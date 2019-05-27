
package parcialuno;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    private Hora horaVenta;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    public void setHora( Hora hora ){
        this.horaVenta=hora;
    }
}
