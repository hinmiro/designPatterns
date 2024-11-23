package prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.logging.Logger;

public class Recommendation implements Cloneable {
    private String targetAudience;
    private List<Book> books;
    private Logger logger;

    public Recommendation(String targetAudience) {
        this.targetAudience = targetAudience;
        books = new ArrayList<>();
        logger = Logger.getLogger(Recommendation.class.getName());
    }

//    public Recommendation(String targetAudience, ArrayList<Book> b) {
//        this.targetAudience = targetAudience;
//        this.books = b;
//        logger = Logger.getLogger(Recommendation.class.getName());
//    }

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public Recommendation clone() throws CloneNotSupportedException {
        logger.info("Cloning Recommendation class...");
        List<Book> clonedBooks = new ArrayList<>();
        for (Book b : books) {
            clonedBooks.add(b.clone());
        }
        Recommendation clonedRec = (Recommendation) super.clone();
        clonedRec.books = clonedBooks;
        return clonedRec;
    }

    public void changeTargetAudience(String newAudience) {
        logger.info("Changing target audience to " + newAudience);
        targetAudience = newAudience;
    }

    public Book getBookByName(String name) {
        logger.info("Finding book named " + name + "...");
        return books.stream().filter(book -> book.getTitle().equals(name)).findFirst().orElse(null);
    }

    public void removeBook(Book book) {
        books.remove(book);
        logger.info("Book " + book.getTitle() + " removed from system.");
    }

    public void displayBooks() {
        for (Book b : books) {
            System.out.println(b.toString());;
        }
    }
}
