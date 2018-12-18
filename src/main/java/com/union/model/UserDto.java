package com.union.model;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString()
public class UserDto {
    private String userId;

    private String userPassword;

    private String userName;

    private String userSex;

    private String userIdentity;

    private String userHometown;

    private String politicalStastus;

    private String userMailaddress;

    private String userTel;

    private String userAddress;

    private String userStastus;

    private String userMessage;

    private Date insertTime;

    private Date updateTime;

    private Integer updateCnt;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public String getUserIdentity() {
        return userIdentity;
    }

    public void setUserIdentity(String userIdentity) {
        this.userIdentity = userIdentity == null ? null : userIdentity.trim();
    }

    public String getUserHometown() {
        return userHometown;
    }

    public void setUserHometown(String userHometown) {
        this.userHometown = userHometown == null ? null : userHometown.trim();
    }

    public String getPoliticalStastus() {
        return politicalStastus;
    }

    public void setPoliticalStastus(String politicalStastus) {
        this.politicalStastus = politicalStastus == null ? null : politicalStastus.trim();
    }

    public String getUserMailaddress() {
        return userMailaddress;
    }

    public void setUserMailaddress(String userMailaddress) {
        this.userMailaddress = userMailaddress == null ? null : userMailaddress.trim();
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel == null ? null : userTel.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public String getUserStastus() {
        return userStastus;
    }

    public void setUserStastus(String userStastus) {
        this.userStastus = userStastus == null ? null : userStastus.trim();
    }

    public String getUserMessage() {
        return userMessage;
    }

    public void setUserMessage(String userMessage) {
        this.userMessage = userMessage == null ? null : userMessage.trim();
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateCnt() {
        return updateCnt;
    }

    public void setUpdateCnt(Integer updateCnt) {
        this.updateCnt = updateCnt;
    }
}