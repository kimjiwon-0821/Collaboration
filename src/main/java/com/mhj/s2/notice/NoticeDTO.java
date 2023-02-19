package com.mhj.s2.notice;

import java.sql.Date;

public class NoticeDTO {
	private Long noNum;
	private String noHead;
	private String noBody;
	private String noUser;
	private Date noDate;
	private Long noWatch;
	public Long getNoNum() {
		return noNum;
	}
	public void setNoNum(Long noNum) {
		this.noNum = noNum;
	}
	public String getNoHead() {
		return noHead;
	}
	public void setNoHead(String noHead) {
		this.noHead = noHead;
	}
	public String getNoBody() {
		return noBody;
	}
	public void setNoBody(String noBody) {
		this.noBody = noBody;
	}
	public String getNoUser() {
		return noUser;
	}
	public void setNoUser(String noUser) {
		this.noUser = noUser;
	}
	public Date getNoDate() {
		return noDate;
	}
	public void setNoDate(Date noDate) {
		this.noDate = noDate;
	}
	public Long getNoWatch() {
		return noWatch;
	}
	public void setNoWatch(Long noWatch) {
		this.noWatch = noWatch;
	}
	

}
