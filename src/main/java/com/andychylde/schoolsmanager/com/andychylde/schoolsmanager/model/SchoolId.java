package com.andychylde.schoolsmanager.com.andychylde.schoolsmanager.model;

import com.andychylde.schoolsmanager.utils.State;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.util.Objects;


/**
 * @author Femi Falase
 * @version 0.0.1
 */
@Embeddable
public class SchoolId implements Serializable {

//    Attributes.............................................................

    @GeneratedValue(strategy = GenerationType.AUTO)
    private int schoolNumber;
    @Embedded
    private State state;

//    Constructor(s)..............................................................
    public SchoolId() {
    }
    public SchoolId(State state) {

        this.state = state;
    }

    public SchoolId(int schoolNumber, State state) {
        this.schoolNumber = schoolNumber;
        this.state = state;
    }

//    Setters and Getters..................................................................

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    public State getState() {
        return state;
    }

    public void setStateCode(State state) {
        this.state = state;
    }

//    Hash and Equals


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SchoolId schoolId = (SchoolId) o;
        return schoolNumber == schoolId.schoolNumber &&
                state == schoolId.state;
    }

    @Override
    public int hashCode() {
        return Objects.hash(schoolNumber, state);
    }

    @Override
    public String toString() {
        return state.getStateCode() + "-" + schoolNumber;
    }
}
