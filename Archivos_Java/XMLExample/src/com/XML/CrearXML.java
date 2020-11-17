package com.XML;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Axel
 */
public class CrearXML {

    private static final String SERIALIZED_FILE_NAME = "Celular.xml";

    public static void main(String args[]) {

        Celulara e1 = new Celulara(1, "uno", "2015");
        Celulara e2 = new Celulara(2, "dos", "2018");
        Celulara e3 = new Celulara(3, "tres", "2018");

        List list = new ArrayList();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        Guardar se = new Guardar();
        se.setMovies(list);

        XMLEncoder encoder = null;
        try {
            encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(SERIALIZED_FILE_NAME)));
        } catch (FileNotFoundException fileNotFound) {
            System.out.println("ERROR: While Creating or Opening the File dvd.xml");
        }
        encoder.writeObject(se);
        encoder.close();

    }
}
