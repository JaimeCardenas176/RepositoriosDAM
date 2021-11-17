// Práctica encender y apagar un LED a través de botón pulsador
const int LED=13;
const int BOTON1=2;
const int BOTON2=4;
int val;
int val2;
void setup(){
pinMode(LED,OUTPUT);
pinMode(BOTON1,INPUT);
pinMode(BOTON2,INPUT);
}
void loop(){
val=digitalRead(BOTON1);
if  (val==HIGH){
digitalWrite(LED,HIGH);
}else { digitalWrite(LED,LOW);
}
val2=digitalRead(BOTON2);
if (val2==HIGH){
  digitalWrite(LED,HIGH);
  delay(150);
  digitalWrite(LED,LOW);
  delay(150);
  }else {
  digitalWrite(LED,LOW);
}
}
