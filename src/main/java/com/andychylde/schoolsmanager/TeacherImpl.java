package com.andychylde.schoolsmanager;

import com.andychylde.schoolsmanager.utils.Person;
import com.andychylde.schoolsmanager.utils.SchoolRoleImpl;
import java.time.LocalDate;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Femi Falase
 */
@Entity
@Table(name="Teachers")
public class TeacherImpl extends SchoolRoleImpl implements Teacher {

//    Attributes................................................................
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Teacher_Id")
    private long teacherId;

//    Constructor(s)............................................................    
    public TeacherImpl(LocalDate schoolRoleStart, Person aPerson) {
        this.roleHolder = aPerson;
    }

    public TeacherImpl() {
    }

    public long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(long teacherId) {
        this.teacherId = teacherId;
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
