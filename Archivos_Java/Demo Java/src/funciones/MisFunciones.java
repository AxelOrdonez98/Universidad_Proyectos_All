package funciones;
public class MisFunciones {
    /**
     * @param peso /:peso<0 decimal
     * @param estatura /:estatura, expresado en metros
     * @return  /: un valor doble
     */
    public static double calcularIMC(double peso, double estatura){
        // return (peso / (estatura*estatura));
        return(peso/Math.pow(estatura, 2));
    } 
    /**
     * @param cadena
     * @return 
     */
    /*
    public static boolean vocales(String cadena) {
        for (int i=0;i<cadena.length();i++) {
            if (cadena.charAt(i) != 'a' && cadena.charAt(i) != 'e' && cadena.charAt(i) != 'i' && cadena.charAt(i) != 'o' && cadena.charAt(i) != 'u' && cadena.charAt(i) != 'A' && cadena.charAt(i) != 'E' && cadena.charAt(i) != 'I' && cadena.charAt(i) != 'O' && cadena.charAt(i) != 'U'){
                return (false);
            } 
        }
        return (true);
    }
    
    */
    public static boolean vocales(String cadena) {
        boolean vocal = false;
        for (int i=0;i<cadena.length();i++) {
            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u' || cadena.charAt(i) == 'A' || cadena.charAt(i) == 'E' || cadena.charAt(i) == 'I' || cadena.charAt(i) == 'O' || cadena.charAt(i) == 'U'){
                vocal=true;
                break;
            } 
        }
        return (vocal);
    }
    /**
     * @param dia /: Dia del año [1-365]
     * @param mes /: Numero de mes [1-12]
     * @return 
     */
    public static String diaFestivo(int dia, int mes) {
        String diaFestivo = "";
        if (dia >=1 && dia<=365 ) {
            if (mes == 1) {
                if (dia == 1){
                    diaFestivo = "Si\nAño Nuevo";
                } else if (dia == 6) {
                    diaFestivo = "Si\nReyes Magos";
                } else {
                    diaFestivo = "No";
                }
            } else if (mes == 2) {
                if (dia == 5) {
                    diaFestivo = "Si\nDia de la constitucion";
                } else if (dia == 24) {
                    diaFestivo = "Si\nDia de la bandera";
                } else {
                    diaFestivo = "No";
                }
            } else if (mes == 3) {
                if (dia == 19) {
                    diaFestivo = "Si\nNatalicio de Benito Juarez";
                } else if (dia == 29) {
                    diaFestivo = "Si\nJueves Santo";
                } else {
                    diaFestivo = "No";
                }
            } else if (mes == 4) {
                if (dia == 1){
                    diaFestivo = "Si\nDia de resureccion";
                } else {
                    diaFestivo = "No";
                }
            } else if (mes == 5) {
                if (dia == 5) {
                    diaFestivo = "Si\nBatalla de puebla";
                } else if (dia == 1) {
                    diaFestivo = "Si\nDia del trabajo";
                } else if (dia == 10) {
                    diaFestivo = "Si\nDia de las madres";
                } else {
                    diaFestivo = "No";
                }
            } else if (mes == 9){
                if (dia == 16) {
                    diaFestivo = "Si\nDia de la independencia";
                } else {
                    diaFestivo = "No";
                }
            } else {
                diaFestivo = "No";
            }
        }
        return diaFestivo;
    }
    /**
     * @param x Variable a evaluar
     * @return 
     */
    public static String numeroPar(int x) {
        String numPar = "";
        if (x % 2 == 0) {
            numPar = "El numero es par";
        }else {
            numPar = "El numero no es par";
        }
        return numPar;
    }
    /**
     * @param num1 /: Numero 1 a evaluar
     * @param num2 /: Numero 2 a evaluar
     * @param num3 /: Numero 3 a evaluar
     * @return 
     */
    public static String numeroMedio(int num1, int num2, int num3) {
        String numeroMedio = "";
        if ((num1 > num2) && (num1 < num3)) {
            numeroMedio = "El numero " + num1 + " es el medio";
        } else if ((num2 < num1) && (num2 > num3)) {
            numeroMedio = "El numero " + num2 + " es el medio";
        } else {
            numeroMedio = "El numero " + num3 + " es el medio";
        }
        return numeroMedio;
    }
    /**
     * 
     * @param numPrimo
     * @return 
     */
    public static boolean numPrimo(int numPrimo) {
        int conta = 0;
        for (int i = 1;i<=(numPrimo+1);i++) {
            if ((numPrimo % i == 0)) {
                conta++;            
            }
        } if (conta != 2) {
            return (false);
        } else {
           return (true); 
        }
    }
    /**
     * 
     * @param cadena
     * @return 
     */
    public static boolean numVocales(String cadena) {
        boolean vocal = false;
        int conta = 0;
        for (int i=0;i<cadena.length();i++) {
            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u' || cadena.charAt(i) == 'A' || cadena.charAt(i) == 'E' || cadena.charAt(i) == 'I' || cadena.charAt(i) == 'O' || cadena.charAt(i) == 'U'){
                vocal=true;
                conta++;
            } 
        }
        System.out.print("\nEl numero de vocales es: "+conta);
        return vocal;
    }
    /**
     * 
     * @param cadena
     * @return 
     */
    public static boolean numHexa(String cadena) {
        boolean vocal = false;
        for (int i=0;i<cadena.length();i++) {
            if (cadena.charAt(i) == '0' || cadena.charAt(i) == '1' || cadena.charAt(i) == '2' || cadena.charAt(i) == '3' || cadena.charAt(i) == '4' || cadena.charAt(i) == '5' || cadena.charAt(i) == '6' || cadena.charAt(i) == '7' || cadena.charAt(i) == '8' || cadena.charAt(i) == '9' || cadena.charAt(i) == 'A' || cadena.charAt(i) == 'B' || cadena.charAt(i) == 'C' || cadena.charAt(i) == 'D' || cadena.charAt(i) == 'E' || cadena.charAt(i) == 'F' || cadena.charAt(i) == 'a' || cadena.charAt(i) == 'b' || cadena.charAt(i) == 'c' || cadena.charAt(i) == 'd' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'f'){
                vocal=true;
            } 
        }
        return vocal;
    }
    /**
     * 
     * @param numeros
     * @return 
     */
    public static float calcularMediana(float[] numeros) {
        int tamaño = numeros.length;
        float temporal = 0;
        for (int i = 0; i < tamaño; i++) {
            for (int j = 1; j < (tamaño - i); j++) {
                if (numeros[j - 1] > numeros[j]) {
                    temporal = numeros[j - 1];
                    numeros[j - 1] = numeros[j];
                    numeros[j] = temporal;
                }
            }
        }
        float mediana = (numeros[4] + numeros[5]) / 2;
        return mediana;
    }
    /**
     * 
     * @param numero1
     * @param numero2
     * @return 
     */
    public static boolean validarMultiplo(int numero1, int numero2) {
        boolean multiplo = false;
        if (numero2 % numero1 == 0 || numero1 % numero2 == 0) {
            multiplo = true;
        }
        return multiplo;
    } 
}