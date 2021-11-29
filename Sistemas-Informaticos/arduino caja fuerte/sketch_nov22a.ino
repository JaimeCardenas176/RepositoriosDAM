//Declaración de variables antes del setup:
 
int led=13;      //El led está conectado al pin digital 13.
int potenciometro=2;    //El potenciómetro está conectado al pin ANALÓGICO 2.
 
int leer=0;      //Variable en la que se almacenará el valor leído en el potenciómetro.
                 //se trata de un valor analógico (de 0 a 1023).
                 
int convert=0;      //Variable que contendrá el valor leído, convertido con función map() [rango de 0 a 9]
int convert_anterior=0;   //Variable que almacena el número correspondiente a la anterior conversión.
 
int secreto0;  //Número secreto en la posición 0
int secreto1;  //Número secreto en la posición 1
int secreto2;  //etc...
int secreto3;  
int secreto4;
 
int secreto_leer=0; //Variable para guardar cada uno de los 5 números secretos que introducimos por TECLADO.
 
int secreto[]={secreto0, secreto1, secreto2, secreto3, secreto4};  //Vector que contiene el número secreto
                                                                   //que se compone de 5 cifras.
 
 
void setup()
 
{
   pinMode(led,OUTPUT);            //El led es una salida.
   pinMode(potenciometro,INPUT);   //El potenciómetro es una entrada.
   
   Serial.begin(9600);     //Se inicializa el puerto serial.
   
    //Pedimos que se introduzca el número secreto (5 cifras):
     Serial.println("Por favor, introduce tu numero secreto (5 cifras).");
     
    for (int a=0; a < 5; a++)
    {
      secreto_leer= Serial.read();
        while(secreto_leer < 0)
        {
        secreto_leer= Serial.read();
        }
      
        secreto[a]=secreto_leer-48;    //El dato que introducimos por teclado está codificado en ASCII. 0=48, 1=49, 2=50... Restamos 48 para obtener el número en entero.
      
        Serial.print(secreto[a]);
      }      
      //Ocultar número secreto:
      Serial.println();  //Salto de línea con texto vacío.
      for (int a=0; a < 40; a++)
      {
   Serial.println("...");
      }
      Serial.println("Gira la ruleta de la caja fuerte para adivinar el numero secreto");    
}
 
void loop()
{
  for (int b=0;b < 5;b++)
  {    
    Serial.print("Adivina el numero secreto de la posicion ");
    Serial.print(b+1);
    Serial.println();
 
     leer=analogRead(potenciometro);
     convert=map(leer, 0 , 1023 , 0 , 9);
 
     while(convert!=secreto[b])
     
     {
      leer=analogRead(potenciometro);
 
     //Función matemática map()  --> map(value, fromLow, fromHigh, toLow, toHigh)
 
     convert=map(leer, 0 , 1023 , 0 , 9);    //Se cambia el rango. Ahora el máximo es 9.
 
      if(convert!=convert_anterior && convert!=secreto[b])
        {
        Serial.print(convert);
        Serial.println(" no es el numero correcto");
        delay(1000);
        }
        else
        {
          //no hacer nada
        }
         convert_anterior=convert;
       }
   
     //Cuando sale del bucle anterior es porque hemos adivinado un número.
   
     digitalWrite(led,HIGH);  //Para celebrarlo, encenderemos el led.
     Serial.println();
     Serial.print("Bien hecho! Has adivinado el numero de la posicion ");
     Serial.print(b+1);
     Serial.print(", que era el numero ");
     Serial.print(convert);
     Serial.println();
   
     delay(3000);  //Lo mantenemos encendido durante 3 segundos.
     digitalWrite(led,LOW);
  }
 
  //Cuando salimos del último bucle es porque hemos acertado los 5 números secretos.
 
  Serial.println("____________________________________________");
  Serial.println("Enhorabuena, has adivinado el numero secreto!");
  Serial.println("____________________________________________");
  Serial.println("Puedes volver a empezar pulsando el botón de RESET");
 
  //Para celebrarlo, ahora que somos ricos, haremos parpadear el LED infinitamente.
 
  for(int contador = 0 ; contador >= 0 ; contador=contador+1)
  {
  digitalWrite(led,HIGH);
  delay(600);
  digitalWrite(led,LOW);
  delay(600);
  }
}
