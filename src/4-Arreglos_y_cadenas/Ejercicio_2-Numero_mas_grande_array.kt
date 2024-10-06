/* Encontrar el número más grande en un array: Dado un array de números, encuentra el mayor. */

fun main(){
    //Creación y asignación de variables, las variables se le solicitan al usuario en consola.
    println("Ingrese el primer número de la lista: ");
    var numero1= readln().toInt();

    println("Ingrese el segundo número de la lista: ");
    var numero2= readln().toInt();

    println("Ingrese el tercer número de la lista: ");
    var numero3= readln().toInt();

    //Se toman las variables y se agregan a un array.
    var listaNumeros= arrayOf(numero1, numero2, numero3);

    /*Impresión del resultado en consola, texto guía para el usuario y la concatenación del array
    con la función "sorted" y "last" para ordenar e imprimir el ultimo elemento de la lista.*/
    println("");
    println("El número mas grande de la lista es: " + listaNumeros.sorted().last())
}