package com.sujata.bean;

import javax.persistence.*;

@Entity
@Table(name="Husband")
public class HusbandEntity {
    @Id
    private String hId;
    private String hName;
    @OneToOne
    @JoinColumn(name="WifeID")
    private WifeEntity wife;

    public HusbandEntity() {
    }

    public HusbandEntity(String hId, String hName) {
        this.hId = hId;
        this.hName = hName;
    }

    public String gethId() {
        return hId;
    }

    public void sethId(String hId) {
        this.hId = hId;
    }

    public String gethName() {
        return hName;
    }

    public void sethName(String hName) {
        this.hName = hName;
    }

    public WifeEntity getWife() {
        return wife;
    }


    public void setWife(WifeEntity wife) {
        this.wife = wife;
    }
}
