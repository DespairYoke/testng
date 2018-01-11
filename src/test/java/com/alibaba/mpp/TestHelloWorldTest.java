package com.alibaba.mpp;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * @author zwd
 * @date 2018/1/11 09:23
 */
public class TestHelloWorldTest {

    @BeforeMethod
    public void setUp() throws Exception {
        System.out.println("this is before");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        System.out.println("this is after");
    }

    @Test(groups = {"normal"})
    public void test1() throws Exception {
        //Reporter.log("1="+System.currentTimeMillis(),true);
        System.out.println("111");
        Assert.assertEquals("1","1");
    }
    @Test(groups = {"normal"})
    public void  test2(){
        System.out.println("222");
    }
    @Test(groups = {"normal"})
    public void  test3(){
        System.out.println("333");
    }


}