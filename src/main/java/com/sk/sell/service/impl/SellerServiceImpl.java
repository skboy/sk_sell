package com.sk.sell.service.impl;

import com.sk.sell.dataobject.SellerInfo;
import com.sk.sell.repository.SellerInfoRepository;
import com.sk.sell.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerInfoRepository repository;

    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {
       return repository.findByOpenid(openid);
    }
}
