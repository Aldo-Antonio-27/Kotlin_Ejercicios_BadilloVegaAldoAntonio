/* Invertir número: Dado un número entero, invierte el orden de sus dígitos. */

fun main(){
    //Creación y asignación de la variable, la variable se le solicita al usuario en consola.
    println("Ingrese el número del cual desea obtener el número invertido: ");
    var numero= readln().toInt();

    //Se toma la variable principal y se transforma a string, se dividen en elementos individuales en una lista y los valores se transformar a números.
    var listaNumero= numero.toString().map{it.toString().toInt()}

    //Impresión del resultado en consola, texto guía para el usuario y la concatenación de la lista con la función "reversed" para que la lista se invierta.
    println("");
    println("El número invertido es: " + listaNumero.reversed().joinToString(""));
}