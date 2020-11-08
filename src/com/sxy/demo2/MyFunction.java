package com.sxy.demo2;

@FunctionalInterface
public interface MyFunction<T,R>{
    public R operator(T t1,T t2);
}
