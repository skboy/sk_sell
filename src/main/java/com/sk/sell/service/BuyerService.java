package com.sk.sell.service;

import com.sk.sell.dto.OrderDTO;
import com.sk.sell.dto.OrderDTO;


public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
