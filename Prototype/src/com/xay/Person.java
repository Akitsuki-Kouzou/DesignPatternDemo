package com.xay;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/13 23:56
 **/
public class Person implements Cloneable {

    private String name;
    private int age;
    List<String> hobbies;

    public Person(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
        System.out.println("我被构造了");
    }

    @Override
    @SuppressWarnings("unchecked")
    public Object clone() throws CloneNotSupportedException {
        Person p = (Person) super.clone();
        if(null != this.hobbies) {
            p.hobbies = new ArrayList<>();
            p.hobbies.addAll(this.hobbies);
        }
        return p;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies=" + hobbies +
                '}';
    }
}
