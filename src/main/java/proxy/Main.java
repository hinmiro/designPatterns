package proxy;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        User masa = new User("masa1");
        User john = new User("john1");
        User reetta = new User("repe");

        Document file1 = library.createUnprotectedDocument("This is unprotected document", masa);
        Document file2 = library.createProtectedDocument("This is protected document", john);
        Document file3 = library.createProtectedDocument("maybe not", reetta);

        // Reading unprotected document
        System.out.println(file1.getContent(john));

        // Reading protected document
        try {
            System.out.println(file2.getContent(masa));
        } catch (AccessDeniedException e) {
            System.out.print("Error: " + e.getMessage());
        }
        System.out.println("\n" + file2.getContent(john));

        // File 3 Demo
        System.out.println("File 3 creation time: " + file3.getCreationDate());
        System.out.println("File 3 id: " + file3.getIdentifier());
        try {
            System.out.println("File 3 content wrong user: " + file3.getContent(john));

        } catch (AccessDeniedException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("File 3 content Right user: " + file3.getContent(reetta));


    }
}
