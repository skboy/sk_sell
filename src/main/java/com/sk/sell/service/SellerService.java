package com.sk.sell.service;

import com.sk.sell.dataobject.SellerInfo;


public interface SellerService {

    /**
     * 通过openid查询卖家端信息
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
