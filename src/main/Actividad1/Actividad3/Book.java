package Actividad3;

public class Book {
    private String titulo;
    private String autor;
    private int paginas;

    public Book(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getInfo() {
        return "Título: " + titulo + ", Autor: " + autor + ", Páginas: " + paginas;
    }
}
