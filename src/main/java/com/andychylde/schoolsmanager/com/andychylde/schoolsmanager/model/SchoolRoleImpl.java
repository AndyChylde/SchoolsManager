package com.andychylde.schoolsmanager.com.andychylde.schoolsmanager.model;

import com.andychylde.schoolsmanager.utils.Person;
import com.andychylde.schoolsmanager.utils.SystemUser;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Femi Falase
 */
public abstract class SchoolRoleImpl extends SystemUser implements SchoolRole, Serializable {

//    Attributes................................................................................................

    protected LocalDate schoolRoleStart;
    protected LocalDate schoolRoleEnd;
    protected String roleEndReason;
    protected Person roleHolder;
    protected SchoolRole roleManagedBy;
    protected final Set<SchoolRole> rolesManaging = new HashSet<>();

//    Constructor(s)............................................................................................

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

    public String getRoleEndReason() {
        return roleEndReason;
    }

    public void setRoleEndReason(String roleEndReason) {
        this.roleEndReason = roleEndReason;
    }

    public Person getRoleHolder() {
        return roleHolder;
    }

    public void setRoleHolder(Person roleHolder) {
        this.roleHolder = roleHolder;
    }

    public SchoolRole getRoleManagedBy() {
        return roleManagedBy;
    }

    public void setRoleManagedBy(SchoolRole roleManagedBy) {
        this.roleManagedBy = roleManagedBy;
    }

    public Set<SchoolRole> getRolesManaging() {
        return rolesManaging;
    }

    //    Class methods..........................................................................................

    public void endRole(String roleEndReason){

        this.schoolRoleEnd = LocalDate.now();
        this.roleEndReason = roleEndReason;
    }

}
