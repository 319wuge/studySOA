package com.wuge.study.service.trialOperation;

import com.manyi.iw.agent.soa.api.model.dict.enums.PriAreaOrgLevel;
import com.manyi.iw.uum.soa.client.AgentClient;
import com.manyi.iw.uum.soa.client.UumPriClient;
import com.manyi.iw.uum.soa.model.agent.PriAreaOrg;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;

/**
 * Created by qls on 2015/9/16.
 */
public class TrialOperationServiceImpl implements TrialOperationService{
	private HashSet<Long> mdIdSet = new HashSet<>();
	private String trialStore;
	@Autowired
	private UumPriClient uumPriClient;
	@Autowired
	private AgentClient uumAgentClient;
	public TrialOperationServiceImpl(String trialStore) {
		trialStore = trialStore.trim();
		this.trialStore = trialStore;
		if(null != trialStore && !"".equals(trialStore)){
			String[] trialStores = trialStore.split(",");
			for(String store : trialStores) {
				mdIdSet.add(Long.parseLong(store));
			}
		}
	}

	@Override
	public Integer inTrialOperation(Long agentId) {
		if(mdIdSet.size() < 1){
			return 1;
		}
		try {

			List<PriAreaOrg> orgList = uumPriClient.getAreaOrgsByAgentId(agentId);
            if(null != orgList && orgList.size()>0){
                for(PriAreaOrg priAreaOrg : orgList) {
                    if (priAreaOrg.getAreaLevel() == PriAreaOrgLevel.XZ.intValue() && mdIdSet.contains(priAreaOrg.getMendianId())) {
                        return 1;
                    }
                }
            }
		} catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException("调用AgentSOAClient异常");
		}
		return 0;
	}
}
