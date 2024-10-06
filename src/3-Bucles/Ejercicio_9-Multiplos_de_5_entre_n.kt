/* Múltiplos de 5 entre 1 y n: Muestra todos los múltiplos de 5 entre 1 y un número dado n. */

fun main(){
    //Creación y asignación de variables, algunas de las variables se le solicitan al usuario en consola.
    println("Ingrese el número hasta cual desea saber sus multiplos de 5: ");
    var numero= readln().toInt();
    var listaMultiplos= mutableListOf<Int>()

    //Bucle for que se ejecuta tantas veces como el número ingresado.
    for(i in 1..numero){
        //En cada ciclo se divide el número actual del ciclo entre cinco y si el resultado de la división es cero es múltiplo y el número se suma a una lista.
        if ((i % 5) == 0){
            listaMultiplos.add(i);
        }
    }

    //Impresión del resultado en consola, texto guía para el usuario y la concatenación de la lista de los números múltiplos de cinco.
    println("");
    println("Hasta el número ingresado sus multiplos de 5 son: " + listaMultiplos.joinToString(", "));
}