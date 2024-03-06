package Actividad3;
    public class Main {
        public static void main(String[] args) {
            Book book = new Book("El Señor de los Anillos", "J.R.R. Tolkien", 1000);
            Student student = new Student("Juan", 20, "Ingeniería");
            Teacher teacher = new Teacher("María", 35, "Matemáticas");
            System.out.println("Detalles del libro:");
            System.out.println(book.getInfo());
            System.out.println("\nDetalles del alumno:");
            System.out.println(student.getInfo());
            System.out.println("\nDetalles del profesor:");
            System.out.println(teacher.getInfo());
        }
    }
