package com.huarong.payment.sdk.trans;

import com.huarong.payment.sdk.exception.PayException;

public interface TransApi<T> {
	/**
	 * 通用的交易方法
	 * @param t
	 * @return
	 * @throws Exception
	 */
	public T trans(T t) throws Exception,PayException;
}
