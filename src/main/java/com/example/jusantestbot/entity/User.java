package com.example.jusantestbot.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.security.Timestamp;
import java.util.Objects;

@Entity(name = "users")
public class User {
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
        return "User{" +
                "user_id=" + user_id +
                ", company_id=" + company_id +
                ", chat_id=" + chat_id +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        User user = (User) o;
        return chat_id == user.chat_id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), chat_id);
    }

}
