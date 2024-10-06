/* Doble y mitad: Pide un número y muestra su doble y su mitad. */

fun main(){
    //Creación y asignación de la variable, la variable se le solicita al usuario en consola.
    println("Ingrese un numero: ");
    var numero= readln().toDouble();

    //Operaciones realizadas para obtener el resultado.
    var numeroDoble : Double=(numero * 2);
    var numeroMitad : Double=(numero / 2);

    //Impresión de los resultados en consola, texto guía para el usuario y la concatenación del los resultados.
    println("");
    println("El doble del número ingresado es: " + numeroDoble);
    println("La mitad del número ingresado es: " + numeroMitad);
}