/*
 * Courses
 * The List of Udemy Courses
 *
 * OpenAPI spec version: 1.0.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.example.coursesdemo.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Course
 */

public class Course {
    @JsonProperty("name")
    private String name = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("instructor")
    private String instructor = null;

    @JsonProperty("students")
    private List<Student> students = null;

    public Course name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the course
     *
     * @return name
     **/
    @JsonProperty("name")
    @Schema(description = "The name of the course")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course description(String description) {
        this.description = description;
        return this;
    }

    /**
     * The course description
     *
     * @return description
     **/
    @JsonProperty("description")
    @Schema(description = "The course description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Course instructor(String instructor) {
        this.instructor = instructor;
        return this;
    }

    /**
     * The name of the instructor
     *
     * @return instructor
     **/
    @JsonProperty("instructor")
    @Schema(description = "The name of the instructor")
    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public Course students(List<Student> students) {
        this.students = students;
        return this;
    }

    public Course addStudentsItem(Student studentsItem) {
        if (this.students == null) {
            this.students = new ArrayList<Student>();
        }
        this.students.add(studentsItem);
        return this;
    }

    /**
     * Get students
     *
     * @return students
     **/
    @JsonProperty("students")
    @Schema(description = "")
    @Valid
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }


}