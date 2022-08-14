package OOP;

public class callingBook {
    public static void main(String[] args) {

        //Create book class object
        Book book1 = new Book();

        //Setting field values
        book1.title = "The Little Prince";
        book1.author = "Antoine de Saint-Exupéry";
        book1.setNumberOfPages(11);

    }
}
