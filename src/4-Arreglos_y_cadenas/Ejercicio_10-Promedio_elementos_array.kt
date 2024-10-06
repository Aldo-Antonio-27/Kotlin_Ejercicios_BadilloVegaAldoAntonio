/* Promedio de elementos de un array: Crea un array de números enteros y muestra el promedio de sus elementos. */

fun main(){
    //Creación y asignación de variables, las variables se le solicitan al usuario en consola.
    println("Ingrese el primer número: ");
    var numero1= readln().toDouble();

    println("Ingrese el segundo número: ");
    var numero2= readln().toDouble();

    println("Ingrese el tercer número: ");
    var numero3= readln().toDouble();

    //Se toman las variables y se agregan a un array.
    var listaNumeros= arrayOf(numero1, numero2, numero3);

    /*Impresión del resultado en consola, texto guía para el usuario y la concatenación
    de la lista con la función "average" para obtener el promedio de sus elementos.*/
    println("");
    println("El promedio de los números ingresado es: " + listaNumeros.average());
}