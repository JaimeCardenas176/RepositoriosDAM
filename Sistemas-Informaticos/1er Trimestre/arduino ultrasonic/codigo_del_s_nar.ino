const int EchoPin = 5;
const int TriggerPin = 6;
int led = 4;
int motor = 12;

void setup() {
   Serial.begin(9600);
   pinMode(TriggerPin, OUTPUT);
   pinMode(EchoPin, INPUT);
   pinMode(led, OUTPUT);
   pinMode (motor, OUTPUT);
}

void loop() {
   int cm = ping(TriggerPin, EchoPin);
   Serial.print("Distancia: ");
   Serial.println(cm);
   delay(250);
}

int ping(int TriggerPin, int EchoPin) {
   long duration, distanceCm;
   
   digitalWrite(TriggerPin, LOW);  //para generar un pulso limpio ponemos a LOW 4us
   delayMicroseconds(4);
   digitalWrite(TriggerPin, HIGH);  //generamos Trigger (disparo) de 10us
   delayMicroseconds(10);
   digitalWrite(TriggerPin, LOW);
   
   duration = pulseIn(EchoPin, HIGH);  //medimos el tiempo entre pulsos, en microsegundos
   
   distanceCm = duration * 10 / 292/ 2;   //convertimos a distancia, en cm
if (distanceCm < 200){
  digitalWrite(led, HIGH);
  if (distanceCm < 100){
    digitalWrite(motor,HIGH); 
  } else {
    digitalWrite(led,HIGH);
  }
}
else {
  digitalWrite(led, LOW);
}

   return distanceCm;
}
