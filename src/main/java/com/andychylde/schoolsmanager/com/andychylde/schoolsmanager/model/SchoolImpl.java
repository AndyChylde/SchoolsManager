package com.andychylde.schoolsmanager.com.andychylde.schoolsmanager.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Femi Falase
 * @version 0.0.1
 */
@Entity
@Table(name = "schools")
//@IdClass(SchoolId.class)
public class SchoolImpl implements School, Serializable {

    //    Attributes................................................................
    @EmbeddedId
    private SchoolId schoolId;
    @Column(name = "SchoolName", length = 255, nullable = false)
    private String schoolName;
    @ElementCollection
    @CollectionTable(name = "Students")
    private Map<Long, StudentImpl> students = new HashMap<>();

    @ManyToMany(cascade = CascadeType.ALL)
    private Map<TeacherImpl.TeacherId, TeacherImpl> teachers = new HashMap<>();


    //    Constructors..............................................................
    public SchoolImpl(String schoolName) {
        this.schoolName = schoolName;
    }//end: constructor

    public SchoolImpl() {

    }//end: default constructor

    public SchoolId getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(SchoolId schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }


}
