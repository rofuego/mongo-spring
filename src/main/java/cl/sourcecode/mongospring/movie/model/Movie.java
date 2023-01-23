package cl.sourcecode.mongospring.movie.model;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "movies")
public class Movie {

    private ObjectId id;

    private String imdbId;

    private String title;

    private String releaseDate;

    private String trailerLink;

    private String poster;

    private List<String> genres;

    private List<String> backdrops;

    @DocumentReference
    private List<Review> reviewIds;

}
