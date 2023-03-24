package rtk.graphql.test.graphqltest.model;

import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BookDTO {
    private String id;
    private String name;
    private int pageCount;
    private String authorId;

    private static List<BookDTO> books = Arrays.asList(
            new BookDTO("book-1", "Harry Potter and the Philosopher's Stone", 223, "author-1"),
            new BookDTO("book-2", "Moby Dick", 635, "author-2"),
            new BookDTO("book-3", "Interview with the vampire", 371, "author-3")
    );

    public static BookDTO getById(String id) {
        return books.stream().filter(book -> book.getId().equals(id)).findFirst().orElse(null);
    }
}
