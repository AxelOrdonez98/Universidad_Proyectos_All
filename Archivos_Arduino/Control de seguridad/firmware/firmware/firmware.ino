#include "Keypad.h" // Controla el teclado
#include <LiquidCrystal.h>  //controla el LCD
#include <Servo.h>  //Control del servomotor
#include <EEPROM.h>  //Controla EEPROM
#define CERRAR 90 //servomotor cerrado
#define ABRIR 180 //servomotor abierto
Servo seguro;   //servomotor
LiquidCrystal lcd(2 , 3, 4, 5, 6, 7); //display LCD
const byte filas = 4;
const byte columnas = 4;
byte pinsFilas[filas] = {9, 10, 11, 12};
byte pinsColumnas[columnas] = {14, 15, 16, 17};
char teclas[filas][columnas] =  { // Declaración del teclado
  {'1', '2', '3', 'A'},                       
  {'4', '5', '6', 'B'},
  {'7', '8', '9', 'C'},
  {'*', '0', '#', 'D'},
};
Keypad teclado = Keypad(makeKeymap(teclas), pinsFilas, pinsColumnas, filas, columnas);
char password[5]; //almacena la contraseña en eeprom
char ingreso;  //ingreso del usuario
char passUser[4];
char confirmPass[4];  //confirmacion de la contraseña
int i=0;
int a; //aux
void setup() {
  pinMode(19, OUTPUT); // LEDS QUE INDICAN ABIERTO(13) O CERRADO(19)
  pinMode(13, OUTPUT);
  digitalWrite(19, HIGH); //enciende el led de cerrado
  seguro.attach(18);  // Pin del servomotor
  seguro.write(CERRAR);
  lcd.begin(16, 2);   //Configuracion lcd 16X2 (columnas,fila)
  seguro.write(90);  //Cerrar puerta
  lcd.setCursor(0, 0);
  lcd.print(" **Contrasena** ");
  lcd.setCursor(5, 1);
  lcd.print("____");
  //LEER CONTRASEÑA DE LA EEPROM 
    if(EEPROM.read(4)!='Z'){
    EEPROM.write(0,'1');
    EEPROM.write(1,'2');
    EEPROM.write(2,'3');
     EEPROM.write(3,'4');
    EEPROM.write(4,'Z'); 
  }
   for (int i = 0; i <= 4; i++) { 
    password[i] = EEPROM.read(i);
  }              
  
}
void loop() {
    leerIngreso(1);
}
 
void leerIngreso(int a) {
  ingreso = teclado.getKey();
  if (ingreso != NO_KEY)
    switch (ingreso) {
      case 'A':    // enter
        if(evaluar(1)==1)
        correcto();
        else{
        msgError();
        }
        reset();
        break;
      case 'B':
        informacion();  //opciones
        reset();
        break;
      case 'C':
        cambioPass();
        reset();
        break;
      case 'D':
        lcd.setCursor(0, 0);
        lcd.print("Cerrar          ");
        delay(1000);
        seguro.write(CERRAR);
        reset();
        break;
      case '*':
        lcd.setCursor(0, 0);
        lcd.print("Presionaste '*' ");
        delay(1000);
        reset();
        break;
      case '#':
        lcd.setCursor(0, 0);
        lcd.print("Presionaste '#'    ");
        delay(1000);
        reset();
        break;
      default: //si es un numero debe imprimirlo en el LCD y ademas guardarlo en el arreglo passUser
        if(a==1){
        passUser[i] = ingreso;
        printPass(passUser[i], 5 + i, 1);
        }
        if(a==2){
        confirmPass[i] = ingreso;
        printPass(confirmPass[i], 5 + i, 1);
        }
        i++;
        if (i > 3)
          i = 0;
 }
}

void cleanlcd() {
  lcd.setCursor(0, 0);
  lcd.print("                ");
  lcd.setCursor(0, 1);
  lcd.print("                ");
}


void printPass(char a, int columna, int fila ) {
  lcd.setCursor(columna, fila);
  lcd.print(a);
  delay(100);
  lcd.setCursor(columna, fila);
  lcd.print("*");
}

int evaluar(int a) {
  int j = 0;
  if (a==1){
  for (int i = 0; i <= 3; i++) {
    if (password[i] == passUser[i]) {
        j++;
    }
  }
  }
  if(a==2){
  for (int i = 0; i <= 3; i++) {
    if (passUser[i] == confirmPass[i]) {
        j++;
    }
  }
  }
  if (j == 4) {
    return j=1;
  }
  else {
    return j=0;
  }
}

void reset() {
  lcd.setCursor(0, 0);
  lcd.print(" **Contrasena** ");
  lcd.setCursor(5, 1);
  lcd.print("____");
  for(int i =0;i<=3;i++){
  passUser[i]=NO_KEY;
  confirmPass[i]=NO_KEY;
  }
  i=0;
}

void msgError(){
        lcd.setCursor(0, 0);
        lcd.print("      ERROR      ");
        delay(1000);
  }

void correcto(){
        lcd.setCursor(0, 0);
        lcd.print("     CORRECTO      ");
        seguro.write(ABRIR);
        delay(1000);
}
 
void informacion() {
  lcd.setCursor(0, 0);
  lcd.print("'A' para introdu");
  delay(1000);
  lcd.setCursor(0, 0);
  lcd.print("cir la contra        ");
  delay(1000);
  lcd.setCursor(0, 0);
  lcd.print("'C' para cambiar");
  delay(1000);
  lcd.setCursor(0, 0);
  lcd.print(" la contra             ");
  delay(1000);
  lcd.setCursor(0, 0);
  lcd.print("'D' para cerrar");
  delay(1000);
}

void cambioPass() {
   lcd.setCursor(0, 0);
  lcd.print("Cambio de contra      ");
  delay(1000);
  lcd.setCursor(0, 0);
  lcd.print("Introduce contra       ");
  delay(1000);
  lcd.setCursor(0, 0);
  lcd.print("anterior         ");
  delay(1000);  
  reset();
   while(passUser[3]==NO_KEY){
    leerIngreso(1);}
  if (evaluar(1) == 1) {
    lcd.setCursor(0, 0);
    lcd.print("Introduce           ");
    delay(1000);
    lcd.setCursor(0, 0);
    lcd.print("la contra nueva            ");
    delay(1000);
    reset();
    while(passUser[3]==NO_KEY){
      leerIngreso(1);
  }
    lcd.setCursor(0, 0);
    lcd.print("Vuelve a intro     ");
    delay(1000);
    lcd.setCursor(0, 0);
    lcd.print("cirla           ");
    delay(1000);   
    lcd.setCursor(0, 0);
    lcd.print(" **Contrasena** ");
    lcd.setCursor(5, 1);
    lcd.print("____");
    lcd.setCursor(0, 0);
    i=0;
    while(confirmPass[3]==NO_KEY){
      leerIngreso(2);
  }
    if(evaluar(2)==1){
      //EEPROM
      for (int i = 0; i <= 3; i++) { 
         EEPROM.write(i, passUser[i]);
    }
      for (int i = 0; i <= 3; i++) { 
         password[i] = EEPROM.read(i);
  }
      lcd.setCursor(0, 0);
      lcd.print("Contrasena cam  ");
      delay(1000);
      lcd.setCursor(0, 0);
      lcd.print("biada           ");
      delay(1000);
    }
    else{
      lcd.setCursor(0, 0);
      lcd.print("Error las contra   ");
      delay(1000);
      lcd.setCursor(0, 0);
      lcd.print("no coinciden        ");
      delay(1000);
    }
    
  }
  else {
    msgError();
  }
  reset();
}

void passChange(){
 for(int i=0;i<=3;i++){
   password[i]=passUser[i];
 }
  
}
