package com.sujata.bean;

import javax.persistence.*;

@Entity
@Table(name="Wife")
public class WifeEntity {
    @Id
    private String wId;
    private String wName;
    @OneToOne
    @JoinColumn(name="husbandId")
    private HusbandEntity husband;

    public WifeEntity() {
    }

    public WifeEntity(String wId, String wName) {
        this.wId = wId;
        this.wName = wName;
    }

    public String getwId() {
        return wId;
    }

    public void setwId(String wId) {
        this.wId = wId;
    }

    public String getwName() {
        return wName;
    }

    public void setwName(String wName) {
        this.wName = wName;
    }

    public HusbandEntity getHusband() {
        return husband;
    }

    public void setHusband(HusbandEntity husband) {
        this.husband = husband;
    }

}
