package rtk.graphql.test.graphqltest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import rtk.graphql.test.graphqltest.model.AuthorDTO;
import rtk.graphql.test.graphqltest.model.BookDTO;
import rtk.graphql.test.graphqltest.service.AuthorService;
import rtk.graphql.test.graphqltest.service.BookService;


@Controller
@RequiredArgsConstructor
public class BookController {

    private final AuthorService authorService;
    private final BookService bookService;

    @QueryMapping
    public BookDTO bookById(@Argument Long id) {
        return bookService.getBookById(id);
    }

    @SchemaMapping
    public AuthorDTO author(BookDTO book) {
        return authorService.getAuthorById(book.getAuthorId());
    }
}
