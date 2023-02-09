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

    public String toString() {
        return "book: " + name
                + " by: " + author
                + ", published: " + publishingYear;
    }

    public boolean equals(Book other) {
        return name.equals(other.getName())
                & author.equals(other.getAuthor())
                & publishingYear == other.getPublishingYear();
    }

    public int hashCode() {
        return java.util.Objects.hash(name + author);
    }
}
