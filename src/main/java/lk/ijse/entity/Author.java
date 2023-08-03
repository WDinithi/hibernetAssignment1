package lk.ijse.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Author {
    @Id
    String A_id;
    String First_name;
    String Last_name;

    public List<Book> books() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @OneToMany(mappedBy = "Book")
    private List<Book> books;

    public Author() {

    }

    public Author(String A_id, String First_name, String Last_name) {
        this.A_id = A_id;
        this.First_name = First_name;
        this.Last_name = Last_name;

    }

    public void setA_id(String a_id) {
        A_id = a_id;
    }


    public void setFirst_name(String first_name) {
        First_name = first_name;
    }

    public void setLast_name(String last_name) {
        Last_name = last_name;
    }
}

