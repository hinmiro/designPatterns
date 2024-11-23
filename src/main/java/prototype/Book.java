package prototype;

import java.util.logging.Logger;

public class Book implements Cloneable {
    private String author;
    private String title;
    private String genre;
    private Logger logger;

    public Book(String a, String t, String g) {
        this.author = a;
        this.title = t;
        this.genre = g;
        logger = Logger.getLogger(Book.class.getName());
    }

    @Override
    public Book clone() throws CloneNotSupportedException {
        logger.info("Cloning book " + title);
        return (Book) super.clone();
    }

    public void setAuthor(String a) {
        author = a;
    }

    public void setTitle(String t) {
        logger.info("Changing title from " + title + " to " + t);
        title = t;
    }

    public void setGenre(String g) {
        genre = g;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title+"\n"+author+"\n"+genre+"\n";
    }
}
