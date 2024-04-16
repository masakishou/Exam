package com.example.teamseisaku.model;
 
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="SUBJECT")
public class KamokuManage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 10, nullable = false)
	private String SCHOOL_CD;
	@Column(length = 10, nullable = false)
	private String CD;
	@Column(length = 10, nullable = true)
	private String NAME;
	

	public String getSCHOOL_CD() {
		return SCHOOL_CD;
	}
	public void setSCHOOL_CD(String SCHOOL_CD) {
		this.SCHOOL_CD = SCHOOL_CD;
	}
	public String getCD() {
		return CD;
	}
	public void setCD(String CD) {
		this.CD = CD;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String NAME) {
		this.NAME = NAME;
	}
}