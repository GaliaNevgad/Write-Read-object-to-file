import java.util.Comparator;

public class BookComparator implements Comparator<Book>
{
    @Override
    public int compare(Book a, Book b)
    {
        return a.getPublishing().compareTo(b.getPublishing());
    }
}
