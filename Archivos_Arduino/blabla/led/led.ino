  void setup() {
  pinMode(13,OUTPUT);
}

void loop() {
  digitalWrite(13,HIGH);
  for(int i = 0;i<1000;i++){
    digitalWrite(13,LOW);
  }
}
