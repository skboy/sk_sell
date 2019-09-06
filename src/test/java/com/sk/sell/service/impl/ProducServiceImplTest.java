package com.sk.sell.service.impl;

import com.sk.sell.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProducServiceImplTest {

    @Autowired
    private ProducServiceImpl producService;
    @Test
    public void findOne() {
        ProductInfo one = producService.findOne("123");

        Assert.assertEquals("123",one.getProductId());
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> upAll = producService.findUpAll();
        Assert.assertNotEquals(0,upAll.size());
    }

    @Test
    public void findAll() {

        Pageable pageable =PageRequest.of(0,2);
        Page<ProductInfo> all = producService.findAll(pageable);
        System.out.println( all.getTotalElements());

    }

    @Test
    public void save() {

        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("126");
        productInfo.setProductName("测试6");
        productInfo.setProductPrice(new BigDecimal(3));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("测试描述6");
        productInfo.setProductIcon("http://baidu.com");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(1);
        ProductInfo save = producService.save(productInfo);
        Assert.assertNotNull(save);
    }
}