/* Positivo, negativo o cero: Dado un número, indica si es positivo, negativo o cero. */

fun main(){
    //Creación y asignación de la variable, la variable se le solicita al usuario en consola.
    println("Ingrese un numero: ");
    var numero= readln().toDouble();

    //Condicional que determina el valor del numero y el resultado a imprimir en consola, texto guía para el usuario y la concatenación del resultado.
    if (numero > 0){
        println("");
        println("El número ingresado es positivo, su valor es: " + numero);

    } else if (numero < 0){
        println("");
        println("El número ingresado es negativo, su valor es: " + numero);

    } else{
        println("");
        println("El número ingresado es cero.");
    }
}