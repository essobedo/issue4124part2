package com.mertdotcc.mappingresources.source;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;

public class Student {

    @JsonProperty("studentFirstName")
    private String studentFirstName;

    @JsonProperty("studentLastName")
    private String studentLastName;

    @JsonProperty("studentFaculty")
    private StudentFacultyEnum studentFaculty;

    @JsonProperty("createdAt")
    private OffsetDateTime createdAt;

    @JsonProperty("updatedAt")
    private OffsetDateTime updatedAt;

    @JsonProperty("grades")
    private StudentGrades grades;

    public enum StudentFacultyEnum {
        ENGINEERING("ENGINEERING"),

        SCIENCE("SCIENCE"),

        HUMANITIES("HUMANITIES");

        private String value;

        StudentFacultyEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StudentFacultyEnum fromValue(String value) {
            for (StudentFacultyEnum f : StudentFacultyEnum.values()) {
                if (f.value.equals(value)) {
                    return f;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    public Student() {
    }

    public Student(String studentFirstName, String studentLastName, StudentFacultyEnum studentFaculty, OffsetDateTime createdAt, OffsetDateTime updatedAt, StudentGrades grades) {
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentFaculty = studentFaculty;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.grades = grades;
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

    public StudentFacultyEnum getStudentFaculty() {
        return studentFaculty;
    }

    public void setStudentFaculty(StudentFacultyEnum studentFaculty) {
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

    public StudentGrades getGrades() {
        return grades;
    }

    public void setGrades(StudentGrades grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentFirstName='" + studentFirstName + '\'' +
                ", studentLastName='" + studentLastName + '\'' +
                ", studentFaculty=" + studentFaculty +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", grades=" + grades +
                '}';
    }
}
