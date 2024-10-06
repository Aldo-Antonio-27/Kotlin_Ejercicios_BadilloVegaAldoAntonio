/* Sumar elementos de un array: Crea un array de 5 números enteros y muestra la suma de sus elementos. */

fun main(){
    //Creación y asignación de variables, las variables se le solicitan al usuario en consola.
    println("Ingrese el primer número a sumar: ");
    var numero1= readln().toInt();

    println("Ingrese el segundo número a sumar: ");
    var numero2= readln().toInt();

    println("Ingrese el tercer número a sumar: ");
    var numero3= readln().toInt();

    println("Ingrese el cuarto número a sumar: ");
    var numero4= readln().toInt();

    println("Ingrese el quinto número a sumar: ");
    var numero5= readln().toInt();

    //Se toman las variables y se agregan a un array.
    var listaNumeros= arrayOf(numero1, numero2, numero3, numero4, numero5);

    //Impresión del resultado en consola, texto guía para el usuario y la concatenación del array con la función "sum" para que se sumen sus elementos.
    println("");
    println("La suma de los números ingresados es: " + listaNumeros.sum())
}