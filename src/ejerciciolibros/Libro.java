
package ejerciciolibros;

public class Libro {
    private String titulo;
    private Autor autor;
    private int numero_paginas;
    private int calificacion;
    
    public Libro( String titulo, Autor autor, int numero_paginas ) {
        this.titulo = titulo;
        this.autor = autor;
        this.numero_paginas = numero_paginas;
    }
    
    public boolean calificar ( int calificacion ) {
        if ( calificacion >= 0 && calificacion <= 10 ) {
            this.calificacion = calificacion;
            return true;
        } else return false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getNumero_paginas() {
        return numero_paginas;
    }

    public void setNumero_paginas(int numero_paginas) {
        this.numero_paginas = numero_paginas;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
    
}
