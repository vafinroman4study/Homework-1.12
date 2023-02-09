public class Main {
    public static void main(String[] args) {
        Author camus = new Author("Albert", "Camus");
        Author burd = new Author("Barry", "Burd");
        Book bookPlague = new Book("The Plague", camus, 2000);
        Book bookJava = new Book("JAVA for dummies", burd, 2015);

        System.out.println("camus.getFirstName() + camus.getLastName() = "
                + camus.getFirstName() + camus.getLastName());
        System.out.println("burd.getFirstName() + burd.getFirstName() = "
                + burd.getFirstName() + burd.getFirstName());

        System.out.println("bookJava.getName() = " + bookJava.getName());
        System.out.println("bookJava.getAuthor() = " + bookJava.getAuthor());
        System.out.println("bookJava.getPublishingYear() = " + bookJava.getPublishingYear());
        bookJava.setPublishingYear(2017);
        System.out.println("bookJava.getPublishingYear() = " + bookJava.getPublishingYear());
    }
}