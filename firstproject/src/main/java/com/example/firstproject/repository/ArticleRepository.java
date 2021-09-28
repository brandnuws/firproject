package com.example.firstproject.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.firstproject.entity.Article;
														//<관리대상 엔티티,  
public interface ArticleRepository extends CrudRepository<Article, Long> {

}
