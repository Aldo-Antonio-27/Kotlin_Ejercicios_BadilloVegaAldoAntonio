/* Edad para votar: Pregunta la edad del usuario y muestra si puede votar o no (mayor de 18 años). */

fun main(){
    //Creación y asignación de la variable, la variable se le solicita al usuario en consola.
    println("Ingrese su edad: ");
    var edad= readln().toInt();

    //Condicional que determina el valor mínimo de la edad y el resultado a imprimir en consola, texto guía para el usuario y la concatenación del resultado.
    if (edad >= 18){
        println("");
        println("Puede votar, su edad es igual a: " + edad);

    } else{
        println("");
        println("No puede votar, su edad es igual a: " + edad);
    }
}