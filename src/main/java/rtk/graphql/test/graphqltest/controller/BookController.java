package rtk.graphql.test.graphqltest.controller;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import rtk.graphql.test.graphqltest.model.AuthorDTO;
import rtk.graphql.test.graphqltest.model.BookDTO;


@Controller
public class BookController {
    @QueryMapping
    public BookDTO bookById(@Argument String id) {
        return BookDTO.getById(id);
    }

    @SchemaMapping
    public AuthorDTO author(BookDTO book) {
        return AuthorDTO.getById(book.getAuthorId());
    }
}
