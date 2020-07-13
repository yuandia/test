package com.example.entity;

public class Statistics {
    private String userName;
    private Integer count;

    public String get使用者() {
        return userName;
    }

    public void set使用者姓名(String userName) {
        this.userName = userName;
    }

    public Integer get借书次数() {
        return count;
    }

    public void set次数(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Statistics{" +
                ", userName='" + userName + '\'' +
                ", count='" + count + '\'' +
                '}';
    }
}