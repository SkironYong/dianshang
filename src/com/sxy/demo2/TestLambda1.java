package com.sxy.demo2;

import com.sxy.demo1.Employee;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class TestLambda1 {
    /**
     * 模拟数据
     */
    List<Employee> emps = Arrays.asList(
            new Employee(101,"张三",18,9999.99),
            new Employee(102,"张四",18,8999.99),
            new Employee(103,"张五",20,7999.99),
            new Employee(104,"张六",20,6999.99),
            new Employee(105,"张七",22,5999.99),
            new Employee(106,"张八",22,4999.99),
            new Employee(107,"张九",24,3999.99),
            new Employee(108,"张十",25,2999.99)
    );

    /**
     * 排序比较
     */
    @Test
    public void test()
    {
        Collections.sort(emps,(e1,e2)->{
            if(e1.getAge()==e2.getAge())
            {
                return e1.getName().compareTo(e2.getName());
            }else {
                return Integer.compare(e1.getAge(),e2.getAge());
            }
        });
        for (Employee emp:emps
             ) {
            System.out.println(emp);
        }
    }

}
