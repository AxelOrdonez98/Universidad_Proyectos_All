package com.howtodoinjava.demo.jsonsimple;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class LeerJson {

    public static void main(String[] args) {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();

        try {
            FileReader reader = new FileReader("Celulares.json");
            //Read JSON file
            Object obj = jsonParser.parse(reader);

            JSONArray employeeList = (JSONArray) obj;
            System.out.println(employeeList);

            employeeList.forEach(emp -> parseEmployeeObject((JSONObject) emp));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void parseEmployeeObject(JSONObject employee) {
        //Get employee object within list
        JSONObject employeeObject = (JSONObject) employee.get("Ddtech");

        //Get employee first name
        String firstName = (String) employeeObject.get("Celular");
        System.out.println(firstName);

        //Get employee last name
        String lastName = (String) employeeObject.get("Year");
        System.out.println(lastName);

        //Get employee website name
        String website = (String) employeeObject.get("Precio");
        System.out.println(website);
        System.out.println("");
    }
}
