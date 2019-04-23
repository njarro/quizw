
package ejerciciolibros;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner ent = new Scanner(System.in);
        
        Libro[] libro = new Libro [10];
        ConjuntoLibros biblioteca = new ConjuntoLibros();
        
        System.out.println( "Ingrese los datos de los libros: ");
        
        for (int i = 0; i < 2; i++) {
            String titulo = "", nombres = "", apellidos = "";
            int n_pags = 0, calificacion = 0, opcion = 0;
            Scanner et = new Scanner(System.in);
            
            System.out.println( "Libro " + (i + 1) + ": ");
            System.out.println( "Titulo del libro: ");
            titulo = et.nextLine();
            System.out.println( "Nombres del autor: ");
            nombres = et.nextLine();
            System.out.println( "Apellidos: ");
            apellidos = et.nextLine();
            System.out.println( "Numero de paginas: ");
            n_pags = et.nextInt();
            
            Autor autor = new Autor( nombres, apellidos );
            libro[i] = new Libro( titulo, autor, n_pags);
            
            System.out.println( "Tu calificacion del libro (Entre 0 y 10): ");
            calificacion = et.nextInt();
            
            libro[i].calificar( calificacion );
            
            System.out.println( "Deseas agregar este libro a la biblioteca?\n1. Si\n2. No");
            opcion = et.nextInt();
            
            if ( opcion == 1 ) {
                biblioteca.anadirLibro( libro[i] );
            }
        }
        String titulo, nombres, apellidos;
        
        System.out.println( "Eliminacion por titulo. Ingresa el titulo del libro: ");
        titulo = ent.nextLine();
        
        biblioteca.eliminarLibroPorTitulo( titulo );
        
        System.out.println( "Eliminacion por autor:");
        System.out.println( "Nombres del autor: ");
        nombres = ent.nextLine();
        System.out.println( "Apellidos del autor: ");
        apellidos = ent.nextLine();
        
        Autor autor_buscado = new Autor( nombres, apellidos );
        biblioteca.eliminarLibroPorAutor( autor_buscado );
        
        System.out.println( "Lista de libros guardados en la biblioteca: ");
        
        Libro[] libros_almacenados = new Libro[10];
        libros_almacenados = biblioteca.getLibros();
        
        for ( int i = 0, j = 0; libros_almacenados[i] != null && i < 10; i++, j++ ) {
            if ( !( ( libros_almacenados[i].getTitulo() ).equals("") ) ) {
                System.out.println( "Libro " + (j + 1) );
                System.out.println( "Titulo: " + libros_almacenados[i].getTitulo() );
                Autor autor_lib = libros_almacenados[i].getAutor();
                System.out.println( "Autor: " + autor_lib.getNombres() + " " + autor_lib.getApellidos() );
                System.out.println( "Numero de paginas: " + libros_almacenados[i].getNumero_paginas() );
                System.out.println( "Calificacion: " + libros_almacenados[i].getCalificacion() );
            } else {
               j--; 
            }
        }
    }
}
