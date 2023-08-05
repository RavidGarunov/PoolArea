package BookDetails;

import java.util.List;

public class Main {

    public static void main(String[] args) {


        BookDetails bookDetails = new BookDetails("Cinayet ve ceza" , "Dostoyevski" , 450 , 1850);

        bookDetails.displayBookDetails();

        bookDetails.updateBookDetails("Con Steynbeyk" , "Sicanlar ve Insanlar" , 200 , 1920);

        bookDetails.displayBookDetails();



    }
}
