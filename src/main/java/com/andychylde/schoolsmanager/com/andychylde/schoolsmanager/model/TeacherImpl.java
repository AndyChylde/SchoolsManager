package com.andychylde.schoolsmanager.com.andychylde.schoolsmanager.model;

import com.andychylde.schoolsmanager.utils.Person;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author Femi Falase
 * @version 0.0.1
 */
@Entity
@Table//(name="Teachers")
public class TeacherImpl extends SchoolRoleImpl implements Teacher, Serializable {

    //    Attributes................................................................
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long teacherId;
    @ManyToMany
    private final Map<SchoolId, SchoolImpl> schoolsTeaching = new HashMap<>();


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

    public Map<SchoolId, SchoolImpl> getSchoolsTeaching() {
        return schoolsTeaching;
    }

    //=====================================================================================================================
//    Inner Class(es)
    @Embeddable
    public static class TeacherId implements Serializable {


        //        @GeneratedValue(strategy = GenerationType.AUTO)
        long teacherId;

        public TeacherId(long teacherId) {
            this.teacherId = teacherId;
        }

        public TeacherId() {
        }

        public long getTeacherId() {
            return teacherId;
        }

        public void setTeacherId(long teacherId) {
            this.teacherId = teacherId;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TeacherId teacherId1 = (TeacherId) o;
            return teacherId == teacherId1.teacherId;
        }

        @Override
        public int hashCode() {
            return Objects.hash(teacherId);
        }


    }//end of TeacherId

}//end of Teacher class
