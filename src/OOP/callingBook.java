package OOP;

public class callingBook {
    public static void main(String[] args) {

        //Create book class object (1st book)
        Book book1 = new Book();

        //Setting field values
        book1.title = "The Little Prince";
        book1.author = "Antoine de Saint-Exupéry";
        book1.setNumberOfPages(150);
        book1.printBookInfo();
        System.out.println("-----");

        //Creating new instance of Book class (adding another book)
        Book book2 = new Book();
        book2.title = "Love, Death, Robots";
        book2.author = "JJ Klimt";
        book2.setNumberOfPages(45);
        book2.printBookInfo();
        System.out.println("-----");
    }
}
