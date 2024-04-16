package com.example.teamseisaku.model;
 
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="TEST")
public class TenManage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 10, nullable = false)
	private String STUDENT_NO;
	@Column(length = 3, nullable = false)
	private String SUBJECT_CD;
	@Column(length = 10, nullable = false)
	private String SCHOOL_CD;
	@Column(length = 10, nullable = false)
	private String NO;
	@Column(length = 10, nullable = true)
	private String POINT;
	@Column(length = 5, nullable = true)
	private String CLASS_NUM;

	public String getSTUDENT_NO() {
		return STUDENT_NO;
	}
	public void setSTUDENT_NO(String STUDENT_NO) {
		this.STUDENT_NO = STUDENT_NO;
	}
	public String getSUBJECT_CD() {
		return SUBJECT_CD;
	}
	public void setSUBJECT_CD(String SUBJECT_CD) {
		this.SUBJECT_CD = SUBJECT_CD;
	}
	public String getSCHOOL_CD() {
		return SCHOOL_CD;
	}
	public void setSCHOOL_CD(String SCHOOL_CD) {
		this.SCHOOL_CD = SCHOOL_CD;
	}
	public String getNO() {
		return NO;
	}
	public void setNO(String NO) {
		this.NO = NO;
	}
	public String getPOINT() {
		return POINT;
	}
	public void setPOINT(String POINT) {
		this.POINT = POINT;
	}
	public String getCLASS_NUM() {
		return CLASS_NUM;
	}
	public void setCLASS_NUM(String CLASS_NUM) {
		this.CLASS_NUM = CLASS_NUM;
	}
}
