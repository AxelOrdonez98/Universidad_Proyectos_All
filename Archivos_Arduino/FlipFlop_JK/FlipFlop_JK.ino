int je=7,ke=6;
int reloj=5,q1=4,q2=3;
int cont=0;
void setup() {
  pinMode(je,INPUT);
  pinMode(ke,INPUT);
  pinMode(reloj,OUTPUT);
  pinMode(q1,OUTPUT);
  pinMode(q2,OUTPUT);
  Serial.begin(9600);
}
void loop() {
  int j=digitalRead(je),k=digitalRead(ke);
  Serial.println(cont);
   if(cont%2==0){
      digitalWrite(reloj ,LOW);
      if(j==LOW&&k==HIGH){
        digitalWrite(q1,LOW);
        digitalWrite(q2,HIGH);
      } else if(j==HIGH&&k==LOW){
        digitalWrite(q1,HIGH);
        digitalWrite(q2,LOW);
      } else if(j==HIGH&&k==HIGH){
        if(digitalRead(q1)==HIGH&&digitalRead(q2)==LOW){
          digitalWrite(q1,LOW);
          digitalWrite(q2,HIGH);
        } else if (digitalRead(q1) == LOW&&digitalRead(q2)==HIGH){
          digitalWrite(q1,HIGH);
          digitalWrite(q2,LOW);
        }
      }
  } else {
    digitalWrite(reloj ,HIGH);
  }
  cont++;
  delay(1000);
}
