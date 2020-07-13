package com.example.entity;

public class Book {
    private Integer id;
    private String name;
    private String creatDate;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getCreatDate(){
        return creatDate;
    }

    public void setCreatDate(String creatDate){
        this.creatDate=creatDate;
    }


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", creatDate='" + creatDate + '\'' +
                '}';
    }
}
