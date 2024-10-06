/* Mayor de dos números: Solicita dos números y muestra el mayor de ellos. */

fun main(){
    //Creación y asignación de las variables, las variables se le solicitan al usuario en consola.
    println("Ingrese el primer valor: ");
    var numero1= readln().toDouble();

    println("Ingrese el segundo valor: ");
    var numero2= readln().toDouble();

    //Condicional que determina el numero mayor y el resultado a imprimir en consola, texto guía para el usuario y la concatenación del resultado.
    if (numero1 > numero2){
        println("");
        println("El número mayor es el número 1, su valor es: " + numero1);

    } else if (numero1 < numero2){
        println("");
        println("El número mayor es el número 2, su valor es: " + numero2);

    } else{
        println("");
        println("Ambos números ingresados son iguales, sus valores son: " + numero1);
    }
}