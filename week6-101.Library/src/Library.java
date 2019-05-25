import java.util.ArrayList;

public class Library {

    private ArrayList<Book> bookList;

    public Library() {
        bookList = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        bookList.add(newBook);
    }

    public void printBooks() {
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> searchByTitleList = new ArrayList<Book>();
        for(Book book  : bookList) {
            if (StringUtils.included(book.title(), title)) {
                searchByTitleList.add(book);
            }
        }
        return searchByTitleList;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> searchByPublisherList = new ArrayList<Book>();
        for (Book book : bookList) {
            if (StringUtils.included(book.publisher(), publisher)) {
                searchByPublisherList.add(book);
            }
        }
        return searchByPublisherList;
    }

    public ArrayList<Book> searchByYear (int year) {
        ArrayList<Book> searchByYearList = new ArrayList<Book>();
        for (Book book : bookList) {
            if (book.year() == year) {
                searchByYearList.add(book);
            }
        }
        return searchByYearList;
    }
}
