package DesafioPrimeiroModulo

class DigitalHouseManager {

    var alunos = mutableListOf<Aluno>()
    var professores = mutableListOf<Professor>()
    var cursos = mutableListOf<Curso>(  )
    var matriculas = mutableListOf<Matricula>()

    fun registrarCurso(nome: String, codigoCurso: Int,quantidadeMaximaDeAlunos: Int ){
        val curso = Curso(nome,codigoCurso,quantidadeMaximaDeAlunos)
        cursos.add(curso)
        println("Curso ${curso.nome} registrado com sucesso")
    }

    fun excluirCurso(codigoCurso: Int){
        for(curso in cursos){
            if(codigoCurso == curso.codigoDoCurso){
                cursos.remove(curso)
                println("Curso ${curso.nome} excluído com sucesso")
            }
        }
    }

    fun registrarProfessorAdjunto(nome: String ,
                                  sobrenome: String ,
                                  codigoProfessor: Int,
                                  quantidadeDeHoras: Int){
        val professorAdjunto = ProfessorAdjunto(quantidadeDeHoras, nome, sobrenome, 0,codigoProfessor)
        professores.add(professorAdjunto)
        println("Professor ${professorAdjunto.nome} registrado com sucesso")
    }

    fun registrarProfessorTitular(nome: String ,
                                  sobrenome: String,
                                  codigoProfessor: Int,
                                  especialidade: String){
        val professorTitular = ProfessorTitular(especialidade, nome, sobrenome, 0, codigoProfessor)
        professores.add(professorTitular)
        println("Professor ${professorTitular.nome} registrado com sucesso")
    }

    fun excluirProfessor(codigoProfessor: Int){
        for(professor in professores){
            if(codigoProfessor == professor.codigoDeProfessor){
                professores.remove(professor)
                println("Professor ${professor.nome} excluído com sucesso")
            }
        }
    }

    fun registrarAluno(nome: String, sobrenome: String, codigoAluno:Int){
        val aluno = Aluno(nome, sobrenome, codigoAluno)
        alunos.add(aluno)
        println("Aluno ${aluno.nome} incluído com sucesso")
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int){
        var encontraAluno : Aluno?= null
        var encontraCurso : Curso?= null
        for(aluno in alunos){
            if(codigoAluno == aluno.codigoAluno){
                encontraAluno = aluno
            }
        }
        for(curso in cursos){
            if(codigoCurso == curso.codigoDoCurso){
                encontraCurso = curso
            }
        }
        if(encontraAluno != null && encontraCurso != null){
            var vagasDisponiveis = encontraCurso.adicionarUmAluno(encontraAluno)
            if(vagasDisponiveis){
                var matricula = Matricula(encontraAluno, encontraCurso, "20221")
                matriculas.add(matricula)
                println("Matricula do aluno ${encontraAluno.nome} efetuada com sucesso no curso de ${encontraCurso.nome}")
            } else{
                println("Não foi possível fazer a matrícula. Vagas indisponíveis no momento")
            }
        }
    }

    fun alocarProfessores(codigoCurso: Int,codigoProfessorTitular: Int, codigoProfessorAdjunto:Int){
        var encontraProfTitular : ProfessorTitular?= null
        var encontraProfAdjunto : ProfessorAdjunto?= null
        var encontraCurso : Curso?= null
        for(curso in cursos){
            if(codigoCurso == curso.codigoDoCurso){
                encontraCurso = curso
            }
        }
        for(professor in professores){
            if(codigoProfessorTitular == professor.codigoDeProfessor && professor is ProfessorTitular){
                encontraProfTitular = professor
            }
            if(codigoProfessorAdjunto == professor.codigoDeProfessor && professor is ProfessorAdjunto){
                encontraProfAdjunto = professor
            }
        }
        if(encontraCurso != null){
            if(encontraProfAdjunto != null){
                encontraCurso.professorAdjunto = encontraProfAdjunto
                println("Professor Adjunto ${encontraCurso.professorAdjunto.nome} está alocado no curso ${encontraCurso.nome}")
            }
            if(encontraProfTitular != null){
                encontraCurso.professorTitular = encontraProfTitular
                println("Professor Titular ${encontraCurso.professorTitular.nome} está alocado no curso ${encontraCurso.nome}")
            }
        }
    }

}