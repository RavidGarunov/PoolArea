package BookDetails;

public class BookDetails {

    private String title;
    private String author;
    private int yearPublished;
    private int pageCount;




    public BookDetails() {

        this.title = "Unknown";
        this.author = "Unknown";
        this.pageCount=0;
        this.yearPublished=0;
    }

    public BookDetails(String title, String author, int yearPublished, int pageCount) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.pageCount = pageCount;
    }

    public void updateBookDetails (String title,String author,int yearPublished , int pageCount ){

        this.title = title;
        this.author = author;
        this.yearPublished=yearPublished;
        this.pageCount=pageCount;

    }

    public void displayBookDetails () {
        System.out.println(" Title: " + title +
                         "\n Author: " + author +
                         "\n Published year: " + yearPublished +
                         "\n Pages: " + pageCount);

    }





}
