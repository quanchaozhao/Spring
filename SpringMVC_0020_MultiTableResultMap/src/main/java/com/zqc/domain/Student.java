package com.zqc.domain;

import java.io.Serializable;

/**
 * Created by Interllij IDEA
 * User:Zqc
 * Data:2018/8/31
 * Time:21:02
 * Email:quanchaozhao@yeah.net
 * To change this template use File | Settings | File Templates.
 */
public class Student implements Serializable {
    private Integer id;
    private String name;
    private String sex;
    private Integer age;
    private Clazz clazz_id;

    @Override
    public String toString() {
        return "[ id: " + id + ",name: " + name + ",sex " + sex
                + ",age: " + age + ",clazz_id: " + clazz_id.toString() + "]";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Clazz getClazz_id() {
        return clazz_id;
    }

    public void setClazz_id(Clazz clazz_id) {
        this.clazz_id = clazz_id;
    }
}
