package com.example.firstproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;

import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j
public class ArticleController {
	@Autowired //스프링부트가 미리 생성해놓은 객체를 가져다가 자동 연결!
	private ArticleRepository articleRepository;
	
	@GetMapping("/articles/new")
	public String newArticleForm() {
		return "/articles/new";
	}
	
	@PostMapping("/articles/create")
	public String createArticle(ArticleForm form) {
	//System.out.println(form.toString()); --> 로깅으로 대체
		log.info(form.toString());
		// dto를 entity로
		
	Article article = form.toEntity();
	//System.out.println(article.toString());	
		log.info(article.toString());
		
		// repo 로 entity룰 db안에 저장
	Article saved = articleRepository.save(article);
	//System.out.println(saved.toString());
		log.info(saved.toString());
		return "";
	}
}
