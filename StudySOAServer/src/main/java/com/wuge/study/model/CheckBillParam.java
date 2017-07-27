package com.wuge.study.model;

import java.util.Date;

/**
 * Created by qls on 2015/10/15.
 */
public class CheckBillParam {
	private Date startDate;//交易开始时间
	private Date endDate;//交易结束时间
	private Long limit;//一次查询条数

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Long getLimit() {
		return limit;
	}

	public void setLimit(Long limit) {
		this.limit = limit;
	}
}
