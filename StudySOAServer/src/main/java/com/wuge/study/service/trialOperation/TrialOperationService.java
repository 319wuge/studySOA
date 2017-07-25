package com.wuge.study.service.trialOperation;

/**
 * Created by qls on 2015/9/16.
 */
public interface TrialOperationService {
	/**
	 * 是否在试运营范围 0不在，1在
	 * @param agentId
	 * @return
	 */
	Integer inTrialOperation(Long agentId);
}
