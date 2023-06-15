
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean equals(Object compared) {
        if(this == compared) {
            System.out.println("1");
            return true;
        }

        if(!(compared instanceof Book)) {
            System.out.println("2");
            return false;
        }

        Book comp = (Book) compared;
        if(this.name.equals(comp.name) && this.publicationYear == comp.publicationYear) {
            System.out.println("3");
            return true;
        }
        System.out.println("4");
        return false;
    }

}
