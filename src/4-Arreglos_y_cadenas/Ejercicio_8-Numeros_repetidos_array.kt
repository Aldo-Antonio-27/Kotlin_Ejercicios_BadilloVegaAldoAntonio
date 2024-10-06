/* Números repetidos en un array: Dado un array, encuentra y muestra los números repetidos. */

fun main(){
    //Creación y asignación de variables, las variables se le solicitan al usuario en consola.
    println("Ingrese el primer número: ");
    var numero1= readln().toInt();

    println("Ingrese el segundo número: ");
    var numero2= readln().toInt();

    println("Ingrese el tercer número: ");
    var numero3= readln().toInt();

    //Se toman las variables y se agregan a un array.
    var listaNumeros= arrayOf(numero1, numero2, numero3);

    /*Se toma la variable y se agrega a una lista, con la función "groupingBy" se ordenan por grupos dependiendo de
    su valor, con “eachCount” y con “filter” se cuenta los elementos que se repiten más de una vez en la lista.*/
    val verificarNumeros= listaNumeros.groupingBy { it }.eachCount().filter { it.value > 1 };

    /*Condicional que verifica que se haya repetido un elemento mas de una vez, si un elemento se repitió se imprime un texto
    guía con el valor que se repitió más cuantas veces lo hizo, en caso contrario imprime que ningún elemento se repitió.*/
    if (verificarNumeros.isNotEmpty()){
        verificarNumeros.forEach{(key, value) ->
            println("");
            println("Los números repetidos son, el numero $key se repite $value veces.");
        }
    } else{
        println("");
        println("Ningun de los números se repite.");
    }
}