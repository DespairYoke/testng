package com.alibaba.mpp;

import org.testng.annotations.Test;

/**
 * @author zwd
 * @date 2018/1/11 09:44
 */
public class GroupTest {

    @Test(groups = {"systemtest"})
    public void tsetLogin(){
        System.out.println("this is test login");
    }

    @Test(groups = {"functiontest"})
    public void testOpenPage(){
        System.out.println("this is test Open Page");
    }
}
