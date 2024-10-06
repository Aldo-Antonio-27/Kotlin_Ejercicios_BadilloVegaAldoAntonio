/* Calculadora básica: Implementa una calculadora simple que sume, reste, multiplique o divida según la entrada del usuario. */

fun main(){
    //Creación y asignación de las variables, las variables se le solicitan al usuario en consola.
    println("Ingrese el primer valor: ");
    var numero1= readln().toDouble();

    println("Ingrese el segundo valor: ");
    var numero2= readln().toDouble();

    //Guía visual para que el usuario seleccione el tipo de operación que desea realizar.
    println("");
    println("Seleccione el numero del tipo de operación que desee realizar: ");
    println("* 1 = Suma.");
    println("* 2 = Resta.");
    println("* 3 = Multiplicación.");
    println("* 4 = División.");
    var operacion= readln().toInt();

    var resultado : Double = 0.0;

    //Condicional que determina las operaciones necesarias para obtener el resultado, impresión del texto guía para el usuario y la concatenación del resultado.
    when (operacion) {
        1 ->  resultado= numero1 + numero2;
        2 ->  resultado= numero1 - numero2;
        3 ->  resultado= numero1 * numero2;
        4 ->  resultado= numero1 / numero2;
        else -> println("El numero ingresado no corresponde a ningun tipo de operación.");
    }

    println("");
    println("El resultado de la operación es igual a: " + resultado);
}