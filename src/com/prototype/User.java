package com.prototype;

public abstract class User {

    public String name;
    public Integer age;

    public User() {
    }

    public User(User that) {
        if (that != null) {
            this.name = that.name;
            this.age = that.age;
        }
    }

    public abstract User clone();
}
