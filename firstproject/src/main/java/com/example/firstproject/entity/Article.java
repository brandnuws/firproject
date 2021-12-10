package com.example.firstproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity// db에서 entity로 인식할 수 있도록
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
 * @Entity // db에서 entity로 인식할 수 있도록
 * 
 * @AllArgsConstructor
 * 
 * @ToString public class Article {
 * 
 * @Id //대표값으로 지정 like 주민번호
 * 
 * @GeneratedValue // 1, 2, 3 자동 생성 어노테이션 private Long id;
 * 
 * @Column //db에서 컬럼으로 인식할 수 있도록 private String title;
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
