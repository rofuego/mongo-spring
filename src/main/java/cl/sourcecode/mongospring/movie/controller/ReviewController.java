package cl.sourcecode.mongospring.movie.controller;

import cl.sourcecode.mongospring.movie.model.Review;
import cl.sourcecode.mongospring.movie.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("api/v1/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping("")
    public ResponseEntity<Review> saveReview(@RequestBody Map<String, String> payload){
        return new ResponseEntity<>(reviewService.saveReview(payload.get("reviewBody"), payload.get("imdbId")), HttpStatus.CREATED);
    }
}
