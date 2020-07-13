package com.example.entity;

public class BookUser {
    private Integer id;
    private Integer bookId;
    private Integer userId;
    private Integer status;
    private String barrowTime;
    private String backTime;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBookId() {
        return bookId;
    }
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getBarrowTime() {
        return barrowTime;
    }
    public void setBarrowTime(String barrowTime){
        this.barrowTime=barrowTime;
    }

    public String getBackTime(){
        return backTime;
    }

    public void setBackTime(String backTime){
        this.backTime=backTime;
    }


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookId='" + bookId + '\'' +
                ", userId='" + userId + '\'' +
                ", status='" + status + '\'' +
                ", barrowTime='" + barrowTime + '\'' +
                ", backTime='" + backTime + '\'' +
                '}';
    }
}
/**/