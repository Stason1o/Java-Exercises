package secondTask.com.endava.libraryclasses;

/**
 * Created by sbogdanschi on 15/03/2017.
 */
public class Book {
    private String name;
    private int publishYear;
    private int pages;
    private Author author;

    public Book() {
    }

    public Book(String name, int publishYear, int pages, Author author) {
        this.name = name;
        this.publishYear = publishYear;
        this.pages = pages;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        if (publishYear != book.publishYear) return false;
        if (pages != book.pages) return false;
        if (!name.equals(book.name)) return false;
        return author.equals(book.author);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + publishYear;
        result = 31 * result + pages;
        result = 31 * result + author.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", publishYear=" + publishYear +
                ", pages=" + pages +
                ", author=" + author +
                '}';
    }
}
