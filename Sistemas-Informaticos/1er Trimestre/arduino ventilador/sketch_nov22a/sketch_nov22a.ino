const int MOTOR=5;
const int BOTON=2;
const int LED=8;
int val;
void setup(){
pinMode(MOTOR,OUTPUT);
pinMode(BOTON,INPUT);
pinMode(LED, OUTPUT);
}
void loop(){
val=digitalRead(BOTON);
if  (val==HIGH){
digitalWrite(MOTOR,HIGH);
digitalWrite(LED,HIGH);
}
else { digitalWrite(MOTOR,LOW);
digitalWrite(LED,LOW);
}
}
