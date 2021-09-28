package com.example.firstproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@RequiredArgsConstructor //final �ʵ尪�� �˾Ƽ� ������
@Controller
public class ArticleController {
	@Autowired //��������Ʈ�� �̸� �����س��� ��ü�� �����ٰ� �ڵ� ����!
	
	//�������͸� ��ü �ڵ� ���Ե�! RequiredArgsConstructor
	private final ArticleRepository articleRepository;
	
	@GetMapping("/articles")
	public String index(Model model) {
		// ��� Article�� ������
        // Iterable �������̽��� ArrayList�� �θ� �������̽�
		Iterable<Article> articleList = articleRepository.findAll();
		// �� �������� articles ����!
		model.addAttribute("articles", articleList);
		 // �� ������ ����
		return "articles/index";
	}
	
	
	
	@GetMapping("/articles/new")
	public String newArticleForm() {
		return "/articles/new";
	}
	
	@PostMapping("/articles/create")
	public String createArticle(ArticleForm form) {
	//System.out.println(form.toString()); --> �α����� ��ü
		log.info(form.toString());
		// dto�� entity��
		
	Article article = form.toEntity();
	//System.out.println(article.toString());	
		log.info(article.toString());
		
		// repo �� entity�� db�ȿ� ����
	Article saved = articleRepository.save(article);
	//System.out.println(saved.toString());
		log.info(saved.toString());
		return "";
	}
}
