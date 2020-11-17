int entradaA0=12,entradaA1=13,entradaB0=10,entradaB1=11,salidaM3=7;
int salidaM2=6,salidaM1=5,salidaM0=4;
void setup() {
pinMode(entradaA0,INPUT);
pinMode(entradaA1,INPUT);
pinMode(entradaB0,INPUT);
pinMode(entradaB1,INPUT);
pinMode(salidaM3,OUTPUT);
pinMode(salidaM2,OUTPUT);
pinMode(salidaM1,OUTPUT);
pinMode(salidaM0,OUTPUT);
}

void loop() {
  int a0 = digitalRead(entradaA0),a1 = digitalRead(entradaA1);
  int b0 = digitalRead(entradaB0),b1 = digitalRead(entradaB1);
  //salida m3
  if(a1==HIGH&&a0==HIGH&&b1==HIGH&&b0==HIGH){
    digitalWrite(salidaM3,HIGH);
  }else{
    digitalWrite(salidaM3,LOW);
  }
  //salida m2
  if((a1==HIGH&&b1==HIGH&&b0==LOW)||(a1==HIGH&&a0==LOW&&b1==HIGH)){
    digitalWrite(salidaM2,HIGH);
  }
  else{
    digitalWrite(salidaM2,LOW);
  }
  //salida m1
  if((a1==LOW&&a0==HIGH&&b1==HIGH) || (a0==HIGH&&b1==HIGH&&b0==LOW) || (a1==HIGH&&a0==LOW&&b0==HIGH) ||(a1==HIGH&&b1==LOW&&b0==HIGH)){
    digitalWrite(salidaM1,HIGH);
  }
  else{
    digitalWrite(salidaM1,LOW);
  }
  //salida m0
  if(a0==HIGH&&b0==HIGH){
    digitalWrite(salidaM0,HIGH);
  }
  else{
    digitalWrite(salidaM0,LOW);
  }

}
