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
public class AuthorDTO {
    private String id;
    private String firstName;
    private String lastName;

    private static List<AuthorDTO> authors = Arrays.asList(
            new AuthorDTO("author-1", "Joanne", "Rowling"),
            new AuthorDTO("author-2", "Herman", "Melville"),
            new AuthorDTO("author-3", "Anne", "Rice"));

    public static AuthorDTO getById(String id) {
        return authors.stream().filter(author -> author.getId().equals(id)).findFirst().orElse(null);
    }
}
