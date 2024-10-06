/* Conteo de dígitos: Pide un número entero y cuenta cuántos dígitos tiene. */

fun main(){
    //Creación y asignación de la variable, la variable se le solicita al usuario en consola.
    println("Ingrese el número del cual desea obtener el número de digitos: ");
    var numero= readln().toInt();

    //Se toma la variable principal y se transforma a string, se dividen en elementos individuales en una lista y los valores se transformar a números.
    var listaNumero= numero.toString().map{it.toString().toInt()}

    //Impresión del resultado en consola, texto guía para el usuario y la concatenación de la lista con la función "size" para obtener su número de elemento.
    println("");
    println("La cantidad de digitos del número es: " + listaNumero.size)
}