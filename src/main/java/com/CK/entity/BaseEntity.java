package com.CK.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class BaseEntity {
    Long createat;
    Long updateat;

    public Long getCreateat() {
        return createat;
    }

    public void setCreateat(Long createat) {
        this.createat = createat;
    }

    public Long getUpdateat() {
        return updateat;
    }

    public void setUpdateat(Long updateat) {
        this.updateat = updateat;
    }

}
