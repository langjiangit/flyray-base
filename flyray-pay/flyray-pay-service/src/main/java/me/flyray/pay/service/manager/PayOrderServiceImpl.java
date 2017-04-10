package me.flyray.pay.service.manager;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.flyray.pay.api.PayOrderService;
import me.flyray.pay.dao.PayOrderDao;
import me.flyray.pay.model.PayOrder;

/** 
* @author: bolei
* @date：2017年4月8日 下午10:52:08 
* @description：支付订单
*/

@Service("payOrderService")
public class PayOrderServiceImpl implements PayOrderService{

	@Autowired
	private PayOrderDao payOrderDao;
	
	@Override
	public List<PayOrder> queryList(Map<String, Object> map) {
		return payOrderDao.queryList(map);
	}

	@Override
	public int queryTotal(Map<String, Object> map) {
		return payOrderDao.queryTotal(map);
	}

	@Override
	public void save(PayOrder payOrder) {
		payOrderDao.save(payOrder);
	}

	@Override
	public void update(PayOrder payOrder) {
		payOrderDao.update(payOrder);
	}

	@Override
	public void deleteBatch(Long[] ids) {
		// TODO Auto-generated method stub
		
	}

}