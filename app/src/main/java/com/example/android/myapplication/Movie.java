package com.example.android.myapplication;

/**
 * Created by Android on 20/03/2018.
 */

public class Movie {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPubish() {
        return pubish;
    }

    public void setPubish(int pubish) {
        this.pubish = pubish;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private  String name;
    private int age;
    private int pubish;
    private String desc;
    private String id ;

}
