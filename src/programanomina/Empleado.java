package programanomina;

public class Empleado {
    private String nombre;
    private String apellido;
    private String genero;
    private int id;
    private double dinero_actual;
    private double salario;
    private int horas_trabajo;
    
    private Fecha fecha_nacimiento;
    private Fecha fecha_ingreso;
    
    public Empleado ( String nombre, String apellido, String genero, int id, int horas_trabajo ) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.salario = 0.0;
        this.id = id;
        this.horas_trabajo = horas_trabajo;
        this.dinero_actual = 0;
        
        fecha_nacimiento = new Fecha();
        fecha_ingreso = new Fecha();
    } 
    
    public void establecerHorasTrabajo( int horas_trabajo ) {
        this.horas_trabajo = horas_trabajo;
    }
    
    public boolean anadirPagoHoras ( double pago_hora ) {
        if ( pago_hora > 0 ) {
            dinero_actual += (pago_hora * horas_trabajo);
            return true;
        } else
            return false;
    }
    
    public double consultarSalario () {
        return salario;
    }
    
    public boolean cambiarSalario ( double nuevo_salario ) {
        if ( nuevo_salario > 0 ) {
            salario = nuevo_salario;
            return true;
        } else return false;
    }
    
    public String consultarNombre () {
        return nombre + " " + apellido;
    }
    
    public int consultarId () {
        return id;
    }
   
    public void establecerFechaNacimiento ( int dia, int mes, int anio ) {
        fecha_nacimiento.establecerDia( dia );
        fecha_nacimiento.establecerMes( mes );
        fecha_nacimiento.establecerAnio( anio );
    }
    
    public void establecerFechaIngreso ( int dia, int mes, int anio ) {
        fecha_ingreso.establecerDia( dia );
        fecha_ingreso.establecerMes( mes );
        fecha_ingreso.establecerAnio( anio );
    }
    
    public int calcularEdadActual () {
        final int MES_ACTUAL = 4, ANIO_ACTUAL = 2019;
        
        if ( ANIO_ACTUAL  == fecha_nacimiento.consultarAnio() )
            return 0;
        else {
           int edad_actual = ANIO_ACTUAL - fecha_nacimiento.consultarAnio();
           
           if ( fecha_nacimiento.consultarMes() > MES_ACTUAL )
                edad_actual--;
        
           return edad_actual; 
        }
    }
    
    public String calcularAntiguedad () {
        final int MES_ACTUAL = 4, ANIO_ACTUAL = 2019;
        
        if ( MES_ACTUAL >= fecha_ingreso.consultarMes() )
            return (ANIO_ACTUAL - fecha_ingreso.consultarAnio()) + " anios y " +
                   (MES_ACTUAL - fecha_ingreso.consultarMes()) + " meses.";
        else if ( MES_ACTUAL < fecha_ingreso.consultarMes() )
            return (ANIO_ACTUAL - fecha_ingreso.consultarAnio() - 1) + " anios y " +
                   (fecha_ingreso.consultarMes() + MES_ACTUAL) + " meses."; 
        
        return "";
    }
}
