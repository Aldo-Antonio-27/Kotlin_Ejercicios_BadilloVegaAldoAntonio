/* Número par o impar: Lee un número y determina si es par o impar. */

fun main(){
    //Creación y asignación de la variable, la variable se le solicita al usuario en consola.
    println("Ingrese el numero que desea determinar si es par o impar: ");
    var numero= readln().toInt();

    //Operaciones realizadas para obtener el resultado, se obtiene el residuo de la división, si no hay residuo es par.
    var parImpar : Int;
    parImpar = (numero % 2)

    //Condicional que determina el resultado a imprimir en consola, texto guía para el usuario y la concatenación del resultado.
    if (parImpar == 0){
        println("");
        println("El número ingresado es par, su valor es: " + numero);

    } else{
        println("");
        println("El número ingresado es impar, su valor es: " + numero);
    }
}