package Rectangulo
import Figura.Figure
open class recta: Figure {
    //variable altura
    var altura: Int
        set(value){
            field = value
            vava = altura >= 0
        }
    // variable ancho
    var ancho: Int
        set(value){
            field = value
            vovo = ancho >=0
        }
    //definir variable booleana
    var vava : Boolean
        private set
    var vovo : Boolean
        private set
    //step
    override var steps = 0

    constructor(_altura: Int = 0, _ancho: Int = 0) {
        altura = _altura
        ancho = _ancho
        vava = altura >= 0
        vovo = ancho >= 0
    }
    //mostrar
    override fun mostrando() {
        steps += 2
        println("*")
    }
    override fun toString(): String {
        return """
            altura: ${altura}
            ancho: ${ancho}
        """.trimIndent()
    }
}