package com.example.firstproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.ToString;


@Entity // db에서 entity로 인식할 수 있도록
@AllArgsConstructor
@ToString
public class Article {
	@Id //대표값으로 지정 like 주민번호
	@GeneratedValue // 1, 2, 3 자동 생성 어노테이션
	private Long id;
	
	@Column //db에서 컬럼으로 인식할 수 있도록 
	private String title;
	
	@Column
	private String content;
	
	/*
	 * public Article(Long id, String title, String content ) { this.id = id;
	 * this.title = title; this.content = content; }
	 * 
	 * 
	 * @Override public String toString() { return "Article{" + "id='" + id + '\'' +
	 * "title='" + title + '\'' + ", content='" + content + '\'' + '}'; }
	 */
	
}
