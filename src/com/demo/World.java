package com.demo;

/**
 * @author zhy
 * @date 2020/9/6-12:35
 **/
public class World {
    //你好

    private String name;
    private Integer age;

    public World() {
    }

    public World(String name) {
        this.name = name;
    }

    public World(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
