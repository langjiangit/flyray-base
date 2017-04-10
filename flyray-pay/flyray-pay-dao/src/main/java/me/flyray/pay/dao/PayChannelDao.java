package me.flyray.pay.dao;

import java.util.List;
import java.util.Map;

import me.flyray.pay.model.PayChannel;

/** 
* @author: bolei
* @date：2017年4月8日 下午10:38:54 
* @description：支付通道
*/

public interface PayChannelDao {

	List<PayChannel> queryList(Map<String, Object> map);
	
	PayChannel queryObject(PayChannel payChannel);
	
	int queryTotal(Map<String, Object> map);
	
	void save(PayChannel payChannel);
	
	void update(PayChannel payChannel);
	
}