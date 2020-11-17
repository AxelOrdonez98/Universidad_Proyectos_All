unsigned long tiempoActual = 0;
unsigned long tiempoTranscurrido = 0;
boolean led13=false; // led 13 apagado
boolean tarea2=false;
//boolean tarea3=false
byte Contador=0;
void Tarea1EnciendeApagaLED(void);
void Tarea2HolaMundo(void); 
void Tarea3Contador(int);
void setup() {
  pinMode(13,OUTPUT);
  Serial.begin(9600);
  tiempoActual = millis();
}
void loop() {
  tiempoTranscurrido = millis();
  //tarea1 encender y apagar un led
  if(tiempoTranscurrido > (tiempoActual+3000)){  //Si ha pasado 1 segundo ejecuta el IF
    tiempoActual = millis(); //Actualiza el tiempo actual
    Tarea1EnciendeApagaLED();//tarea1
    tarea2=true;
   }
   if(tiempoTranscurrido == (tiempoActual+2000)&& tarea2==true) {  //Si ha pasado 1 segundo ejecuta el IF
    Tarea2HolaMundo();//tarea2
    tarea2=false;
   }
  if(tiempoTranscurrido == (tiempoActual+1500)){  //Si ha pasado 1 segundo ejecuta el IF
    
    Tarea3Contador(Contador);//tarea3
    Contador++;
   } 
  
} 
void Tarea1EnciendeApagaLED(){
   
    if(led13==true)
      {
        digitalWrite(13,HIGH); // encender led
        Serial.println(" LED pin 13 ENCENDIDO");
        led13=false;//led13=0
      }
     else{
        digitalWrite(13,LOW); // apagar led
        Serial.println(" LED pin 13 APAGADO");
        led13=true;//led13=1
      } 

}
//Tarea2
void Tarea2HolaMundo(void)
{
 
      Serial.println("Hola Mundo y Soy Tarea 2");
         
  
} 
//Tarea3
void Tarea3Contador(int x){
               
        Serial.println("y Soy Tarea 3 y EL CONTADOR ESTA EN:");
        Serial.println(x); 
         
}