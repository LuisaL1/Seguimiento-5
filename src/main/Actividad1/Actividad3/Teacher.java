package Actividad3;

public class Teacher {
    private String nombre;
    private int edad;
    private String materia;

    public Teacher(String nombre, int edad, String materia) {
        this.nombre = nombre;
        this.edad = edad;
        this.materia = materia;
    }

    public String getInfo() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Materia: " + materia;
    }
}
