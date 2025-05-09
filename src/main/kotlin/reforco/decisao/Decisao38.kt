package reforco.decisao

/*
Crie um programa que determine o maior de dois números fornecidos pelo usuário usando if
como uma expressão.

Passo a passo:

Solicite ao usuário que insira dois números.
Armazene os números em duas variáveis.
Use if como uma expressão para determinar qual dos dois números é maior.
Atribua o resultado da expressão a uma variável.
Imprima o valor da variável que contém o maior número.

 */


fun main(){
    print("Informe o primeiro número inteiro: ")
    val primeiroNumero = readln().toInt()
    print("Informe o segundo número inteiro: ")
    val segundoNumero = readln().toInt()

    val maiorNumero = if(primeiroNumero > segundoNumero) primeiroNumero else segundoNumero

    println(maiorNumero)
}
