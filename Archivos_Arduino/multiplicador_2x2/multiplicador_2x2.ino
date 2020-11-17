int a1 = 8, a0 = 9, b1 = 10, b0 = 11;
int m3 = 4, m2 = 3, m1 = 2, m0 = 1;
void setup() {
  pinMode(a1, INPUT);
  pinMode(a0, INPUT);
  pinMode(b1, INPUT);
  pinMode(b0, INPUT);
  pinMode(m3, OUTPUT);
  pinMode(m2, OUTPUT);
  pinMode(m1, OUTPUT);
  pinMode(m0, OUTPUT);
  
}
void loop() {
  if ((a1 == LOW) && (a0 == LOW) && (b1 == LOW) && (b0 == LOW)) {
    digitalWrite(m3, LOW);
    digitalWrite(m2, LOW);
    digitalWrite(m1, LOW);
    digitalWrite(m0, LOW);
  }
  if ((a1 == LOW) && (a0 == LOW) && (b1 == LOW) && (b0 == HIGH)) {
    digitalWrite(m3, LOW);
    digitalWrite(m2, LOW);
    digitalWrite(m1, LOW);
    digitalWrite(m0, LOW);
  }
  if ((a1 == LOW) && (a0 == LOW) && (b1 == HIGH) && (b0 == LOW)) {
    digitalWrite(m3, LOW);
    digitalWrite(m2, LOW);
    digitalWrite(m1, LOW);
    digitalWrite(m0, LOW);
  }
  if ((a1 == LOW) && (a0 == LOW) && (b1 == HIGH) && (b0 == HIGH)) {
    digitalWrite(m3, LOW);
    digitalWrite(m2, LOW);
    digitalWrite(m1, LOW);
    digitalWrite(m0, LOW);
  } 
  if ((a1 == LOW) && (a0 == HIGH) && (b1 == LOW) && (b0 == LOW)) {
    digitalWrite(m3, LOW);
    digitalWrite(m2, LOW);
    digitalWrite(m1, LOW);
    digitalWrite(m0, LOW);
  }
  if ((a1 == LOW) && (a0 == HIGH) && (b1 == LOW) && (b0 == HIGH)) {
    digitalWrite(m3, LOW);
    digitalWrite(m2, LOW);
    digitalWrite(m1, HIGH);
    digitalWrite(m0, LOW);
  }
  if ((a1 == LOW) && (a0 == HIGH) && (b1 == HIGH) && (b0 == LOW)) {
    digitalWrite(m3, LOW);
    digitalWrite(m2, HIGH);
    digitalWrite(m1, LOW);
    digitalWrite(m0, LOW);
  }
  if ((a1 == LOW) && (a0 == HIGH) && (b1 == HIGH) && (b0 == HIGH)) {
    digitalWrite(m3, LOW);
    digitalWrite(m2, HIGH);
    digitalWrite(m1, HIGH);
    digitalWrite(m0, LOW);
  }
  if ((a1 == HIGH) && (a0 == LOW) && (b1 == LOW) && (b0 == LOW)) {
    digitalWrite(m3, LOW);
    digitalWrite(m2, LOW);
    digitalWrite(m1, LOW);
    digitalWrite(m0, LOW);
  }
  if ((a1 == HIGH) && (a0 == LOW) && (b1 == LOW) && (b0 == HIGH)) {
    digitalWrite(m3, LOW);
    digitalWrite(m2, HIGH);
    digitalWrite(m1, LOW);
    digitalWrite(m0, LOW);
  }
  if ((a1 == HIGH) && (a0 == LOW) && (b1 == HIGH) && (b0 == LOW)) {
    digitalWrite(m3, HIGH);
    digitalWrite(m2, LOW);
    digitalWrite(m1, LOW);
    digitalWrite(m0, LOW);
  }
  if ((a1 == HIGH) && (a0 == LOW) && (b1 == HIGH) && (b0 == HIGH)) {
    digitalWrite(m3, HIGH);
    digitalWrite(m2, HIGH);
    digitalWrite(m1, LOW);
    digitalWrite(m0, LOW);
  }
  if ((a1 == HIGH) && (a0 == HIGH) && (b1 == LOW) && (b0 == LOW)) {
    digitalWrite(m3, LOW);
    digitalWrite(m2, LOW);
    digitalWrite(m1, LOW);
    digitalWrite(m0, LOW);
  }
if ((a1 == HIGH) && (a0 == HIGH) && (b1 == LOW) && (b0 == HIGH)) {
    digitalWrite(m3, LOW);
    digitalWrite(m2, HIGH);
    digitalWrite(m1, HIGH);
    digitalWrite(m0, LOW);
  }
  if ((a1 == HIGH) && (a0 == HIGH) && (b1 == HIGH) && (b0 == LOW)) {
    digitalWrite(m3, HIGH);
    digitalWrite(m2, HIGH);
    digitalWrite(m1, LOW);
    digitalWrite(m0, LOW);
  }
  if ((a1 == HIGH) && (a0 == HIGH) && (b1 == HIGH) && (b0 == HIGH)) {
    digitalWrite(m3, HIGH);
    digitalWrite(m2, LOW);
    digitalWrite(m1, LOW);
    digitalWrite(m0, HIGH);
  }
}
