package com.example.entity;

public class Statisticss {
    private String bookName;
    private Integer count;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Statisticss{" +
                ", bookName='" + bookName + '\'' +
                ", count='" + count + '\'' +
                '}';
    }
}