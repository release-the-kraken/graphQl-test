package rtk.graphql.test.graphqltest.service;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rtk.graphql.test.graphqltest.model.BookDTO;
import rtk.graphql.test.graphqltest.repository.BookRepository;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;


    public BookDTO getBookById(Long id) {
        var book = bookRepository.findById(id)
                .orElseThrow(EntityNotFoundException::new);

        var bookDto = new BookDTO();
        bookDto.setId(book.getId());
        bookDto.setName(book.getName());
        bookDto.setPageCount(book.getPageCount());
        bookDto.setAuthorId(book.getAuthor().getId());

        return bookDto;
    }
}
