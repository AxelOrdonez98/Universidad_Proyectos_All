package Examen;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Lectura {

    private String guardar = "";

    public static void MuestraContenido(String archivo) throws FileNotFoundException, IOException {
        Lectura xi = new Lectura();
        String ver;
        FileReader leer = new FileReader(archivo);
        BufferedReader ber = new BufferedReader(leer);
        while ((ver = ber.readLine()) != null) {
            System.out.println(ver);
        }
        xi.guardar = ver;
        ber.close();
    }

    public static void CambiarYGuardar(String replace) throws IOException {
        Lectura xi = new Lectura();
        String guardado = xi.guardar;
        String ruta = "C:\\Users\\Axel Ordoñez\\Documents\\NetBeansProjects\\Examen\\Prueba/nuevo.txt";//Ruta donde se guarda el nuevo archivo
        File archivo = new File(ruta);//variable que lo guarda
        BufferedWriter bw;
        bw = new BufferedWriter(new FileWriter(archivo));
        if (archivo.exists()) {
            bw.write("Nuevo alfaveto: " + guardado.replace("A", "Z").replace("B", "Y").replace("C", "X").replace("D", "T").replace("E", "S").replace("G", "R").replace("H", "Q").replace("I", "P").replace("J", "O").replace("K", "N").replace("L", "M").toLowerCase());
        } else {
            bw.write("Nuevo alfaveto: " + guardado.replace("A", "Z").replace("B", "Y").replace("C", "X").replace("D", "T").replace("E", "S").replace("G", "R").replace("H", "Q").replace("I", "P").replace("J", "O").replace("K", "N").replace("L", "M").toLowerCase());
        }
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        MuestraContenido("C:\\Users\\Axel Ordoñez\\Documents\\NetBeansProjects\\Examen\\Prueba/Examen.txt");
        CambiarYGuardar("C:\\Users\\Axel Ordoñez\\Documents\\NetBeansProjects\\Examen\\Prueba/");
    }

}
