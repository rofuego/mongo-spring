package cl.sourcecode.mongospring.movie.model;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    private ObjectId id;
    private String reviewBody;

    public Review(String reviewBody) {
        this.reviewBody = reviewBody;
    }
}
