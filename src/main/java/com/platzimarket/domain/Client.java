package com.platzimarket.domain;

import com.platzimarket.persistence.entity.Compra;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

public class Client {

    private String ClientId;
    private String name;
    private String subname;
    private Long phone;
    private String adress;
    private String email;
    private List<Compra> purchases;

    public String getClientId() {
        return ClientId;
    }

    public void setClientId(String clientId) {
        ClientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Compra> getPurchases() {
        return purchases;
    }

    public void setPurchases(List<Compra> purchases) {
        this.purchases = purchases;
    }
}
