package com.example.teamseisaku.model;
 
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="TEACHER")
public class UserManage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 10, nullable = false)
	private String ID;
	@Column(length = 30, nullable = true)
	private String PASSWORD;
	@Column(length = 10, nullable = true)
	private String NAME;
	@Column(length = 3, nullable = true)
	private String SCHOOL_CD;


	public String getID() {
		return ID;
	}
	public void setID(String ID) {
		this.ID = ID;
	}
	public String getPASSWORD() {
		return PASSWORD;
	}
	public void setPASSWORD(String PASSWORD) {
		this.PASSWORD = PASSWORD;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAMEr(String NAME) {
		this.NAME = NAME;
	}
	public String getSCHOOL_CD() {
		return SCHOOL_CD;
	}
	public void setSCHOOL_CD(String SCHOOL_CD) {
		this.SCHOOL_CD = SCHOOL_CD;
	}
}