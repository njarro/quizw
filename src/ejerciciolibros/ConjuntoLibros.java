
package ejerciciolibros;

public class ConjuntoLibros {
    private Libro[] libro;

    public ConjuntoLibros () {
        libro = new Libro[10];
    }   
    
    public boolean anadirLibro( Libro libro ) {
        for (int i = 0; i < 10; i++) {
            if ( libro.equals(this.libro[i]) )
                break;
            else if (this.libro[i] == null){
                this.libro[i] = libro;
                return true;
            }
        }
        return false;
    }
    
    public boolean eliminarLibroPorAutor ( Autor autor ) {
        boolean libro_eliminado = false;
        for (int i = 0; i < 10; i++) {
            if ( libro[i] != null ) {
                if ( autor.equals(libro[i].getAutor()) ) {
                libro[i].setTitulo("");
                Autor autor_default = new Autor ( "", "" ); 
                libro[i].setAutor( autor_default );
                libro[i].setNumero_paginas(0);
                libro[i].setCalificacion(0);
                libro_eliminado =  true;
                }
            }
        }
        return libro_eliminado;
    }
    
    public boolean eliminarLibroPorTitulo ( String titulo ) {
        boolean libro_eliminado = false;
        for (int i = 0; i < 10; i++) {
            if ( libro[i] != null ) {
                if ( titulo.equals(libro[i].getTitulo()) ) {
                    libro[i].setTitulo("");
                Autor autor_default = new Autor ( "", "" ); 
                libro[i].setAutor( autor_default );
                libro[i].setNumero_paginas(0);
                libro[i].setCalificacion(0);
                libro_eliminado =  true;
                }
            }
        }
        return libro_eliminado;
    }
    
    public Libro obtenerMejorCalificado () {
        int mejor_calificacion = 0;
        
        for (int i = 0; i < 10; i ++ ){
            if ( libro[i].getCalificacion() > mejor_calificacion )
                mejor_calificacion = i;
            
        }
 
        return libro[ mejor_calificacion ];
    }
    
    public Libro obtenerPeorCalificado () {
        int peor_calificacion = 10;
        
        for (int i = 0; i < 10; i ++ ){
            if ( libro[i].getCalificacion() < peor_calificacion )
                peor_calificacion = i;
            
        }
 
        return libro[ peor_calificacion ];
    }
    
    public Libro[] getLibros () {
        return libro;
    }
    
    
}
