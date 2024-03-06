package Actividad4;

public class Concessionaire {
    private String nombre;
    private String direccion;
    private int cantidadDeCarros;

    public Concessionaire(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantidadDeCarros = 0; // Inicialmente no hay carros en el concesionario
    }

    public void agregarCarro(int cantidad) {
        cantidadDeCarros += cantidad;
    }

    public void eliminarCarro(int cantidad) {
        cantidadDeCarros -= cantidad;
        // Asegurarse de que la cantidad de carros no sea negativa
        if (cantidadDeCarros < 0) {
            cantidadDeCarros = 0;
        }
    }

    public String getInfo() {
        return "Nombre: " + nombre + ", Dirección: " + direccion + ", Cantidad de carros: " + cantidadDeCarros;
    }

    public boolean venderCarro(int cantidad) {
        if (cantidadDeCarros >= cantidad) {
            cantidadDeCarros -= cantidad;
            return true;
        } else {
            return false;
        }
    }

    public void mostrarCarros() {
        System.out.println("Cantidad de carros disponibles: " + cantidadDeCarros);
    }
}
