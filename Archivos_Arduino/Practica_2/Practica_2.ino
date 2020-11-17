int in1 = 13;
int in2 = 11;
int in3 = 9;
int out = 4;
void setup() {
  pinMode(in1,INPUT);
  pinMode(in2,INPUT);
  pinMode(in3,INPUT);
  pinMode(out,OUTPUT);
}

void loop() {
  int estado = digitalRead(in1);
  int entrada1 = digitalRead(in2);
  int entrada2 = digitalRead(in3);
  if (estado == HIGH){
    if ( (entrada1 == HIGH) || (entrada2 == HIGH) ) {
      digitalWrite(out, HIGH);
    } else {
      digitalWrite(out, LOW); 
    }
  } else if( estado == LOW){ 
    if ((entrada1 == HIGH) && ( entrada2 == HIGH)) {
    digitalWrite(out, HIGH);
  } else{
    digitalWrite(out, LOW);
  }
 }
}
