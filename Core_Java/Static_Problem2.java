import java.util.ArrayList;
import java.util.List;

class BookSeller
{
    public static class Book
    {
        private List<String> bookList = new ArrayList<>();

        public void addBook(String bookName)
        {
            this.bookList.add(bookName);
        }

        public List<String> getBookList()
        {
            return this.bookList;
        }
    }

    public static void sellBooks(int theNumberOfBooKs)
    {
        Book book = new Book();
        for(int j = 0; j < theNumberOfBooKs; j++)
        {
            book.addBook("BOOK" + j);
        }
        System.out.println(book.getBookList().toString());
    }
}


public class Static_Problem2
{
    public static void main(String[] args)
    {
        BookSeller bookSeller = new BookSeller();
        bookSeller.sellBooks(5);
    }
}
