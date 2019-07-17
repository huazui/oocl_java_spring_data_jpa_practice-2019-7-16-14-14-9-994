package com.tw.apistackbase.core;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Profile {
    @Column(name="registeredCapital",length=100)
    String registeredCapital;
    @Column(name="certId",length=100)
    String certId;
    public Profile(){}
    public Profile(String registeredCapital,String certId){
        this.certId=certId;
        this.registeredCapital=registeredCapital;
    }

    public String getCertId() {
        return certId;
    }

    public String getRegisteredCapital() {
        return registeredCapital;
    }

    public void setCertId(String certId) {
        this.certId = certId;
    }

    public void setRegisteredCapital(String registeredCapital) {
        this.registeredCapital = registeredCapital;
    }
}
