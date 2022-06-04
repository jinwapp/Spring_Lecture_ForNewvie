package com.example.firstproject.api;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //REST 컨트롤러 ! 데이터 (JSON)를 반환
public class ArticleApiController {

    // GET : Read
    @Autowired // Dependency Injection
    private ArticleRepository articleRepository;

    @GetMapping ("/api/articles")
    public List<Article> index() {
        return articleRepository.findAll();
    }

    @GetMapping ("/api/articles/{id}")
    public Article index(@PathVariable Long id) {
        return articleRepository.findById(id).orElse(null);
    }

    // POST : Create
    @PostMapping("/api/articles")
    public Article create(@RequestBody ArticleForm dto) {
        Article article = dto.toEntity();
        return articleRepository.save(article);
    }

    // PATCH : Upgrade

    // Delete : Delete

}
