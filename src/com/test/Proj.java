package com.test;

// Generated Oct 21, 2010 4:05:57 PM by Hibernate Tools 3.2.4.GA

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Proj generated by hbm2java
 */
@Entity
@Table(name = "proj", schema = "public")
public class Proj implements java.io.Serializable {

	private int id;
	private String projName;
	private String beginDate;
	private String endDate;
	private String previsionDate;
	private String projCmt;
	private String priority;
	private String previsionTime;
	private String spentTime;
	private String projLogo;
	private String projLink;

	public Proj() {
	}

	public Proj(int id) {
		this.id = id;
	}

	public Proj(int id, String projName, String beginDate, String endDate,
			String previsionDate, String projCmt, String priority,
			String previsionTime, String spentTime, String projLogo,
			String projLink) {
		this.id = id;
		this.projName = projName;
		this.beginDate = beginDate;
		this.endDate = endDate;
		this.previsionDate = previsionDate;
		this.projCmt = projCmt;
		this.priority = priority;
		this.previsionTime = previsionTime;
		this.spentTime = spentTime;
		this.projLogo = projLogo;
		this.projLink = projLink;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "proj_name", length = 200)
	public String getProjName() {
		return this.projName;
	}

	public void setProjName(String projName) {
		this.projName = projName;
	}

	@Column(name = "begin_date", length = 25)
	public String getBeginDate() {
		return this.beginDate;
	}

	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	@Column(name = "end_date", length = 25)
	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	@Column(name = "prevision_date", length = 25)
	public String getPrevisionDate() {
		return this.previsionDate;
	}

	public void setPrevisionDate(String previsionDate) {
		this.previsionDate = previsionDate;
	}

	@Column(name = "proj_cmt", length = 4000)
	public String getProjCmt() {
		return this.projCmt;
	}

	public void setProjCmt(String projCmt) {
		this.projCmt = projCmt;
	}

	@Column(name = "priority", length = 200)
	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	@Column(name = "prevision_time", length = 50)
	public String getPrevisionTime() {
		return this.previsionTime;
	}

	public void setPrevisionTime(String previsionTime) {
		this.previsionTime = previsionTime;
	}

	@Column(name = "spent_time", length = 50)
	public String getSpentTime() {
		return this.spentTime;
	}

	public void setSpentTime(String spentTime) {
		this.spentTime = spentTime;
	}

	@Column(name = "proj_logo", length = 200)
	public String getProjLogo() {
		return this.projLogo;
	}

	public void setProjLogo(String projLogo) {
		this.projLogo = projLogo;
	}

	@Column(name = "proj_link", length = 200)
	public String getProjLink() {
		return this.projLink;
	}

	public void setProjLink(String projLink) {
		this.projLink = projLink;
	}

}
