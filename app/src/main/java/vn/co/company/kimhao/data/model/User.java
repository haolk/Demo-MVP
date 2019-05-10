package vn.co.company.kimhao.data.model;

import java.io.Serializable;

public class User implements Serializable {
    private String userPhoneNumber;
    private String userId;
    private String userPassword;
    private String userName;
    private String email;
    private String gender;
    private String birthdate;
    private String promotion;
    private String cardId;
    private String cardExpiredDate;
    private String securityCode;
    private int creditCardType;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getCardExpiredDate() {
        return cardExpiredDate;
    }

    public void setCardExpiredDate(String cardExpiredDate) {
        this.cardExpiredDate = cardExpiredDate;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public int getCreditCardType() {
        return creditCardType;
    }

    public void setCreditCardType(int creditCardType) {
        this.creditCardType = creditCardType;
    }
}
