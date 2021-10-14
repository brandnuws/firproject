package com.example.firstproject.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.firstproject.entity.Article;
														//<관리대상 엔티티,  
public interface FindAllRepository extends JpaRepository<Article, String> {
}
