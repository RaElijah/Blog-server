package me.kimguyseok.springbootdeveloper.repository;

import me.kimguyseok.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
