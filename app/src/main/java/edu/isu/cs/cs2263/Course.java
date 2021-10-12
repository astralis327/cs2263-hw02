/*
 * Copyright 2021 Emily R. Elzinga
 * Created 09-28-21
 */

package edu.isu.cs.cs2263;

/**
 * Course. Student class has a list of these objects.
 * @author Emily Elzinga
 * @version 2.0.0
 */
public class Course {
    private int number;
    private String subject;
    private String title;

    /**
     * Constructor
     */
    public Course(){   }

    /**
     * Returns the course id number
     * @return number
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the course id
     * @param number course id
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Returns the subject of the course
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the subject of the course
     * @param subject subject, in caps (e.g. CS)
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * Returns the title of the course
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the course name
     * @param title course name
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Parses the object
     * @return Formatted object in string form
     */
    @Override
    public String toString() {
        return "Course{" +
                "number=" + number +
                ", subject='" + subject + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
