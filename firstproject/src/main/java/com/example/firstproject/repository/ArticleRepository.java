package com.example.firstproject.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.firstproject.entity.Article;
														//<������� ��ƼƼ,  
public interface ArticleRepository extends CrudRepository<Article, Long> {

}
