package DesafioPrimeiroModulo

data class Curso (val nome: String,
                  val codigoDoCurso: Int,
                  val qtdMaximaDeAlunos: Int) {

    var professorTitular = ProfessorTitular("", "", "", 0, 0)
    var professorAdjunto = ProfessorAdjunto(0, "", "", 0, 0)

    private var aluno = mutableListOf<Aluno>()

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as Curso
        if (codigoDoCurso != other.codigoDoCurso) return false
        return true
    }

    fun adicionarUmAluno(umAluno: Aluno): Boolean{
        if(aluno.size < qtdMaximaDeAlunos) aluno.add(umAluno)
        return true
    }

    fun excluirAluno(umAluno: Aluno){
        aluno.remove(umAluno)
        println("Aluno excluído com sucesso!")
    }
}