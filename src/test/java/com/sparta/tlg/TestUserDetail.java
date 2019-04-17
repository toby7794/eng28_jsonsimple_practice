package com.sparta.tlg;

import org.json.simple.JSONObject;
import org.junit.Assert;
import org.junit.Test;

public class TestUserDetail {

    private UserDetails toby = new UserDetails("toby", 21, "lordbuckethead@hotmail.com");

    @Test
    public void correctAgeDetail(){
        Assert.assertEquals(toby.getAge(), 21);
    }
    @Test
    public void correctNameDetail(){
        Assert.assertEquals(toby.getName(), "toby");
    }
    @Test
    public void correctEmailDetail(){
        Assert.assertEquals(toby.getEmail(), "lordbuckethead@hotmail.com");
    }
    @Test
    public void validateNameUserDetail(){
        Assert.assertEquals(toby.getUserDetails().get("name"),"toby");
    }
    @Test
    public void validateAgeUserDetail(){
        Assert.assertEquals(toby.getUserDetails().get("age"),21);
    }
    @Test
    public void validateEmailDetail(){
        Assert.assertEquals(toby.getUserDetails().get("email"),"lordbuckethead@hotmail.com");
    }
}
