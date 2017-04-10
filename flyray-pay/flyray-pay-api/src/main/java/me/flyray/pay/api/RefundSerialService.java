package me.flyray.pay.api;

import java.util.List;
import java.util.Map;

import me.flyray.pay.model.RefundSerial;

/** 
* @author: bolei
* @date：2017年3月18日 下午11:21:01 
* @description：退款流水
*/

public interface RefundSerialService {

	List<RefundSerial> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(RefundSerial refundSerial);
	
	void update(RefundSerial refundSerial);
	
	void deleteBatch(Long[] ids);
	
}