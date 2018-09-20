import Triangulo.triang
import Figura.Figure

fun main (args: Array<String>) {
    val num = triang(5)

    println(num)
    num.altura = 10
    println(num)
    armar(num, 10)
}

fun armar(ar: Figure, steps: Int) {
    for (i in 0 until steps) {
        ar.mostrando()
    }
}


