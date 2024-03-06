package Actividad3;

public class Student {
    private String nombre;
    private int edad;
    private String curso;

    public Student(String nombre, int edad, String curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }

    public String getInfo() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Curso: " + curso;
    }
}
