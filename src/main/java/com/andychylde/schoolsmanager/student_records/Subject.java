package com.andychylde.schoolsmanager.student_records;

/**
 *
 * @author Femi Falase
 */
public class Subject {
    String subjectName;
    SubjectCategory subjectCategory;    

    enum SubjectCategory {
        MATHEMATICS, PURE_SCIENCES, APPLIED_SCIENCES, MANAGEMENT_SCIENCES, HUMANITIES, LANGUAGES
    }

}
