void setup() { // Esta en una línea comentada.
   // Establece un pin digital como salida.
   // El Pin 12 tiene un LED conectado a el.
   pinMode(12, OUTPUT);
   pinMode (11, OUTPUT);
   
}

void loop() {
   digitalWrite(12, HIGH);   // enciende el LED
   delay(250);              // espera un segundo

   
   
   digitalWrite(12, LOW);    // apaga el LED
   delay(250);              // espera un segundo

 
   digitalWrite(11, HIGH);   // enciende el LED
   delay(500);              // espera un segundo

   
   
   digitalWrite(11, LOW);    // apaga el LED
   delay(250);              // espera un segundo


   

}
