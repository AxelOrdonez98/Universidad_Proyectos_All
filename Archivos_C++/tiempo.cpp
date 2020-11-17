unsigned long tiempoActual = 0;
unsigned long tiempoTranscurrido = 0;
boolean led13=false; // led 13 apagado

void Tarea1EnciendeApagaLED(void);
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