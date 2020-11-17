int seg = 1000;
unsigned long tiempoNuevo = 0;
void setup() {
    pinMode(13, OUTPUT);
}
void loop() {
  digitalWrite(13, HIGH);
  pausa();
  digitalWrite(13, LOW);
  pausa();
}

void pausa(){
  tiempoNuevo = millis();
  while(millis() < tiempoNuevo + seg){
  }
}
