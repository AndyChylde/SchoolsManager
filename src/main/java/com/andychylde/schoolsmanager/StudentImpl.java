package com.andychylde.schoolsmanager;

import com.andychylde.schoolsmanager.utils.Person;
import com.andychylde.schoolsmanager.utils.SchoolRoleImpl;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Femi Falase
 * @version 0.0.1
 */
public class StudentImpl extends SchoolRoleImpl implements Student {

//    Attributes.................................................................
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Stundent_Id")
    private long studentNumber;

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
    
    

}
