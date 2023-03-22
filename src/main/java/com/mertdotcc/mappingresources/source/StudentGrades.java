package com.mertdotcc.mappingresources.source;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StudentGrades {

    @JsonProperty("gpa")
    private double gpa;

    @JsonProperty("cgpa")
    private double cgpa;

    public StudentGrades() {
    }

    public StudentGrades(double gpa, double cgpa) {
        this.gpa = gpa;
        this.cgpa = cgpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "StudentGrades{" +
                "gpa=" + gpa +
                ", cgpa=" + cgpa +
                '}';
    }
}
