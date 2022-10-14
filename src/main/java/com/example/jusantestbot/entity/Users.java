package com.example.jusantestbot.entity;


import org.hibernate.annotations.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "users")
public class Users {
    @Id
    private Long user_id;

    @Column
    private Long company_id;

    @Column
    private Long chat_id;

    @Column
    private Boolean status;

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getCompany_id() {
        return company_id;
    }

    public void setCompany_id(Long company_id) {
        this.company_id = company_id;
    }

    public Long getChat_id() {
        return chat_id;
    }

    public void setChat_id(Long chat_id) {
        this.chat_id = chat_id;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Users{" +
                "user_id=" + user_id +
                ", company_id=" + company_id +
                ", chat_id=" + chat_id +
                ", status=" + status +
                '}';
    }
}
