int in1 = 8;
int in2 = 9;
int in3 = 10;
int enabled = 11;
int out0 = 7;
int out1 = 6;
int out2 = 5;
int out3 = 4;
int out4 = 3;
void setup() {
  pinMode(in1, INPUT);
  pinMode(in2, INPUT);
  pinMode(in2, INPUT);
  pinMode(enabled, INPUT);
  pinMode(out0, OUTPUT);
  pinMode(out1, OUTPUT);
  pinMode(out2, OUTPUT);
  pinMode(out3, OUTPUT);
  pinMode(out4, OUTPUT);
  
}
void loop() {
  if ((in1 == LOW) && (in2 == LOW) && (in3 == LOW) && (enabled == HIGH)){
    digitalWrite(out0, HIGH);
    digitalWrite(out1, LOW);
    digitalWrite(out2, LOW);
    digitalWrite(out3, LOW);
    digitalWrite(out4, LOW);
  } else if ((in1 == LOW) && (in2 == LOW) && (in3 == HIGH) && (enabled == HIGH)){
    digitalWrite(out0, LOW);
    digitalWrite(out1, HIGH);
    digitalWrite(out2, LOW);
    digitalWrite(out3, LOW);
    digitalWrite(out4, LOW);
  } else if ((in1 == LOW) && (in2 == HIGH) && (in3 == LOW) && (enabled == HIGH)){
    digitalWrite(out0, LOW);
    digitalWrite(out1, LOW);
    digitalWrite(out2, HIGH);
    digitalWrite(out3, LOW);
    digitalWrite(out4, LOW);
  } else if ((in1 == LOW) && (in2 == HIGH) && (in3 == HIGH) && (enabled == HIGH)) {
    digitalWrite(out0, LOW);
    digitalWrite(out1, LOW);
    digitalWrite(out2, LOW);
    digitalWrite(out3, HIGH);
    digitalWrite(out4, LOW);
  } else if ((in1 == HIGH) && (in2 == LOW) && (in3 == LOW) && (enabled == HIGH)){
    digitalWrite(out0, LOW);
    digitalWrite(out1, LOW);
    digitalWrite(out2, LOW);
    digitalWrite(out3, LOW);
    digitalWrite(out4, HIGH);
  } /*else if ((in1 == LOW) && (in2 == LOW) && (in3 == LOW) && (enabled == LOW)) {
    digitalWrite(out0, HIGH);
    digitalWrite(out1, HIGH);
    digitalWrite(out2, HIGH);
    digitalWrite(out3, HIGH);
    digitalWrite(out4, HIGH);
  } else if ((in1 == HIGH) && (in2 == HIGH) && (in3 == HIGH) && (enabled == HIGH)) {
    digitalWrite(out0, LOW);
    digitalWrite(out1, LOW);
    digitalWrite(out2, LOW);
    digitalWrite(out3, LOW);
    digitalWrite(out4, LOW);
  }*/
}
