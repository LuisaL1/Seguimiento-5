package Actividad6;

public class Movie {
    private String title;
    private String protagonist;
    private String director;
    private float price;

    public Movie(String title, String protagonist, String director, float price) {
        this.title = title;
        this.protagonist = protagonist;
        this.director = director;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProtagonist() {
        return protagonist;
    }

    public void setProtagonist(String protagonist) {
        this.protagonist = protagonist;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", protagonist='" + protagonist + '\'' +
                ", director='" + director + '\'' +
                ", price=" + price +
                '}';
    }
}
