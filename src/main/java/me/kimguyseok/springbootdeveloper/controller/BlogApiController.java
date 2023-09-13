package me.kimguyseok.springbootdeveloper.controller;

import lombok.RequiredArgsConstructor;
import me.kimguyseok.springbootdeveloper.domain.Article;
import me.kimguyseok.springbootdeveloper.dto.AddArticleRequest;
import me.kimguyseok.springbootdeveloper.service.BlogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class BlogApiController {

    private final BlogService blogService;

    @PostMapping("/api/articles")
    public ResponseEntity<Article> addArticle(@RequestBody AddArticleRequest request) {
        Article savedArticle = blogService.save(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedArticle);
    }
}

