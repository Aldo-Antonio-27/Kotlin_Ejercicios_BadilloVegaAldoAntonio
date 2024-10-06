/* Intercambiar dos variables: Solicita dos variables e intercambia sus valores. */

fun main(){
    //Creación y asignación de variables, algunas de las variables se le solicitan al usuario en consola.
    println("Ingrese el primer valor: ");
    var numero1= readln().toDouble();

    println("Ingrese el segundo valor: ");
    var numero2= readln().toDouble();

    var intercambio : Double;

    //Resolución del problema, se crea una tercera variable y se intercambiar para llegar al resultado.
    intercambio= numero1;
    numero1= numero2;
    numero2= intercambio;

    //Impresión de los resultados en consola, texto guía para el usuario y la concatenación del los resultados.
    println("");
    println("El primer valor intercambiado es: " + numero1);
    println("El segundo valor intercambiado es: " + numero2);
}