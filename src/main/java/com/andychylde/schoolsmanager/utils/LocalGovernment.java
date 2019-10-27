package com.andychylde.schoolsmanager.utils;

import javax.inject.Inject;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.io.Serializable;

@Embeddable

public class LocalGovernment implements Serializable {


    @EmbeddedId
    private LocalGovernmentId lgid;
    private String localGovernmentName;

    @Inject
    public LocalGovernment(LocalGovernmentId lgid, String localGovernmentName) {
        this.lgid = lgid;
        this.localGovernmentName = localGovernmentName;
    }

    public String getLocalGovernmentName() {
        return localGovernmentName;
    }

    public void setLocalGoverntmentName(String localGovernmentName) {
        this.localGovernmentName = localGovernmentName;
    }
}
