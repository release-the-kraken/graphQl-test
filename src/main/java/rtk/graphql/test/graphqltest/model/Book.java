package rtk.graphql.test.graphqltest.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "books")
@Getter
@Setter
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    private String name;
    private int pageCount;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    public Book(String name, int pageCount) {
        this.name = name;
        this.pageCount = pageCount;
    }
}
