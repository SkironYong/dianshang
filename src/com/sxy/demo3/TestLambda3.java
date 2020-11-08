package com.sxy.demo3;

import org.junit.Test;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class TestLambda3 {
    /**
     * 消费型接口 Consumer<T>
     */
    @Test
    public void test1()
    {
        happy(100,m-> System.out.println(m));
    }
    public void happy(double money, Consumer<Double> com) {com.accept(money);}



}
