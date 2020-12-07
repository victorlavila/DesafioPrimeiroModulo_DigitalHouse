package DesafioPrimeiroModulo

fun main() {

    var digitalHouseManager = DigitalHouseManager()

    digitalHouseManager.registrarProfessorTitular("João", "Silva", 1, "Android")
    digitalHouseManager.registrarProfessorTitular("José", "Souza", 2, "Fullstack")

    digitalHouseManager.registrarProfessorAdjunto("Andre", "Santos", 3, 20)
    digitalHouseManager.registrarProfessorAdjunto("Fernando", "Ferraz", 4, 25)

    digitalHouseManager.registrarCurso("Fullstack", 20001, 3)
    digitalHouseManager.registrarCurso("Android", 20002, 2)

    digitalHouseManager.alocarProfessores(20001, 2, 4)

    digitalHouseManager.registrarAluno("Calopsita", "Voadora", 10)
    digitalHouseManager.registrarAluno("Zeca", "Urubu", 11)
    digitalHouseManager.registrarAluno("Zé", "Pequeno", 12)
    digitalHouseManager.registrarAluno("Will", "Smith", 13)
    digitalHouseManager.registrarAluno("Aline", "Santos", 14)

    digitalHouseManager.matricularAluno(10, 20001)
    digitalHouseManager.matricularAluno(11, 20001)
    digitalHouseManager.matricularAluno(12, 20002)
    digitalHouseManager.matricularAluno(13, 20002)
    digitalHouseManager.matricularAluno(13, 20002)
}