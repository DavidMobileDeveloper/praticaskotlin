package reforco.decisao

/*

Desenvolva um programa que receba um número de 1 a 7 e imprima o dia da semana correspondente
(1 = Domingo, 2 = Segunda-feira, etc.).

Passo a passo:

Solicite ao usuário que insira um número de 1 a 7.
Armazene o número em uma variável.
Use a estrutura when para verificar o valor do número:
Caso o número seja 1, imprima "Domingo".
Caso o número seja 2, imprima "Segunda-feira".
Repita para os outros dias da semana.
Para qualquer outro valor, imprima "Número inválido".

 */

fun main(){
    print("Informe um número de 1 a 7: ")
    val numero = readln().toInt()

    when(numero){
        1 -> println("DOMINGO.")
        2 -> println("SEGUNDA-FEIRA.")
        3 -> println("TERÇA-FEIRA.")
        4 -> println("QUARTA-FEIRA.")
        5 -> println("QUINTA-FEIRA.")
        6 -> println("SEXTA-FEIRA.")
        7 -> println("SÁBADO.")
        else -> println("NÚMERO INVÁLIDO.")
    }
}
