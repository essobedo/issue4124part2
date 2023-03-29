package com.mertdotcc.mappingresources.destination;

import java.time.OffsetDateTime;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class StudentWithGrades {

    private String studentFirstName;
    private String studentLastName;
    private String studentFaculty;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
    private double gpa;
    private double cgpa;

    public StudentWithGrades() {
    }

    public StudentWithGrades(String studentFirstName, String studentLastName, String studentFaculty, OffsetDateTime createdAt, OffsetDateTime updatedAt, double gpa, double cgpa) {
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentFaculty = studentFaculty;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.gpa = gpa;
        this.cgpa = cgpa;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getStudentFaculty() {
        return studentFaculty;
    }

    public void setStudentFaculty(String studentFaculty) {
        this.studentFaculty = studentFaculty;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
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
        return "StudentWithGrades{" +
                "studentFirstName='" + studentFirstName + '\'' +
                ", studentLastName='" + studentLastName + '\'' +
                ", studentFaculty='" + studentFaculty + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", gpa=" + gpa +
                ", cgpa=" + cgpa +
                '}';
    }
}
