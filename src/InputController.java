import java.util.Scanner;

public class InputController
{
    private static final Scanner inputInt = new Scanner(System.in);
    private static final Scanner inputString = new Scanner(System.in);

    public static int inputMenuItem(View view)
    {
        view.printMenu();
        while(!inputInt.hasNextInt())
        {
            view.printMenuError();
            inputInt.next();
        }
        return inputInt.nextInt();
    }

    public static String inputString()
    {
        return inputString.nextLine();
    }

    public static int inputInt(View view)
    {
        while(!inputInt.hasNextInt())
        {
            view.printYearError();
            inputInt.next();
        }
        return inputInt.nextInt();
    }

}
