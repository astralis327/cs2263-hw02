/*
* Copyright 2021 Emily R. Elzinga
* Created 09-28-21
* */

package edu.isu.cs.cs2263;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *  Stores data by Gson Serialization
 *  @author Isaac D Griffith
 *  @version 1.2.0
 */
public class IOManager {

    /**
     * Is given an array of Student objects, translates the list and objects to JSON, and writes the string to a text file
     * @param fileName file that the data is to be stored in
     * @param data list of student objects to be written to file
     * @throws IOException There is a chance that the file cannot be found
     */
    void writeData(String fileName, List<Student> data) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Writer writer = new BufferedWriter((new OutputStreamWriter(
                new FileOutputStream(fileName), StandardCharsets.UTF_8)
        ));
        gson.toJson(data, writer);
        writer.close();
    }

    /**
     * Reads a string from a file. Must be a JSON array of JSON objects to work properly.
     * @param filePath path to file that is to be read. If it doesn't exist, an exception is thrown.
     * @return the list of Student objects
     */
    List<Student> readData(String filePath)  {

        List<Student> studentList = new ArrayList<>();
        try {
            String json = String.join("\n", Files.readAllLines(Paths.get(filePath)));
            Gson gson = new Gson();
            studentList = List.of(gson.fromJson(json, Student[].class));

            System.out.println(studentList.get(0).getStudentCourses());
        }
         catch (Exception ex){
            System.out.format("I/O error: %s%n", ex);
        }
        return studentList;
    }
}
