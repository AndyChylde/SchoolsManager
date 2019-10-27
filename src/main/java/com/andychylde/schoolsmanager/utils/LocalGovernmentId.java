package com.andychylde.schoolsmanager.utils;

import javax.inject.Inject;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class LocalGovernmentId implements Serializable {

    @Inject
    private State state;
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer lgCode;


    public LocalGovernmentId(State state, Integer lgCode) {
        this.state = state;
        this.lgCode = lgCode;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Integer getLgCode() {
        return this.lgCode;
    }

    public void setLgCode(Integer lgCode) {
        this.lgCode = lgCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocalGovernmentId lgId = (LocalGovernmentId) o;
        return this.getState() == lgId.getState() &&
                this.getLgCode().equals(lgId.getLgCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getState(), this.getLgCode());
    }


}
