package com.example.firstproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.ToString;


@Entity // db���� entity�� �ν��� �� �ֵ���
@AllArgsConstructor
@ToString
public class Article {
	@Id //��ǥ������ ���� like �ֹι�ȣ
	@GeneratedValue // 1, 2, 3 �ڵ� ���� ������̼�
	private Long id;
	
	@Column //db���� �÷����� �ν��� �� �ֵ��� 
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
