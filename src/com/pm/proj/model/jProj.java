package com.pm.proj.model;

// Generated Oct 2, 2010 5:35:11 PM by Hibernate Tools 3.2.4.GA

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.codehaus.jackson.annotate.JsonAutoDetect;

/**
 * Proj generated by hbm2java
 */
@JsonAutoDetect
@Entity
@Table(name = "proj", schema = "public")
public class jProj {

	private int id;
	private String projName;
	private Date beginDate;
	private Date endDate;
	private Date previsionDate;
	private String projCmt;
	private String priority;
	private String previsionTime;
	private String spentTime;
	private String projLogo;
	private String projLink;

	public jProj() {
	}

	public jProj(int id) {
		this.id = id;
	}

	public jProj(int id, String projName, Date beginDate, Date endDate,
			Date previsionDate, String projCmt, String priority,
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
	@GeneratedValue
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

	@Temporal(TemporalType.DATE)
	@Column(name = "begin_date", length = 13)
	public Date getBeginDate() {
		return this.beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "end_date", length = 13)
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "prevision_date", length = 13)
	public Date getPrevisionDate() {
		return this.previsionDate;
	}

	public void setPrevisionDate(Date previsionDate) {
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