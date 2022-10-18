package com.example.jusantestbot.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.security.Timestamp;
import java.util.Objects;

@Entity(name = "users")
public class User {
    @Id
    private Long userId = 1L;

    @Column
    private Long companyId;

    @Column
    private Long chatId;

    @Column
    private Boolean status;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getChatId() {
        return chatId;
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
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
                "userId=" + userId +
                ", companyId=" + companyId +
                ", chatId=" + chatId +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userId, user.userId) && Objects.equals(companyId, user.companyId) && Objects.equals(chatId, user.chatId) && Objects.equals(status, user.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, companyId, chatId, status);
    }
}
