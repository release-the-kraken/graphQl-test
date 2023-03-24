package rtk.graphql.test.graphqltest.service;

import jakarta.persistence.EntityExistsException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rtk.graphql.test.graphqltest.model.AuthorDTO;
import rtk.graphql.test.graphqltest.repository.AuthorRepository;

@Service
@RequiredArgsConstructor
public class AuthorService {

    private final AuthorRepository repository;


    public AuthorDTO getAuthorById(long id) {
        var author = repository.findById(id)
                .orElseThrow(EntityExistsException::new);

        var authorDto = new AuthorDTO();

        authorDto.setId(author.getId());
        authorDto.setFirstName(author.getFirstName());
        authorDto.setLastName(author.getLastName());

        return authorDto;
    }
}
