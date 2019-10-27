package com.andychylde.schoolsmanager.student_records;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Femi Falase
 */
//@Entity
public class AcademicSession implements Serializable {

    private LocalDate academicSessionStartDate;
    private LocalDate academicSessionEndDate;
    private final Term[] terms = new Term[3];
    enum TermId{FIRST_TERM, SECOND_TERM, THIRD_TERM}

    public AcademicSession() {
        terms[0] = new Term(1);//First Term
//        setting the term 1 start date to session start date
        terms[0].termStart = this.academicSessionStartDate;
        terms[1] = new Term(2);//Second Term
        terms[2] = new Term(3);//Third Term
//         setting the term 3 end date to session end date
        terms[2].termEnd = academicSessionEndDate;

    }

    public static class Term {

        LocalDate termStart, termEnd;
        TermId termId;

        public Term(int i) {
            switch(i){
                case 1:
                    this.termId=TermId.FIRST_TERM;
                case 2:
                    this.termId=TermId.SECOND_TERM;
                case 3:
                    this.termId=TermId.THIRD_TERM;
            }
        }

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

//    public Term createAcademicTerm() {
//
//        return new Term();
//    }

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
