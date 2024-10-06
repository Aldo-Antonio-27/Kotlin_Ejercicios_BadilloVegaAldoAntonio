/* Sumar dígitos de un número: Lee un número entero y calcula la suma de sus dígitos. */

fun main(){
    //Creación y asignación de la variable, la variable se le solicita al usuario en consola.
    println("Ingrese el número del cual desea obtener la suma de sus digitos: ");
    var numero= readln().toInt();

    //Se toma la variable principal y se transforma a string, se dividen en elementos individuales en una lista y los valores se transformar a números.
    var listaNumero= numero.toString().map{it.toString().toInt()}

    //Impresión del resultado en consola, texto guía para el usuario y la concatenación de la lista con la función "sum" para que se sumen sus elementos.
    println("");
    println("La suma de los digitos es: " + listaNumero.sum())
}