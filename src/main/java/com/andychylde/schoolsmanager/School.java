package com.andychylde.schoolsmanager;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

/**
 * @author Femi Falase
 * @version 0.0.1
 */
@Entity
@Table(name = "school")
public class School implements Serializable {

//    Attributes................................................................
    @Id
    @Column(name = "schoolId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int schoolId;
    @Column(name = "SchoolName", length = 255, nullable = false)
    private String schoolName;

//    Constructors..............................................................
    public School(String schoolName) {
        this.schoolName = schoolName;
    }
//    default constructor

    public School() {

    }

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

}
