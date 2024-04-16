package com.example.teamseisaku.model;
 
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="STUDENT")
public class SeitoManage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 10, nullable = false)
	private String NO;
	@Column(length = 10, nullable = true)
	private String NAME;
	@Column(length = 10, nullable = true)
	private String ENT_YEAR;
	@Column(length = 3, nullable = true)
	private String class_num;
	@Column( nullable = true)
	private String is_attend;
	@Column(length = 3, nullable = true)
	private String school_cd;

	public String getNO() {
		return NO;
	}
	public void setNO(String NO) {
		this.NO = NO;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String NAME) {
		this.NAME = NAME;
	}
	public String getENT_YEAR() {
		return ENT_YEAR;
	}
	public void setENT_YEAR(String ENT_YEAR) {
		this.ENT_YEAR = ENT_YEAR;
	}
	public String getclass_num() {
		return class_num;
	}
	public void setclass_num(String class_num) {
		this.class_num = class_num;
	}
	public String getis_attend() {
		return is_attend;
	}
	public void setis_attend(String is_attend) {
		this.is_attend = is_attend;
	}
	public String getschool_cd() {
		return school_cd;
	}
	public void setschool_cd(String school_cd) {
		this.school_cd = school_cd;
	}
}