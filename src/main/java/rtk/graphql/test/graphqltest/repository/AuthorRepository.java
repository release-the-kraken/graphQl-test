package rtk.graphql.test.graphqltest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rtk.graphql.test.graphqltest.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
