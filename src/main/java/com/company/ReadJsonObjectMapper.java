package com.company;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.file.Paths;

public class ReadJsonObjectMapper {
    public static void main(String[] args) {
        try {
            // create object mapper instance
            ObjectMapper mapper = new ObjectMapper();

            // convert JSON string to Book object
            Book book = mapper.readValue(Paths.get("C:\\Users\\dnagpal\\Automaton Framework\\Practice-Programs\\src\\main\\java\\com\\company\\Book.json").toFile(), Book.class);

            // print book
            System.out.println(book);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
