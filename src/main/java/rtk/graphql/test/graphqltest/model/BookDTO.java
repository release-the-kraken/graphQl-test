package rtk.graphql.test.graphqltest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BookDTO {
    private long id;
    private String name;
    private int pageCount;
    private long authorId;
}
