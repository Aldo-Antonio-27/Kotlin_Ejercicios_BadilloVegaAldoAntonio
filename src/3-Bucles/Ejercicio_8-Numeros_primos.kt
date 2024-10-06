/* Números primos: Pide un número e indica si es primo o no. */

fun main(){
    //Creación y asignación de variables, algunas de las variables se le solicitan al usuario en consola.
    println("Ingrese el número del cual desea saber si es un número primo: ");
    var numero= readln().toInt();
    var contador : Int = 0;

    //Bucle for que se ejecuta tantas veces como el número ingresado.
    for(i in 1..numero){
        //En cada ciclo se divide el número actual del ciclo con el número ingresado y si el resultado de la división es cero se suma uno a una variable.
        if ((numero % i) == 0){
            contador+=1
        }
    }

    //Condicional que imprime el resultado en consola, si el número ingresado solo se logró dividir por dos números el número es primo de lo contrario no.
    if (contador == 2){
        //Texto guía para el usuario y la concatenación del número ingresado.
        println("");
        println("El número ingresado es primo, el valor del número es: " + numero);
    } else{
        //Texto guía para el usuario y la concatenación del número ingresado.
        println("");
        println("El número ingresado no es primo, el valor del número es: " + numero);
    }
}