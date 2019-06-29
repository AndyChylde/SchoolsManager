package com.andychylde.schoolsmanager.utils;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Femi Falase
 */
public abstract class SchoolRoleImpl implements SchoolRole, Serializable {

    protected LocalDate schoolRoleStart;
    protected LocalDate schoolRoleEnd;
    protected Person roleHolder;

    public SchoolRoleImpl() {
    }

    public SchoolRoleImpl(LocalDate schoolRoleStart) {
        this.schoolRoleStart = schoolRoleStart;
    }

    public LocalDate getSchoolRoleStart() {
        return schoolRoleStart;
    }

    public void setSchoolRoleStart(LocalDate schoolRoleStart) {
        this.schoolRoleStart = schoolRoleStart;
    }

    public LocalDate getSchoolRoleEnd() {
        return schoolRoleEnd;
    }

    public void setSchoolRoleEnd(LocalDate schoolRoleEnd) {
        this.schoolRoleEnd = schoolRoleEnd;
    }

}
