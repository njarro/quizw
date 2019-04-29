
package ejerciciofamilia;

import java.util.Scanner;

public class Main {
    public static void main( String args[] ) {
        Scanner et = new Scanner(System.in);
        Familia[] familias = new Familia[5];
        int opcion = 0;
        
        System.out.println( "Que desea?:\n1. Ingresar una nueva familia.\n2. Consultar familia.\n3. Consultar miembro." );
        do {
            opcion = et.nextInt();
            if( opcion < 1 || opcion > 3 ) 
                System.out.println("Valor erroneo. Ingreselo de nuevo:");
        } while( opcion < 1 || opcion > 3 );
        
        switch (opcion) {
            case(1):
                String apellidos_familia = "";
                System.out.println("Ingrese los apellidos de la familia:");
                apellidos_familia = et.nextLine();
                familias[0] = new Familia( apellidos_familia );
                
                final int N_MIEMBROS = 4;
                System.out.println( "A continuacion debera ingresar los datos de los " + N_MIEMBROS + " de la familia.");
                
                for ( int i = 0; i < N_MIEMBROS; ++i ) {
                    String nombre = "", apellido = "";
                    int sexo = 0, edad = 0, rol = 0;
                    boolean fueAgregado = false;
                    
                    do {
                        System.out.println("Que rol tendra la persona?:\n1. Padre\n2. Madre\n3. Hijo mayor\n4.Hijo menor");
                        do {
                            opcion = et.nextInt();
                            if( opcion < 1 || opcion > 4 ) 
                                System.out.println("Valor erroneo. Ingreselo de nuevo:");
                        } while( opcion < 1 || opcion > 4 );

                        System.out.println("Nombre: ");
                        nombre = et.nextLine();
                        System.out.println("Apellido: ");
                        apellido = et.nextLine();
                        System.out.println("Edad: ");
                        edad = et.nextInt();
                        System.out.println("Sexo:\n1. Masculino\n2. Femenino ");
                        do {
                            sexo = et.nextInt();
                            if( sexo != 1 && sexo != 2 ) 
                                System.out.println("Valor erroneo. Ingreselo de nuevo:");
                        } while( sexo != 1 && sexo != 2 );

                        fueAgregado = familias[0].agregarMiembro( nombre, apellido, edad, sexo, rol - 1 );

                        if (fueAgregado) 
                            System.out.println( "La persona ha sido agregada exitosamente." );
                        else 
                            System.out.println( "Existe una persona con el mismo rol. Ingrese los datos de otra persona con un rol diferente" );
                    }while( !fueAgregado );
                }
                break;
            case(2):
                break;
            case(3):
                break;
            default:
                System.out.println( "El numero ingresado no es valido.");
        }
    }
}
