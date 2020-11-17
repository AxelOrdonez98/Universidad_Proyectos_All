int entrada = 8, entrada1 = 9, entrada2 = 10, enable = 11, led1 = 7, led2 = 6, led3 = 5, led4 = 4, led5 = 3;
void setup() {
  pinMode(entrada, INPUT);
  pinMode(led1, OUTPUT);
  pinMode(led2, OUTPUT);
  pinMode(led3, OUTPUT);
  pinMode(led4, OUTPUT);
  pinMode(led5, OUTPUT);
  pinMode(enable, INPUT);
  pinMode(entrada1, INPUT);
  pinMode(entrada2,INPUT);
}
void loop() {
  int op=digitalRead(entrada);
  int op1=digitalRead(entrada1);
  int op2=digitalRead(entrada2);
  int ena=digitalRead(enable);
  if (ena == HIGH){
    if (op == LOW && op1 == LOW && op2 == LOW){
      digitalWrite(led1, HIGH);
      digitalWrite(led2, LOW);
      digitalWrite(led3, LOW);
      digitalWrite(led4, LOW);
      digitalWrite(led5, LOW);
      }
     if (op == LOW && op1 == LOW&& op2 == HIGH){
      digitalWrite(led1, LOW);
      digitalWrite(led2, HIGH);
      digitalWrite(led3, LOW);
      digitalWrite(led4, LOW);
      digitalWrite(led5, LOW);
      }
    if(op == LOW && op1 == HIGH && op2 == LOW){
      digitalWrite(led1, LOW);
      digitalWrite(led2, LOW);
      digitalWrite(led3, HIGH);
      digitalWrite(led4, LOW);
      digitalWrite(led5, LOW);
      }
     if (op == LOW && op1 == HIGH && op2 == HIGH){
      digitalWrite(led1, LOW);
      digitalWrite(led2, LOW);
      digitalWrite(led3, LOW);
      digitalWrite(led4, HIGH);
      digitalWrite(led5, LOW);
      }
     if (op == HIGH && op1 == LOW && op2 == LOW){
      digitalWrite(led1, LOW);
      digitalWrite(led2, LOW);
      digitalWrite(led3, LOW);
      digitalWrite(led4, LOW);
      digitalWrite(led5, HIGH);
      }
  }
  if (ena == LOW){
    digitalWrite(led1, LOW);
    digitalWrite(led2, LOW);
    digitalWrite(led3, LOW);
    digitalWrite(led4, LOW);
    digitalWrite(led5, LOW);
    }
}
