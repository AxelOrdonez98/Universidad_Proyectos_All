package com.howtodoinjava.demo.jsonsimple;

import java.io.FileWriter;
import java.io.IOException;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CrearJson {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        //1er celular
        JSONObject employeeDetails = new JSONObject();
        employeeDetails.put("Celular", "uno");
        employeeDetails.put("Year", "2012");
        employeeDetails.put("Precio", "5000");

        JSONObject employeeObject = new JSONObject();
        employeeObject.put("Ddtech", employeeDetails);

        //2do celular
        JSONObject employeeDetails2 = new JSONObject();
        employeeDetails2.put("Celular", "dos");
        employeeDetails2.put("Year", "2018");
        employeeDetails2.put("Precio", "6000");

        JSONObject employeeObject2 = new JSONObject();
        employeeObject2.put("Ddtech", employeeDetails2);
        
        //3er Celular
        JSONObject employeeDetails3 = new JSONObject();
        employeeDetails3.put("Celular", "tres");
        employeeDetails3.put("Year", "2018");
        employeeDetails3.put("Precio", "19000");

        JSONObject employeeObject3 = new JSONObject();
        employeeObject3.put("Ddtech", employeeDetails3);

        JSONArray employeeList = new JSONArray();
        employeeList.add(employeeObject);
        employeeList.add(employeeObject2);
        employeeList.add(employeeObject3);
        
        //crear
        try (FileWriter file = new FileWriter("Celulares.json")) {

            file.write(employeeList.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
