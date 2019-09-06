package com.sk.sell.repository;

import com.sk.sell.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository repository;
    @Test
    public void save(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123");
        productInfo.setProductName("测试");
        productInfo.setProductPrice(new BigDecimal(3));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("测试描述");
        productInfo.setProductIcon("http://baidu.com");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(1);
        ProductInfo save = repository.save(productInfo);
        Assert.assertNotNull(save);
    }
    @Test
    public void findByProductStatus() {
        List<ProductInfo> productInfoList = repository.findByProductStatus(0);
        Assert.assertNotEquals(0, productInfoList.size());
    }
}