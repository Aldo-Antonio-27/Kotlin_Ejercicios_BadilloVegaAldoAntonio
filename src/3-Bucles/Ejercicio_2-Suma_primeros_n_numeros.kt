/* Suma de los primeros n números: Dado un número n, calcula la suma de los primeros n números naturales. */

fun main(){
    //Creación y asignación de variables, algunas de las variables se le solicitan al usuario en consola.
    println("Ingrese el numero hasta el que desea sumar los números: ");
    var numero= readln().toInt();
    var suma : Int = 0;

    //Bucle for que se ejecuta tantas veces como el número ingresado, en cada ciclo se va suman el número actual del ciclo y va disminuyendo.
    while (numero > 0){
        suma+= numero;
        numero--
    }

    //Impresión del resultado en consola, texto guía para el usuario y la concatenación del resultado final de las sumas.
    println("");
    println("La suma de los números naturales hasta el número ingresado es: " + suma);
}