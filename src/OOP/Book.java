package OOP;

import java.sql.SQLOutput;

public class Book {

    //Fields
    public String title;
    public String author;
    private int numberOfPages; //private field


    //Setter Method
    public void setNumberOfPages(int numberOfPages){
        if(isNumberOfPagesCorrect(numberOfPages)){
            this.numberOfPages = numberOfPages;
        } else{
            System.out.println("The provided number of pages is not correct: " + numberOfPages);
        }
    }

    //Getter method

    public int getNumberOfPages() {
        return numberOfPages;
    }

    private boolean isNumberOfPagesCorrect(int numberOfPages){
        return numberOfPages > 10;
    }
    public void printBookInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Number of pages: " + numberOfPages);

    }
}
