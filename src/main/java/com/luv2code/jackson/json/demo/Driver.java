package com.luv2code.jackson.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

/**
 * Created by Tony Cai on 5/7/2018
 */
public class Driver {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        try {
            // create the object mapper
            ObjectMapper mapper = new ObjectMapper();

            // read JSON file and map/convert to Java POJO:
            // data/sample-lite.json
            Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);

            /*ClassLoader loader = ClassLoader.getSystemClassLoader();
            Student theStudent = mapper.readValue(
                    new File(loader.getResource("data/sample-lite.json").getFile()), Student.class);*/

            // print first name and last name
            System.out.println(theStudent);
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}