package com.example.demo22222222222;

import java.util.Objects;

public class Hello {

    private String name;

    private Integer age;

    public Hello() {
    }

    public Hello(String name, Integer age) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hello hello = (Hello) o;
        return Objects.equals(name, hello.name) &&
                Objects.equals(age, hello.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
