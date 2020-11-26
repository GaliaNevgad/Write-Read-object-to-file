import org.jetbrains.annotations.NotNull;

public class main
{
    public static void main(String[] args)
    {
        View view = new View();
        ResultCalculator res = new ResultCalculator();
        Book[] books = new Book[5];

        for(int i = 0; i < 5; i++)
        {
            books[i] = new Book();
        }

        view.printMessage("Hello, here's the menu");

        res.doAction(books, view);

    }
}
