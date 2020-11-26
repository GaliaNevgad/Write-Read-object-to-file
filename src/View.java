import java.util.ArrayList;
public class View
{
    public void printMessage(String message)
    {
        System.out.println(message);
    }
    public void printYearError() { System.out.println("Incorrect year"); }

    public void printMenuError()
    {
        System.out.println("Incorrect input");
    }
    public void printMenu()
    {
        System.out.println("Type 1 to watch all records");
        System.out.println("Type 2 to write all records to 'records.txt'");
        System.out.println("Type 3 to read all records from 'records.txt'");
        System.out.println("Type 0 to exit");
    }
}
