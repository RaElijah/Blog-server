package me.kimguyseok.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.kimguyseok.springbootdeveloper.domain.Article;
import me.kimguyseok.springbootdeveloper.dto.AddArticleRequest;
import me.kimguyseok.springbootdeveloper.repository.BolgRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BolgRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
}
