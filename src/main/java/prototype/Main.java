package prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Recommendation newRecommendation = new Recommendation("Fantasy lovers");
        newRecommendation.addBook(new Book("J.R.R Tolkien", "Fellowship of the ring", "Fantasy"));
        newRecommendation.addBook(new Book("George R.R. Martin", "A Game of Thrones", "Fantasy"));
        newRecommendation.addBook(new Book("Patrick Rothfuss", "The Name of the Wind", "Fantasy"));
        newRecommendation.addBook(new Book("Brandon Sanderson", "Mistborn: The Final Empire", "Fantasy"));
        newRecommendation.addBook(new Book("Ursula K. Le Guin", "A Wizard of Earthsea", "Fantasy"));
        Recommendation clonedRecommendation = newRecommendation.clone();


        Book book = newRecommendation.getBookByName("A Wizard of Earthsea");
        book.setTitle("Not wizard!");
        newRecommendation.removeBook(book);
        newRecommendation.displayBooks();
        System.out.println("\n");
        clonedRecommendation.displayBooks();
    }
}
