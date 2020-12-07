package DesafioPrimeiroModulo

data class Matricula (var aluno: Aluno, var curso: Curso, var dataDeMatricula: String){

    fun matricula(){
        println("O aluno ${aluno.nome} foi matriculado no curso: ${curso.nome} na data de $dataDeMatricula")
    }

}