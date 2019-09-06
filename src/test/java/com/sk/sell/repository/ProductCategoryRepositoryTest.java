package com.sk.sell.repository;

import com.sk.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest(){
      Optional<ProductCategory> byId = repository.findById(1);
        System.out.println(byId.get());
    }
    @Test
    @Transactional
    public void saveTest(){
      /*  Optional<ProductCategory> optional = repository.findById(2) ;
        ProductCategory productCategory = optional.get();
        productCategory.setCategoryType(10);*/
       /* ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryId(2);
        productCategory.setCategoryName("男生最爱");
        productCategory.setCategoryType(3);*/
        ProductCategory productCategory = new ProductCategory("哎哎哎",10);
        ProductCategory result = repository.save(productCategory);
        //Assert.assertNotEquals(null,result);
        Assert.assertNotNull(result);
    }
    @Test
    public void findByCategoryTypeIn(){
        List<Integer> list= Arrays.asList(1,2,3);
        List<ProductCategory> byCategoryTypeIn = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,byCategoryTypeIn.size());
    }

}