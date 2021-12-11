package com.example.firstproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.firstproject.entity.Article;
														//<관리대상 엔티티,  
public interface FindAllRepository extends JpaRepository<Article, String> {
	//List<Article> findAllByChargeStYmdBeteen(String stYmd, String endYmd);
	//public Optional<Article> findById(String stYmd);
}
