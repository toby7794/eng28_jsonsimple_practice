package com.sparta.tlg;

import org.json.simple.JSONObject;

public class UserDetails {
    private JSONObject userDetails = new JSONObject();
    private String name;
    private int age;
    private String email;

    public UserDetails(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;

        userDetails.put("name", name);
        userDetails.put("age", age);
        userDetails.put("email", email);
    }

    public JSONObject getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(JSONObject userDetails) {
        this.userDetails = userDetails;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
