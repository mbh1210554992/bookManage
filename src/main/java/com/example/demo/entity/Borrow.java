package com.example.demo.entity;


import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Borrow {
    private Integer userId;
    private String userName;
    private Integer bookId;
    private String bookName;
    private Integer borrowState;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date  borrowTime;

    @Override
    public String toString() {
        return "Borrow{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", borrowState=" + borrowState +
                ", borrowTime=" + borrowTime +
                '}';
    }

    public Date getBorrowTime() {
        return borrowTime;
    }

    public void setBorrowTime(Date borrowTime) {
        this.borrowTime = borrowTime;
    }

    public String getUserName() {
        return userName ;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getBorrowState() {
        return borrowState;
    }

    public void setBorrowState(Integer borrowState) {
        this.borrowState = borrowState;
    }
}
