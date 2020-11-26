import java.io.Serializable;

public class Book implements Serializable
{
    private String name;
    private String author;
    private String publishing;
    private String year;

    Book(){
    };

    Book(String name, String author, String publishing, String year){
        this.name = name;
        this.author = author;
        this.publishing = publishing;
        this.year = year;
    }

    public boolean checkAuthor(String author)
    {
        return (author.equals(this.author));
    }

    public boolean checkPublishing(String publishing)
    {
        return (publishing.equals(this.publishing));
    }

    @Override
    public String toString()
    {
        return "\nName:" + this.name + "\nAuthor:" + this.author + "\nPublishing:" + this.publishing + "\nYear:" + this.year;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }

    public void setYear(String year) {
        this.year = year;
    }
    public String getYear() {
        return year;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }
    public String getPublishing() {
        return publishing;
    }
}
