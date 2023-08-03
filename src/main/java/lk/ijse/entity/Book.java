package lk.ijse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Book {
    @Id
    String B_id;
    String B_name;
    String ISBN;

    public void setB_id(String b_id) {
        B_id = b_id;
    }
    public void setAuthor(Author author){
        this.author=author;

    }

    @ManyToOne
    public Author author;

    public void setB_name(String b_name) {
        B_name = b_name;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Book(){

    }
    public Book(String B_id, String B_name, String ISBN){

    }



}
