import java.util.HashSet;
import java.util.Set;

class Book
{
    private int id;
    private String isbn;
    private String name;
    private String author;
    private String publish_date;

    Book(int id, String isbn, String name, String author, String publish_date)
    {
        this.id = id;
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.publish_date = publish_date;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Book)
        {
            if(((Book) obj).isbn == this.isbn)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return true;
        }
    }

    @Override
    public final int hashCode()
    {
        return this.isbn.hashCode();
    }
}

public class Static_Problem
{
    private static Set<Book> bookSet = new HashSet<>();
    static
    {
        bookSet.add(new Book(1,"000-0-00-000000-1", "test1", "author1", "2022-09-04"));
        bookSet.add(new Book(2,"000-0-00-000000-2", "test2", "author2", "2022-09-04"));
        bookSet.add(new Book(3,"000-0-00-000000-3", "test3", "author3", "2022-09-04"));
        bookSet.add(new Book(4,"000-0-00-000000-4", "test4", "author4", "2022-09-04"));
        bookSet.add(new Book(5,"000-0-00-000000-5", "test5", "author5", "2022-09-04"));
    }

    public static void main(String[] args)
    {
        System.out.println(bookSet.size());
    }
}
