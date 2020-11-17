package curp;
import java.util.*;
public class Curp {
    private String curp;
    private String nombre;
    private String apellidoMaterno;
    private String apellidoPaterno;
    private String sexo;
    private String estado;
    private int diaDeNacimiento;
    private int mesDeNacimiento;
    private int yearDeNacimiento;
    //-------------------------------------------
    //nombre
    public void setnombre(String nombre) {
        this.nombre = nombre;
    }
    public String getnombre() {
        return nombre;
    }
    //-------------------------------------------
    //apellido materno
    public void setapellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    public String getapellidoMaterno() {
        return apellidoMaterno;
    }
    //-------------------------------------------
    //apellido paterno
    public void setapellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    public String getapellidoPaterno() {
        return apellidoPaterno;
    }
    //-------------------------------------------
    // sexo
    public void setsexo(String sexo) {
        this.sexo = sexo;
    }
    public String getsexo() {
        return sexo;
    }
    //-------------------------------------------
    //Estado
    public void setestado(String estado) {
        this.estado = estado;
    }
    public String getestado() {
        return estado;
    }
    //-------------------------------------------
    //dia de nacimiento
    public void setdiaDeNacimiento(int diaDeNacimiento) {
        this.diaDeNacimiento = diaDeNacimiento;
    }
    public int getdiaDeNacimiento() {
        return diaDeNacimiento;
    }
    //-------------------------------------------
    //mes de nacimiento
    public void setmesDeNacimiento(int mesDeNacimiento) {
        this.mesDeNacimiento = mesDeNacimiento;
    }
    public int getmesDeNacimiento() {
        return mesDeNacimiento;
    }
    //-------------------------------------------
    //año de nacimiento
    public void setyearDeNacimiento(int yearDeNacimiento) {
        this.yearDeNacimiento = yearDeNacimiento;
    }
    public int getyearDeNacimiento() {
        return yearDeNacimiento;
    }
    //-------------------------------------------
    public String generarCurp() {
        char apePart = apellidoPaterno.charAt(0);
        curp +=""+apePart;
        int conta = 0;
        for (char b : apellidoPaterno.toCharArray()) {
            conta++;
            if ((b == 'a' || b == 'e' || b == 'i' || b == 'o' || b == 'u' 
              || b == 'A' || b == 'E' || b == 'I' || b == 'O' || b == 'U') && conta != 1) {
                curp+=""+b;
                break;
            }
        }
       char apeMat = apellidoMaterno.charAt(0);
       char nambre = nombre.charAt(0);
       char genero = sexo.charAt(0);
       String dia = Integer.toString(diaDeNacimiento);
       String mes = Integer.toString(mesDeNacimiento);
       String year = Integer.toString(yearDeNacimiento);
       year = year.substring(2, 4);
       if (mesDeNacimiento < 10 ){
           mes = "0"+mes;
       }
       if (diaDeNacimiento < 10) {
          dia = "0"+diaDeNacimiento;
       }
       curp+=""+apeMat+nambre+year+mes+dia+genero; 
       return curp.toUpperCase();
    }
    //-------------------------------------------
    public String generarCurpSinSegundoApellido() {
        char apePart = apellidoPaterno.charAt(0);
        curp +=""+apePart;
        int conta = 0;
        for (char b : apellidoPaterno.toCharArray()) {
            conta++;
            if ((b == 'a' || b == 'e' || b == 'i' || b == 'o' || b == 'u' || b == 'A' || b =='E' || b == 'I' || b == 'O' || b == 'U') && conta != 1) {
                curp+=""+b;
                break;
            }
        }
       char nambre = nombre.charAt(0);
       char genero = sexo.charAt(0);
       String year = Integer.toString(yearDeNacimiento);
       String dia = Integer.toString(diaDeNacimiento);
       year = year.substring(2, 4);
       String mes = Integer.toString(mesDeNacimiento);
       String estadoExtranjero = "NE";
       String sinApe = "";
       if (mesDeNacimiento < 10){
           mes = "0"+mes;
       } 
       if (diaDeNacimiento < 10)  {
           dia = "0"+dia;
       }
       if (apellidoMaterno == null) {
           sinApe = "x"+sinApe;
       }
       curp+=""+"x"+nambre+year+mes+dia+genero+estadoExtranjero;
       for (char b : apellidoPaterno.toCharArray() ) {
           if (b != 'a' || b != 'e' || b != 'i' || b != 'o' || b != 'u' 
            || b != 'A' || b != 'E' || b != 'I' || b != 'O' || b != 'U') {
                curp+=""+b;
                break;
            }
       }
       curp+=sinApe;
       for (char b : nombre.toCharArray() ) {
           if (b != 'a' || b != 'e' || b != 'i' || b != 'o' || b != 'u' 
            || b != 'A' || b != 'E' || b != 'I' || b != 'O' || b != 'U') {
                curp+=""+b;
                break;
            }
       }
       return curp.toUpperCase(); 
    }
    //-------------------------------------------
    
    //-------------------------------------------
}