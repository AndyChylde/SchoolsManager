package com.andychylde.schoolsmanager.utils;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Femi Falase
 */
@Entity
@Table(name = "Persons")
public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PersonId")
    private long personId;
    @Embedded
    private final PersonName personName = new PersonName();
    @Column(name = "BirthDate")
    private LocalDate birthDate;
    @Column(name = "Gender")
    private Gender gender = Gender.UNKNOWN;

//    Constructor(s).............................................................
    /*
    @param firstname
    @param middlename
    @param familyname    
     */
    public Person(String firstname, String middlename, String familyname, LocalDate birthDate, Gender gender) {
        this.personName.familyname = familyname;
        this.personName.middlename = middlename;
        this.personName.firstname = firstname;
        this.birthDate = birthDate;
        this.gender = gender;

    }

    public Person() {

    }

//    Setters amd Getters........................................................
    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }

    public PersonName getPersonName() {
        return personName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

//    Nested Classe(s)...........................................................
    public enum Gender {
        FEMALE("Female"), MALE("Male"), UNKNOWN("Unknown");
        private String genderType;

//        Gender Constructor
        private Gender(String genderType) {
            this.genderType = genderType;
        }

//        Gender setters and getters.............................................
        public String getGenderType() {
            return genderType;
        }

        public void setGenderType(String genderType) {
            this.genderType = genderType;
        }

    }

    @Embeddable
    public static class PersonName implements Serializable {

//        inner class attributes................................................
        @Column(name = "First_Name")
        String firstname;
        @Column(name = "Middle_Name")
        String middlename;
        @Column(name = "Family_Name")
        String familyname;

//        Nested class constructor(s)............................................
        public PersonName() {
        }    //default constructor

        public PersonName(String firstname, String middlename, String familyname) {
            this.firstname = firstname;
            this.middlename = middlename;
            this.familyname = familyname;
        }

//        Setters and Getters....................................................
        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getMiddlename() {
            return middlename;
        }

        public void setMiddlename(String middlename) {
            this.middlename = middlename;
        }

        public String getFamilyname() {
            return familyname;
        }

        public void setFamilyname(String familyname) {
            this.familyname = familyname;
        }

        @Override
        public String toString() {
            return firstname + " " + middlename + " " + familyname.toUpperCase();
        }

    }
}
