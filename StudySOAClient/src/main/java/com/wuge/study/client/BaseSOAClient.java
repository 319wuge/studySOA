package com.wuge.study.client;

import com.manyi.client.BaseClient;

import java.util.Map;

/**
 * Created by whz on 2015/9/14.
 */
public abstract class BaseSOAClient extends BaseClient {
	public BaseSOAClient(String serverURL) {
		super(serverURL);
	}

	public BaseSOAClient(String serverURL, int soTimeout) {
		super(serverURL, soTimeout);
	}

	@Override
	public String httpPost(Map<String, Object> params, String methodName) {
		return super.httpPost(params, methodName);
	}
}
