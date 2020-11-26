import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


public class ResultCalculator
{
    private ArrayList<Book> neededBooks = new ArrayList<>();
    private final BookComparator bc = new BookComparator();

    public void doAction(Book[] books, View view1)
    {
        Book b1 = new Book("1984", "George Orwell", "Secker and Warburg", "1949");
        Book b2 = new Book("Fahrenheit 451", "Ray Douglas Bradbury", "Ballantine Books", "1953");
        Book b3 = new Book("Sapiens", "Yuval Noah Harari", "Kinneret Zmora-Bitan Dvir", "2013");
        Book b4 = new Book("Homo Deus", "Yuval Noah Harari", "Kinneret Zmora-Bitan Dvir", "2015");
        Book b5 = new Book("The Da Vinci Code", "Dan Brown", "Doubleday", "2003");

        InputController input = new InputController();
        int action = input.inputMenuItem(view1);
        switch (action) {
            case 1 : {
                System.out.println(b1 + "\n" + b2 + "\n" + b3 + "\n" + b4 + "\n" + b5 + "\n");
                break;
            }

            case 2 : {
                try{
                    FileOutputStream f = new FileOutputStream(new File("/Users/koshelbogdan/Desktop/IO/books.txt"));
                    ObjectOutputStream o = new ObjectOutputStream(f);
                    o.writeObject(b1);
                    o.writeObject(b2);
                    o.writeObject(b3);
                    o.writeObject(b4);
                    o.writeObject(b5);

                    o.close();
                    f.close();
                    break;
                }
                catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            case 3 : {
                try {
                    FileInputStream fi = new FileInputStream(new File("/Users/koshelbogdan/Desktop/IO/books.txt"));
                    ObjectInputStream oi = new ObjectInputStream(fi);

                    Book bk1 = (Book) oi.readObject();
                    Book bk2 = (Book) oi.readObject();
                    Book bk3 = (Book) oi.readObject();
                    Book bk4 = (Book) oi.readObject();
                    Book bk5 = (Book) oi.readObject();

                    System.out.println(bk1.toString());
                    System.out.println(bk2.toString());
                    System.out.println(bk3.toString());
                    System.out.println(bk4.toString());
                    System.out.println(bk5.toString());

                    oi.close();
                    fi.close();
                    break;
                }
                catch (IOException | ClassNotFoundException e)
                {
                    System.out.println("File named 'records.txt' doesn't exist");
                }
            }
            case 0 : System.exit(0);

        }
    }
}
