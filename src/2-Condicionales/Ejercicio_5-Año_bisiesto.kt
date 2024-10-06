/* Año bisiesto: Escribe un programa que determine si un año es bisiesto. */

fun main(){
    //Creación y asignación de la variable, la variable se le solicita al usuario en consola.
    println("Ingrese el año a verificar: ");
    var año= readln().toInt();

    //Condicional que dependiendo del resultado de divisiones imprime el resultado en consola, texto guía para el usuario y la concatenación del resultado.
    if ((año % 4) == 0){
        if((año % 100) == 0){
            if((año % 400) == 0){
                println("");
                println("El año es bisiesto, el año es: " + año);

            } else{
                println("");
                println("El año no es bisiesto, el año es: " + año);
            }
        } else{
            println("");
            println("El año es bisiesto, el año es: " + año);
        }
    } else{
        println("");
        println("El año no es bisiesto, el año es: " + año);
    }
}