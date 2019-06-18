package com.andychylde.schoolsmanager.student_records;

import java.time.LocalDate;
import javax.persistence.Entity;

/**
 *
 * @author Femi Falase
 */
//@Entity
public class AcademicSession {

    private LocalDate academicSessionStartDate;
    private LocalDate academicSessionEndDate;
    private final Term[] terms = new Term[3];

    public AcademicSession() {

        terms[0] = new Term();//First Term
        terms[1] = new Term();//Second Term
        terms[2] = new Term();//Third Term

    }

    public class Term {

        private LocalDate termStart, termEnd;

        public LocalDate getTermStart() {
            return termStart;
        }

        public void setTermStart(LocalDate termStart) {
            this.termStart = termStart;
        }

        public LocalDate getTermEnd() {
            return termEnd;
        }

        public void setTermEnd(LocalDate termEnd) {
            this.termEnd = termEnd;
        }

    }

    public Term createAcademicTerm() {

        return new Term();
    }

    public LocalDate getAcademicSessionStartDate() {
        return academicSessionStartDate;
    }

    public void setAcademicSessionStartDate(LocalDate academicSessionStartDate) {
        this.academicSessionStartDate = academicSessionStartDate;
    }

    public LocalDate getAcademicSessionEndDate() {
        return academicSessionEndDate;
    }

    public void setAcademicSessionEndDate(LocalDate academicSessionEndDate) {
        this.academicSessionEndDate = academicSessionEndDate;
    }

    public Term[] getTerms() {
        return terms;
    }

}
