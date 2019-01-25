package com.proxy.reflect;

public interface PersonBean {

    String getName();
    String getGender();
    String getInterests();
    int getHotOrNotRating();

    void setName(String name);
    String setGender(String gender);
    void setInterests(String interests);
    void setHotOrNotRating(int rating);
}
