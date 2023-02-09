public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return firstName + " " + lastName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }

    public boolean equals(Author other) {
        return firstName.equals(other.getFirstName())
                & lastName.equals((other.getLastName()));
    }

    public int hashCode() {
        return java.util.Objects.hash(firstName + lastName);
    }
}
