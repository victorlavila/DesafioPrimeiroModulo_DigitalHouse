package DesafioPrimeiroModulo

abstract class Professor (val nome: String, val sobrenome: String, var tempoDeCasa: Int, val codigoDeProfessor: Int) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as Professor
        if (codigoDeProfessor != other.codigoDeProfessor) return false
        return true
    }
}