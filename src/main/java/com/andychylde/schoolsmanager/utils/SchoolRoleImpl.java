package com.andychylde.schoolsmanager.utils;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Femi Falase
 */
public abstract class SchoolRoleImpl implements SchoolRole, Serializable {

    private LocalDate schoolRoleStart;
    private LocalDate schoolRoleEnd;

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
