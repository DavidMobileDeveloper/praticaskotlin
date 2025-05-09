package reforco.decisao

fun main(){
    print("Informe uma letra: ")
    val vogal = readln()

    when{
        vogal in "aeiouAEIOU" -> println("VOGAL.")
        else -> println("NÃO É VOGAL.")
    }
}