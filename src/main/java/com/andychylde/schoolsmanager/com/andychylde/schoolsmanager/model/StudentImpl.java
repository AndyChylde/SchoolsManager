package com.andychylde.schoolsmanager.com.andychylde.schoolsmanager.model;

import com.andychylde.schoolsmanager.utils.Person;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Femi Falase
 * @version 0.0.1
 */
public class StudentImpl extends SchoolRoleImpl implements Student, Serializable {

//    Attributes.................................................................
//    @TODO change the student id to a student id class
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Student_Id")
    private long studentNumber;
    private Map<SchoolId, SchoolImpl> schoolsAttended = new HashMap<>();
    private SchoolImpl schoolImplAttending;


    //    Constructor(s).............................................................
    public StudentImpl() {
    }

    public StudentImpl(LocalDate schoolRoleStart, Person aPerson) {
        this.roleHolder = aPerson;
    }
    
    
//    Setters and Getters........................................................

    public long getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(long studentNumber) {
        this.studentNumber = studentNumber;
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

    public Person getRoleHolder() {
        return roleHolder;
    }

    public void setRoleHolder(Person roleHolder) {
        this.roleHolder = roleHolder;
    }

    public Map<SchoolId, SchoolImpl> getSchoolsAttended() {
        return schoolsAttended;
    }

    public void setSchoolsAttended(Map<SchoolId, SchoolImpl> schoolsAttended) {
        this.schoolsAttended = schoolsAttended;
    }

    public SchoolImpl getSchoolImplAttending() {
        return schoolImplAttending;
    }

    public void setSchoolImplAttending(SchoolImpl schoolImplAttending) {
        this.schoolImplAttending = schoolImplAttending;
    }
}
