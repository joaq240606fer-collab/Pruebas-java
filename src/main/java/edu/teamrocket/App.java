package edu.teamrocket;

/**
 * Hello world!
 *
 */

// En java siempre se debe crear una clase, esta clase se llama App, y dentro de esta clase se encuentra el método main, este método es el punto de entrada de la aplicación, es decir, es el método que se ejecuta cuando se ejecuta la aplicación, este método recibe un arreglo de cadenas como argumento, este arreglo de cadenas se llama args, y es utilizado para recibir argumentos desde la línea de comandos, en este caso no estamos utilizando ningún argumento, pero es necesario incluirlo para que el programa funcione correctamente.

// en java siepre se termina cada línea con un punto y coma, esto es para indicar el final de una instrucción, en este caso estamos utilizando el método println de la clase System para imprimir un mensaje en la consola, este método recibe una cadena como argumento, en este caso estamos imprimiendo "Hello World!", y al final de la instrucción se coloca un punto y coma para indicar el final de la instrucción.

/* llamamos al sistema de java y le decimos que necesitamos un tipo de salida que imprima y que al final deje una línea en blanco */



public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

// variables en java, una variable es un espacio en la memoria que se utiliza para almacenar un valor, cada variable tiene un tipo de dato, el tipo de dato indica el tipo de valor que se puede almacenar en la variable, por ejemplo, si queremos almacenar un número entero, podemos utilizar el tipo de dato int, si queremos almacenar un número decimal, podemos utilizar el tipo de dato float o double, si queremos almacenar una cadena de texto, podemos utilizar el tipo de dato String, y así sucesivamente.

        int edad = 25; // Declaramos una variable de tipo entero llamada edad y le asignamos el valor de 25

        System.out.println("mi edad es:" + edad); // Imprimimos en la consola el mensaje "mi edad es:" seguido del valor de la variable edad

        float altura = 1.70f; // Declaramos una variable de tipo flotante llamada altura y le asignamos el valor de 1.70 se le agrega la letra f al final del número para indicar que es un número flotante

        System.err.println("mi altura es:" + altura);

        double valorPi = 3.141592653589793; // Declaramos una variable de tipo double llamada valorPi y le asignamos el valor de 3.141592653589793

        System.out.println("el valor de pi es:" + valorPi);
        // la diferencia entre float y double es que el tipo float tiene una precisión de 7 dígitos decimales, mientras que el tipo double tiene una precisión de 15 dígitos decimales, por lo tanto, el tipo double es más preciso que el tipo float, pero también ocupa más memoria, por lo tanto, se recomienda utilizar el tipo double cuando se necesite una mayor precisión en los cálculos, y se recomienda utilizar el tipo float cuando se necesite una menor precisión y se quiera ahorrar memoria.

        long distanciaAlSol = 149600000000L; // Declaramos una variable de tipo long llamada distanciaAlSol y le asignamos el valor de 149600000000 se le agrega la letra L al final del número para indicar que es un número long

        System.out.println("la distancia al sol es:" + distanciaAlSol);
        // la diferencia entre int y long es que el tipo int tiene un rango de -2147483648 a 2147483647, mientras que el tipo long tiene un rango de -9223372036854775808 a 9223372036854775807, por lo tanto, el tipo long es más grande que el tipo int, pero también ocupa más memoria, por lo tanto, se recomienda utilizar el tipo long cuando se necesite almacenar un número entero muy grande, y se recomienda utilizar el tipo int cuando se necesite almacenar un número entero que no sea tan grande y se quiera ahorrar memoria.
    }
}
