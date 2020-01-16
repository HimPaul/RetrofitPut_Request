package com.example.admin.retrofitput;

/**
 * Created by admin on 9/17/2019.
 */

public class OurDataset {

    String name;
    String hobby;

    public com.example.admin.retrofitput.json getJson() {
        return json;
    }

    public void setJson(com.example.admin.retrofitput.json json) {
        this.json = json;
    }

    json json;

    public OurDataset() {
    }

    public OurDataset(String name, String hobby) {
        this.name = name;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
