
package ejercicioestudianteycurso;

public class Estudiante {
    private String nombre;
    private int edad;
    private Curso[] cursos;

    public Estudiante(String nombre, int edad, Curso[] cursos) {
        this.nombre = nombre;
        this.edad = edad;
        this.cursos = cursos;
    }
}