/*
 * Copyright 2021 Emily R. Elzinga
 * Created 09-28-21
 * */
package edu.isu.cs.cs2263;

import java.util.List;

/**
 * Student. This class includes the important characteristics of a student.
 *
 * @author Emily Elzinga
 * @version 2.1.0
 */
public class Student {
    private List<Course> studentCourses;
    private String firstName;
    private String lastName;

    /**
     * Constructor
     */
    public Student(){   };

    /**
     * @return a list of the courses the student is taking
     */
    public List<Course> getStudentCourses() {
        return studentCourses;
    }

    /**
     * @return the student's first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the student
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the last name of the student
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the student
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * fills a list with all the courses the student is taking
     * @param studentCourses
     */
    public void setStudentCourses(List<Course> studentCourses) {
        this.studentCourses = studentCourses;
    }


    /**
     *
     * @return a parsed string of the student's name.
     */
    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
