public class Book {
    private String name;
    private Author author;
    private int publishingYear;

    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.publishingYear = year;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int newYear) {
        this.publishingYear = newYear;
    }
}
