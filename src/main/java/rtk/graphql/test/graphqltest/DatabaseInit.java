package rtk.graphql.test.graphqltest;

import lombok.RequiredArgsConstructor;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import rtk.graphql.test.graphqltest.model.Author;
import rtk.graphql.test.graphqltest.model.Book;
import rtk.graphql.test.graphqltest.repository.AuthorRepository;
@Component
@RequiredArgsConstructor
public class DatabaseInit {

    private final AuthorRepository repository;

    @EventListener(ContextRefreshedEvent.class)
    void initializeData() {
        var author1 = new Author("Joanne", "Rowling");
        var author2 = new Author("Herman", "Melville");
        var author3 = new Author("Anne", "Rice");

        author1.addBook(new Book("Harry Potter and the Philosopher's Stone", 223));
        author2.addBook(new Book("Moby Dick", 635));
        author3.addBook(new Book("Interview with a vampire", 371));

        repository.save(author1);
        repository.save(author2);
        repository.save(author3);
    }
}
