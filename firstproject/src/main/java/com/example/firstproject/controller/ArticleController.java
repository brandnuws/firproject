package com.example.firstproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import com.example.firstproject.repository.FindAllRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@RequiredArgsConstructor //final �ʵ尪�� �˾Ƽ� ������
@Controller
public class ArticleController {
	@Autowired //��������Ʈ�� �̸� �����س��� ��ü�� �����ٰ� �ڵ� ����!
	//�������͸� ��ü �ڵ� ���Ե�! RequiredArgsConstructor
	private final ArticleRepository articleRepository;
	private final FindAllRepository findAllRepository;
	@GetMapping("/articles")
	public String index(Model model, Pageable pageable) {
		// ��� Article�� ������
        // Iterable �������̽��� ArrayList�� �θ� �������̽�
		//PageRequest pageRequest = new PageRequest(pNo - 1,10, Sort.Direction.DESC, "ename");
		
		// �� �������� articles ����!
		model.addAttribute("articles", findAllRepository.findAll(pageable));
		 // �� ������ ����
		return "articles/index";
		/*
		 * @GetMapping("/articles") public String index(Model model) { // ��� Article��
		 * ������ // Iterable �������̽��� ArrayList�� �θ� �������̽� Iterable<Article> articleList =
		 * articleRepository.findAll(); // �� �������� articles ����!
		 * model.addAttribute("articles", articleList); // �� ������ ���� return
		 * "articles/index";
		 */
	}
	
	
	
	@GetMapping("/articles/new")
	public String newArticleForm() {
		return "/articles/new";
	}
	
	/*
	 * @PostMapping("/articles/create") public String createArticle(ArticleForm
	 * form) { //System.out.println(form.toString()); --> �α����� ��ü
	 * log.info(form.toString()); // dto�� entity��
	 * 
	 * Article article = form.toEntity(); //System.out.println(article.toString());
	 * log.info(article.toString());
	 * 
	 * // repo �� entity�� db�ȿ� ���� Article saved = articleRepository.save(article);
	 * //System.out.println(saved.toString()); log.info(saved.toString()); return
	 * ""; }
	 */
}
