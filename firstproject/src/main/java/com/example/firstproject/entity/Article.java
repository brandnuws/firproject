package com.example.firstproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity// db���� entity�� �ν��� �� �ֵ���
@Table(name="KEV_KET0040")
@Getter
@Setter
@ToString
public class Article {
	@Id
	@Column(name = "CHARGE_HIST_ID")
	private String chargeHistId;

	@Column(name = "MEMB_ID")
	private String membId;

	@Column(name = "CHARGE_ST_DATE")
	private String chargeStDate;

	@Column(name = "CHARGE_END_DATE")
	private String chargeEndDate;

	@Column(name = "MEMB_CARD_NO")
	private String membCardNo;

	/*
	 * public Article(Long id, String title, String content ) { this.id = id;
	 * this.title = title; this.content = content; }
	 * 
	 * 
	 * @Override public String toString() { return "Article{" + "id='" + id + '\'' +
	 * "title='" + title + '\'' + ", content='" + content + '\'' + '}'; }
	 */

}



/*
 * @Entity // db���� entity�� �ν��� �� �ֵ���
 * 
 * @AllArgsConstructor
 * 
 * @ToString public class Article {
 * 
 * @Id //��ǥ������ ���� like �ֹι�ȣ
 * 
 * @GeneratedValue // 1, 2, 3 �ڵ� ���� ������̼� private Long id;
 * 
 * @Column //db���� �÷����� �ν��� �� �ֵ��� private String title;
 * 
 * @Column private String content;
 * 
 * 
 * public Article(Long id, String title, String content ) { this.id = id;
 * this.title = title; this.content = content; }
 * 
 * 
 * @Override public String toString() { return "Article{" + "id='" + id + '\'' +
 * "title='" + title + '\'' + ", content='" + content + '\'' + '}'; }
 * 
 * 
 * }
 */
