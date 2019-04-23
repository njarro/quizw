
package programanomina;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    
    public Fecha() {
        dia = 1;
        mes = 1;
        anio = 1991;
    }
    
    public void establecerDia( int dia ) {
        if ( dia >= 1 && dia <= 31 )
            this.dia = dia;
        else if ( dia < 1 )
            this.dia = 1;
        else if ( dia > 31 )
            this.dia = 31;
    }
    
    public void establecerMes( int mes ) {
        if ( mes >= 1 && mes <= 12 )
            this.mes = mes;
        else if ( mes < 1 )
            this.mes = 1;
        else if ( mes > 12 )
            this.mes = 12;
    }
    
    public void establecerAnio( int anio ) {
        final int ANIO_ACTUAL = 2019, ANIO_MINIMO = 1900;
      
        if ( anio < ANIO_MINIMO )
            this.anio = ANIO_MINIMO;
        else if ( anio > ANIO_ACTUAL )
            this.anio = ANIO_ACTUAL;
        else 
            this.anio = anio;
    }
  
    public int consultarDia () {
        return dia;
    }
    
    public int consultarMes () {
        return mes;
    }
    
    public int consultarAnio () {
        return anio;
    }
}
