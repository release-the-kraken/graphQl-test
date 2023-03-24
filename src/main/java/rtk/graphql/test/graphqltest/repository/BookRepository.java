package rtk.graphql.test.graphqltest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rtk.graphql.test.graphqltest.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
