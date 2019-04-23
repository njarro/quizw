package programanomina;

import java.util.Scanner;

public class ProgramaNomina {

    public static void main(String[] args) {
        Scanner ent = new Scanner( System.in );
        Empleado[] empleados = new Empleado[3];
        
        for ( int i = 0; i < 3; i++ ) {
            String nombre, apellido, genero;
            int id, horas, dia, mes, anio;
            double  salario;
            
            System.out.println( "Ingrese el nombre del empleado " + (i + 1) + ": " );
            nombre = ent.nextLine();
            System.out.println( "Ingrese el apellido del empleado " + (i + 1) + ": " );
            apellido = ent.nextLine();
            System.out.println( "Ingrese el genero del empleado " + (i + 1) + ": " );
            genero = ent.nextLine();
            System.out.println( "Ingrese el numero de identificacion del empleado " + (i + 1) + ": " );
            id = ent.nextInt();
            System.out.println( "Ingrese el numero de horas de trabajo del empleado " + (i + 1) + ": " );
            horas = ent.nextInt();
            
            empleados[i] = new Empleado( nombre, apellido, genero, id, horas );
            
            System.out.println( "Ingrese la fecha de nacimiento del empleado:" );
            System.out.print( "Dia: " );
            dia = ent.nextInt();
            System.out.print( "Mes: " );
            mes = ent.nextInt();
            System.out.print( "Año: " );
            anio = ent.nextInt();
            empleados[i].establecerFechaNacimiento( dia, mes, anio );
            System.out.println( "La edad actual es de " + empleados[i].calcularEdadActual() + " años." );
            
            System.out.println( "Ingrese la fecha de ingreso a la empresa:" );
            System.out.print( "Dia: " );
            dia = ent.nextInt();
            System.out.print( "Mes: " );
            mes = ent.nextInt();
            System.out.print( "Año: " );
            anio = ent.nextInt();
            empleados[i].establecerFechaIngreso( dia, mes, anio );
            System.out.println( "El empleado tiene una antiguedad en la empresa de " + empleados[i].calcularAntiguedad() );
            
            System.out.println( "Ingrese el salario del empleado " + empleados[i].consultarNombre() + ": " );
            salario = ent.nextDouble();
            
            if ( empleados[i].cambiarSalario( salario ) )
                System.out.println( "El salario ha sido cambiado exitósamente." );
            else 
                System.out.println( "El valor ingresado correspondia al salario actual o es un valor erróneo." );
            
            int opcion = 0;
            
            System.out.println( "El valor de la nomina a pagar este mes al empleado " +
                                empleados[i].consultarNombre() + " es de $" + empleados[i].consultarSalario() );
        }
        
        int id;
        double salario;
        
        System.out.println( "Ingrese el numero de identificacion del empleado para efectuar el pago de las horas: " );
        id = ent.nextInt();
         
        for ( int i = 0; i < 3; i++ ) {
            if ( id == empleados[i].consultarId() ) {
                System.out.println( "Ingrese el pago por hora: ");
                salario = ent.nextDouble();
                if ( empleados[i].anadirPagoHoras( salario ) )
                    System.out.println( "El pago se ha llevado a cabo exitósamente. ");
                else 
                    System.out.println( "El valor ingresado es erróneo. ");
            }   
        }
    }
}
