package com.sxy.demo1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class demo {

    /**
     * 匿名内部类
     */
    @Test
    public void test1()
    {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            //（x<y）?-1:(x==y)0:1
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };
    }

    @Test
    public void test2()
    {
        Comparator<Integer> comparator = (o1,o2)->{
            return Integer.compare(o1,o2);
        };


    }
    //模拟数据
    List<Employee> emps = Arrays.asList(
            new Employee(101,"张三",18,9999.99),
            new Employee(102,"张四",19,8999.99),
            new Employee(103,"张五",20,7999.99),
            new Employee(104,"张六",21,6999.99),
            new Employee(105,"张七",22,5999.99),
            new Employee(106,"张八",23,4999.99),
            new Employee(107,"张九",24,3999.99),
            new Employee(108,"张十",25,2999.99)
    );
    //找小于20岁的人
    public List<Employee> fillterEmployee (List<Employee> emps,MyPredicate<Employee> mp){
        List<Employee> list = new ArrayList<>();
        for (Employee emp : emps) {
            if (mp.test(emp)) {
                list.add(emp);
            }
        }
        return list;
    }

    //匿名内部类
    @Test
    public void test3()
    {
        List<Employee> list = fillterEmployee(emps, new MyPredicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getAge()>=105;
            }
        });
        for (Employee emp: list) {
            System.out.println(emp);
        }
    }

    //lamada表达式
    @Test
    public void test4()
    {
        List<Employee> list = fillterEmployee(emps,(e)->e.getSalary()>5000);
        list.forEach(System.out::println);
    }
    public static void main(String[] args) {

    }
}
