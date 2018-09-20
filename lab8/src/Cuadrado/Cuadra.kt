package Cuadrado
import Figura.Figure

open class Cuadra: Figure {
    //variable altura
    var altura: Int
        set(value){
            field = value
            vava = altura >= 0
        }
    //definir variable booleana
    var vava : Boolean
        private set
    //step
    override var steps = 0

    constructor(_altura: Int = 0) {
        altura = _altura
        vava = altura >= 0
    }
    //mostrar
    override fun mostrando() {
        steps += 2
        println("*")
    }
    //mostrando cuantas de altura pidio
    override fun toString(): String {
        return """
            altura: ${altura}
        """.trimIndent()
    }
}