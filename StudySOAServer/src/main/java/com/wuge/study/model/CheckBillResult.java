package com.wuge.study.model;

import java.util.List;

/**
 * Created by qls on 2015/10/15.
 */
public class CheckBillResult {
	private List<Long>  tradeIds;//成功的交易
	private List<Long> transferIds;//更新的流水
	private List<Long> billIds;//更新的账单

	public List<Long> getTradeIds() {
		return tradeIds;
	}

	public void setTradeIds(List<Long> tradeIds) {
		this.tradeIds = tradeIds;
	}

	public List<Long> getTransferIds() {
		return transferIds;
	}

	public void setTransferIds(List<Long> transferIds) {
		this.transferIds = transferIds;
	}

	public List<Long> getBillIds() {
		return billIds;
	}

	public void setBillIds(List<Long> billIds) {
		this.billIds = billIds;
	}

	@Override
	public String toString() {
		return "CheckBillResult{" +
				"tradeIds=" + tradeIds +
				", transferIds=" + transferIds +
				", billIds=" + billIds +
				'}';
	}
}
