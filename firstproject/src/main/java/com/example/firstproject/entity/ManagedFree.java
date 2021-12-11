package com.example.firstproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="KEV_SPT310")
@Getter
@Setter
@ToString
public class ManagedFree {
	@Id
	@Column(name="TSU_CD")
	String tsuCd;
	
	@Column(name="CP_ID")
	String cpId;
	
	@Column(name="CS_ID")
	String csId;

	@Column(name="EXCPT_DIV")
	String excptDiv;

	@Column(name="EXCPT_OPT")
	int excptOpt;

	@Column(name="EXCPT_TG")
	String excptTg;

	@Column(name="EXCPT_RATE")
	String excptRate;

	@Column(name="COMMENTS")
	String commentS;

	@Column(name="APLY_ST_YMD")
	String aplyStYmd;

	@Column(name="APLY_END_YMD")
	String aplyEndYmd;

	@Column(name="REG_DATE")
	String regDate;

	@Column(name="REG_ID")
	String regId;

	@Column(name="UPD_DATE")
	String updDate;
	
	@Column(name="UPD_ID")
	String updId;

	@Column(name="END_YN")
	String endYn;

	@Column(name="END_DATE")
	String endDate;

}
