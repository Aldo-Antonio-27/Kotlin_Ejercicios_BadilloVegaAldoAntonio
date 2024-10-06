/* Descuento en tienda: Pide el precio de un producto y aplica un descuento del 20% si supera los 1000. */

fun main(){
    //Creación y asignación de variables, algunas de las variables se le solicitan al usuario en consola.
    println("Ingrese el precio del producto: ");
    var precio= readln().toDouble();
    var precioTotal : Double;

    //Condicional que dependiendo de la variable obtiene el resultado al aplicarle operaciones, texto guía para el usuario y la concatenación del resultado.
    if (precio >= 1000){
        precioTotal= precio - (precio * 0.20);

    } else{
        precioTotal= precio;
    }

    println("");
    println("El precio total de su compra es $" + precioTotal);
}